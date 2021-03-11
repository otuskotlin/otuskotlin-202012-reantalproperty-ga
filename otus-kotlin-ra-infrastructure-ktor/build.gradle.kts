
val ktorVersion: String by project
val logbackVersion: String by project


plugins {
    application
    kotlin("jvm")
    kotlin("plugin.serialization")
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}


dependencies {
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-serialization:$ktorVersion")
    implementation("io.ktor:ktor-server-host-common:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("org.projectlombok:lombok:1.18.16")
    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")
    implementation(project(":otus-kotlin-ra-transport-main-openapi"))
    implementation(project(":otus-kotlin-ra-transport-main-mp"))
    implementation(project(":otus-kotlin-ra-common-backend"))
    implementation(project(":otus-kotlin-ra-mappers-mp"))

}
