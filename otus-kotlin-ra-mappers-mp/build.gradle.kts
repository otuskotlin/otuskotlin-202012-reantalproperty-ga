plugins {
    kotlin("jvm")
}

dependencies {
    val mockitoVersion: String by project
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))

    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    implementation(project(":otus-kotlin-ra-transport-main-openapi"))
    implementation(project(":otus-kotlin-ra-transport-main-mp"))
    implementation(project(":otus-kotlin-ra-common-backend"))
}