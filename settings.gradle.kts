pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "iOS17Launcher"

include(":app")
include(":core-ui")
include(":core-data")
include(":feature-home")
include(":feature-dock")
include(":feature-applibrary")
include(":feature-spotlight")
include(":feature-widgets")
include(":feature-controlcenter")
include(":feature-notifications")
include(":feature-settings")
