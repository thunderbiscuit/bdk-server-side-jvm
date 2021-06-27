plugins {
    kotlin("jvm") version "1.5.20"
    application
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.0-jre")

    // bitcoindevkit
    implementation("org.bitcoindevkit:bdk:0.0.1-SNAPSHOT")

    // test dependencies
    testImplementation("junit:junit:4.13.2")
}

application {
    mainClass.set("bdkserverside.jvm.AppKt")
}
