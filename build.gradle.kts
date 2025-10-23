plugins {
    kotlin("jvm") version "2.2.20"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test")) // The Kotlin test library
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of("17")
        vendor = JvmVendorSpec.AMAZON
    }
}