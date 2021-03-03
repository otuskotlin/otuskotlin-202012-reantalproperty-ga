rootProject.name = "otus-kotlin-rentalproperty"
include("otus-kotlin-ra-common-backend")
include("otus-kotlin-ra-transport-main-openapi")
include("otus-kotlin-ra-transport-main-mp")
include("otus-kotlin-ra-mappers-mp")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val openApiVersion: String by settings

        kotlin("multiplatform") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion
        kotlin("jvm") version kotlinVersion apply false
        kotlin("js") version kotlinVersion apply false
        kotlin("kapt") version kotlinVersion
        id("org.openapi.generator") version openApiVersion
    }
}
