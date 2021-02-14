rootProject.name = "otus-kotlin-rentalproperty"
include("otus-kotlin-ra-common-backend")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
    }
}
