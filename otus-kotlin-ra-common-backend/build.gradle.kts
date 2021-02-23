plugins {
    kotlin("jvm")
}

dependencies {
    val mockitoVersion: String by project
    val kotestVersion: String by project
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))
    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

tasks {
    test {
        useJUnitPlatform()
    }

}