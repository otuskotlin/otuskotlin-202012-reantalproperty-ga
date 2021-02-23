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

    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.okhttp3:okhttp:4.2.2")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.0")
}

openApiGenerate {
    val basePackage = "${project.group}.transport.openapi"
    packageName.set(basePackage)
    generatorName.set("kotlin")
    configOptions.apply {
        put("library", "jvm-okhttp4")
        put("requestDateConverter", "toString")
    }
    inputSpec.set("${rootProject.projectDir}/specs/advertisement.yaml")
//    inputSpec.set("${rootProject.projectDir}/specs/ra-base-api.yaml")
}

sourceSets.main {
    java.srcDirs("$buildDir/generate-resources/main/src/main/kotlin")
}

tasks {
    compileKotlin.get().dependsOn(openApiGenerate)
}