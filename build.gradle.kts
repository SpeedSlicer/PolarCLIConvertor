plugins {
    id("java")
    application
    id("com.gradleup.shadow") version "8.3.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("dev.hollowcube:polar:1.16.0")
    implementation("net.minestom:minestom:2026.06.05-26.1.2")
    implementation("org.slf4j:slf4j-simple:2.0.13")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

application {
    mainClass.set("dev.speedslicer.convertor.Main")
}

tasks.shadowJar {
    archiveBaseName.set("PolarCLIConvertor")
}
