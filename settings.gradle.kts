pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven(url = "https://jitpack.io")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "rust-plugin"
