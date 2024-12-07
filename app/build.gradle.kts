plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    kotlin("kapt")

}
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }


}


android {
    namespace = "com.example.myrecepies"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myrecepies"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.io.coil.kt)
    implementation(libs.compose.runtime)
    implementation(libs.compose.foundation)
    implementation(libs.accompanist.pager.indicators)
    implementation(libs.navigationCompose)
    implementation(libs.accompanist.pager)
    implementation(libs.airbnb.lottie)
    implementation(libs.constraintlayout.compose)
    implementation(libs.androidx.material3.android)
    implementation("androidx.palette:palette:1.0.0")
    implementation("com.github.Gurupreet:FontAwesomeCompose:1.0.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.0") // Update version if needed
    implementation("androidx.compose.ui:ui-tooling:1.6.0")
    implementation(libs.androidx.junit.ktx) // For interactive preview in Android Studio


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}