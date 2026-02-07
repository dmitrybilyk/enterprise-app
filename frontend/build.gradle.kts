plugins {
    id("node-application-conventions")
}

tasks.register<com.github.gradle.node.task.NodeTask>("runHello") {
    script.set(file("hello.js"))
}


