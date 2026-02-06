plugins {
    id("com.github.node-gradle.node")
}

node {
    // Use system-installed Node
    download.set(false)

    // Versions are still declared for reproducibility
    version.set("20.20.0")
    yarnVersion.set("1.22.19")
}

tasks.register<com.github.gradle.node.yarn.task.YarnTask>("yarnInstall") {
    group = "build"
    description = "Install frontend dependencies"
    args.set(listOf("install", "--registry", "http://localhost:4873"))
    inputs.file("package.json")
    outputs.dir("node_modules")
}

tasks.register<com.github.gradle.node.yarn.task.YarnTask>("yarnBuild") {
    group = "build"
    description = "Build frontend"
    dependsOn("yarnInstall")
    args.set(listOf("build"))

    inputs.dir("src")
    inputs.file("package.json")
    outputs.dir("dist")
}

tasks.register<com.github.gradle.node.yarn.task.YarnTask>("yarnTest") {
    group = "verification"
    description = "Run frontend tests"
    dependsOn("yarnInstall")
    args.set(listOf("test"))
}
