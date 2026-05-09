import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKotlinMultiplatformLibrary)
    alias(libs.plugins.androidLint)
    id("maven-publish")
    id("com.vanniktech.maven.publish") version "0.36.0"
}

kotlin {

    androidLibrary {
        namespace = "com.dev.phosphorlibrary"
        compileSdk = 36
        minSdk = 24

        withHostTestBuilder {
        }

        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }.configure {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    jvm()

    js {
        browser()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.executable()
    }

    val xcfName = "librayKit"

    iosX64 {
        binaries.framework {
            baseName = xcfName
        }
    }

    iosArm64 {
        binaries.framework {
            baseName = xcfName
        }
    }

    iosSimulatorArm64 {
        binaries.framework {
            baseName = xcfName
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)
                api(libs.compose.ui)
                api(libs.compose.foundation)
                api(project(":phosphor-core"))
                api(project(":phosphor-thin"))
                api(project(":phosphor-light"))
                api(project(":phosphor-regular"))
                api(project(":phosphor-bold"))
                api(project(":phosphor-filled"))
                api(project(":phosphor-duotone"))
            }
        }

        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }

        androidMain {
            dependencies {
            }
        }

        getByName("androidDeviceTest") {
            dependencies {
                implementation(libs.androidx.runner)
                implementation(libs.androidx.core)
                implementation(libs.androidx.testExt.junit)
            }
        }

        iosMain {
            dependencies {
            }
        }
    }

}

val publishVersion = libs.versions.phosphorVersion.get()

mavenPublishing {
    coordinates(
        groupId = "io.github.dev778g-me",
        artifactId = "phosphoricon-compose",
        version = publishVersion
    )

    pom {
        name.set("phosphoricon-compose")
        description.set("phosphor icon library for compose multiplatform")
        inceptionYear.set("2026")
        url.set("https://github.com/dev778g-me/PhosphorIcon-compose")

        developers {
            developer {
                id.set("dev778g-me")
                name.set("dev")
                email.set("sanji778g@gmail.com")
            }
        }

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        scm {
            url.set("https://github.com/dev778g-me/PhosphorIcon-compose")
        }

        withXml {
            val dependenciesNode = asNode().appendNode("dependencies")
            listOf("core", "thin", "light", "regular", "bold", "filled", "duotone").forEach { artifact ->
                dependenciesNode.appendNode("dependency").apply {
                    appendNode("groupId", "io.github.dev778g-me")
                    appendNode("artifactId", "phosphoricons-$artifact")
                    appendNode("version", publishVersion)
                }
            }
        }
    }
    publishToMavenCentral(automaticRelease = false)
    signAllPublications()
}