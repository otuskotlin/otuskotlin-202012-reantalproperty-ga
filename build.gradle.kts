plugins{
    kotlin("multiplatform") apply false
    kotlin("jvm") apply false
    kotlin("js") apply false
}
subprojects {
    group = rootProject.group
    version = rootProject.version
    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-js-wrappers") }
    }
}

allprojects {
    group = "org.example"
    version = "0.1"

}


