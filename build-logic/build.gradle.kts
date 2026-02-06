plugins {
    `kotlin-dsl`   // already good
    // optional but useful: `kotlin-dsl-precompiled-script-plugins` // if you want explicit precompiled support
}

repositories {
    mavenCentral()
    gradlePluginPortal()   // important for most plugins
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.3.2")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.6")

    // Correct way for gradle-node-plugin (use the :gradle.plugin suffix)
    // Latest is 7.1.0 as of Sep 2024 – update from your 7.0.2 if desired
    implementation("com.github.node-gradle.node:com.github.node-gradle.node.gradle.plugin:7.1.0")
}