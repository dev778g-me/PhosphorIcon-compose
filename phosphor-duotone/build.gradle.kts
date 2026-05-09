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
        namespace = "com.phosphor.icons.duotone"
        compileSdk = 36
        minSdk = 24
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

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            api(project(":phosphor-core"))
            api(libs.compose.ui)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

val publishVersion = libs.versions.phosphorVersion.get()

mavenPublishing {
    coordinates(
        groupId = "io.github.dev778g-me",
        artifactId = "phosphoricons-duotone",
        version = publishVersion
    )

    pom {
        name.set("phosphoricons-duotone")
        description.set("Phosphor icon library - duotone variant for Compose Multiplatform")
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
            dependenciesNode.appendNode("dependency").apply {
                appendNode("groupId", "io.github.dev778g-me")
                appendNode("artifactId", "phosphoricons-core")
                appendNode("version", publishVersion)
            }
        }
    }
    publishToMavenCentral(automaticRelease = false)
    signAllPublications()
}