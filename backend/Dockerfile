# Step 1: Use a lightweight JRE image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled JAR from your host to the container
# Replace 'app.jar' with your actual jar name or use a wildcard
COPY build/libs/*.jar app.jar

# Step 4: Expose the port your Spring app runs on (usually 8080)
EXPOSE 8085

# Step 5: Define the command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]