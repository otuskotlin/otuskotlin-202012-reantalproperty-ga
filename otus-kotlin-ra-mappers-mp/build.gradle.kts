plugins {
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    val mockitoVersion: String by project
    val mapstructVersion: String by project
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))
    implementation("org.mapstruct:mapstruct:$mapstructVersion")

    implementation("org.mapstruct:mapstruct-jdk8:$mapstructVersion")
    kapt("org.mapstruct:mapstruct-processor:$mapstructVersion")
    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    implementation(project(":otus-kotlin-ra-transport-main-openapi"))
    implementation(project(":otus-kotlin-ra-transport-main-mp"))
    implementation(project(":otus-kotlin-ra-common-backend"))
}