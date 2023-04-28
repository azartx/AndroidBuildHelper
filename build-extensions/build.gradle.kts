plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `java-library`
}

gradlePlugin {
    plugins {
        create("build-extensions") {
            id = "build-extensions"
            implementationClass = "dev.solo4.androidbuildhelper.BuildHelper"
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    /*implementation(gradleApi())
    implementation(localGroovy())*/
}