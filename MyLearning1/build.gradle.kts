plugins {
    kotlin("jvm") version "2.2.20"
}

group = "com.sukhee.miu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
