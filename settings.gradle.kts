rootProject.name = "cyberarmor"

include(
    "packer-core",
    "packer-cli",
)

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}
