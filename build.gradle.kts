plugins {
    val kotlinVersion = "1.4.10"
    kotlin("jvm") version kotlinVersion apply false
}
repositories {
    mavenCentral()
}

allprojects {
    group = "org.example"
    version = "0.1"

}


