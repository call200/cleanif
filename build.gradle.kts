plugins {
    kotlin("jvm") version "1.9.0" // atau sesuai versimu
    id("com.android.application") version "8.9.2" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false


    alias(libs.plugins.kotlin.android) apply false

}
