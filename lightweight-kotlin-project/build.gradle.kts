import org.gradle.api.tasks.testing.Test

plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.sample.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.9.0")
}

tasks.test {
    useJUnitPlatform()
}
