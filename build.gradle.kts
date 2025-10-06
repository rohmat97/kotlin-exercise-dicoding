plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}

// Custom tasks to run each exercise individually
tasks.register<JavaExec>("runLatihan1") {
    dependsOn(tasks.compileKotlin)
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("Latihan1_TipeData.Exercise1Kt")
}

tasks.register<JavaExec>("runLatihan2") {
    dependsOn(tasks.compileKotlin)
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("Latihan2.ControlFlow.Exercise2Kt")
}

tasks.register<JavaExec>("runLatihan3") {
    dependsOn(tasks.compileKotlin)
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("Latihan3.Collections.Exercise3Kt")
}

tasks.register<JavaExec>("runLatihan4") {
    dependsOn(tasks.compileKotlin)
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("Latihan4.OOP.Exercise4Kt")
}

tasks.register<JavaExec>("runLatihan5") {
    dependsOn(tasks.compileKotlin)
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("Latihan5.Coroutines.Exercise5Kt")
}

application {
    mainClass.set("MainKt")
}
