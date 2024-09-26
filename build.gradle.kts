
plugins {
    kotlin("jvm") version "2.0.20"
    id("tech.medivh.plugin.gradle") version "0.0.1"

}

medivh {
    include("tech.medivh.demo.kotlin")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
