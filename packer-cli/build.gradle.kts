plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

dependencies {
    implementation(project(":packer-core"))
    implementation(libs.clikt)
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.cyberarmor.cli.MainKt")
    applicationName = "cyberarmor"
}
