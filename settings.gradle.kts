rootProject.name = "otus-kotlin-rentalproperty"
include("otus-kotlin-ra-common-backend")
include("otus-kotlin-ra-transport-main-openapi")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val openApiVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        id("org.openapi.generator") version openApiVersion
    }
}
