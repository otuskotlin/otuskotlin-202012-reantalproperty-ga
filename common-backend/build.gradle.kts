plugins {
    kotlin("jvm") version "1.4.10"
}

group = "org.example"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))
}
