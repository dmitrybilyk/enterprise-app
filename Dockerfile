# Stage 1: Build Frontend
FROM node:20-alpine AS frontend-build
WORKDIR /app/frontend
# Копіюємо package.json саме з папки frontend
COPY frontend/package*.json ./
RUN npm install
COPY frontend/ .
RUN npm run build

# Stage 2: Build Backend (Java)
FROM gradle:8-jdk17 AS backend-build
WORKDIR /app
# Копіюємо весь корінь (включаючи settings.gradle.kts та build-logic)
COPY . .
# Важливо: Створюємо папку static, якщо її немає, і копіюємо туди білд фронта
RUN mkdir -p backend/src/main/resources/static
COPY --from=frontend-build /app/frontend/dist backend/src/main/resources/static

# Використовуємо gradle wrapper з проекту для збірки конкретного модуля
RUN ./gradlew :backend:bootJar --no-daemon

# Stage 3: Final Image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Шлях до JAR залежить від назви вашого модуля в settings.gradle.kts
COPY --from=backend-build /app/backend/build/libs/*.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]