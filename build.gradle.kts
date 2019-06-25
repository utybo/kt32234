import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.40")
    id("org.javamodularity.moduleplugin") version "1.5.0"
    application
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compile(kotlin("scripting-jvm-host-embeddable"))
    compile(kotlin("scripting-common"))
    compile(kotlin("scripting-jvm"))
}

application {
    // Define the main class for the application.
    mainClassName = "testing.test.AppKt"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"