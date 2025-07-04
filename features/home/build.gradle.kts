plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bina.features.home"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        targetSdk = 35
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":core:network"))
    implementation(project(":core:desingsystem"))
    // Dependências AndroidX essenciais
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    // Dependências para ViewModel e LiveData
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.1")
    // Dependência para Koin (injeção de dependência)
    implementation("io.insert-koin:koin-android:3.5.6")
}
