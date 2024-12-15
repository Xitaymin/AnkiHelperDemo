plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.demotdd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.deepl.api:deepl-java:1.6.0")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.9.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.11.2")
    testImplementation("io.mockk:mockk:1.13.7")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}