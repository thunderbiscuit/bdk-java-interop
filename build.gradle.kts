plugins {
    id("java")
}

group = "org.sandbox"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.bitcoindevkit:bdk-jvm:0.11.0")
    implementation("net.java.dev.jna:jna:5.12.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
