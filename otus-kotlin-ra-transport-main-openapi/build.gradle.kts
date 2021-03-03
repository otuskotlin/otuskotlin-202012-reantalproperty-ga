val serializationVersion: String by project
plugins {
    kotlin("jvm")
    id("org.openapi.generator")
}

group = project.group
version = project.version

repositories {
    mavenCentral()
}

dependencies {
    val kotlinVersion: String by project
    val gsonVersion: String by project
    val okHttpVersion:String by project
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))
    implementation ("com.google.code.gson:gson:$gsonVersion")
    implementation("com.squareup.okhttp3:okhttp:$okHttpVersion")
}

openApiGenerate {
    val basePackage = "${project.group}.transport.openapi"
    packageName.set(basePackage)
    generatorName.set("kotlin")
    sourceSets{outputDir.set("${project.projectDir}/src/main/kotlin/openapi")}

    configOptions.apply {
        put("serializableModel","true")
        put("serializationLibrary","gson")
    }

    inputSpec.set("${rootProject.projectDir}/specs/advertisement.yaml")
}

sourceSets.main {
    java.srcDirs("$buildDir/generate-resources/main/src/main/kotlin")
}

tasks {
    compileKotlin.get().dependsOn(openApiGenerate)
}