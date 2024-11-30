plugins {
    kotlin("jvm") version "2.0.10"
}

group = "ru.tbank.education.school"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}