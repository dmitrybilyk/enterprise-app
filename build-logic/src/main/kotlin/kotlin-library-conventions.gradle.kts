plugins {
    java
    kotlin("jvm")
//    id("io.spring.dependency-management")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
