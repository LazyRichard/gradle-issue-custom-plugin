
pluginManagement {
    repositories {
        mavenLocal()
    }
}

includeBuild("build-logic")
include("application") // When I comment out this line, then everything fine.
