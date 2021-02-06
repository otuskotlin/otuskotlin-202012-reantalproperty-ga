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
    testImplementation("org.mockito:mockito-core:${property("mockitoVersion")}")
    testImplementation("io.kotest:kotest-runner-junit5:${property("kotestVersion")}")
    testImplementation("io.kotest:kotest-assertions-core:${property("kotestVersion")}")
}

tasks {
    test {
        useJUnitPlatform()
    }

}