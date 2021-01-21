object Versions {
    const val gradleVersion = "4.1.1"
    const val kotlinVersion = "1.4.20"

    const val coroutinesVersion = "1.4.2"

    const val applicationId = "com.veer.vcoroutines"
    const val buildToolsVersion = "30.0.3"
    const val compileSdkVersion = 30
    const val minSdkVersion = 23
    const val targetSdkVersion = 30
    const val versionCode = 23
    const val versionName = "1.0.0"

    const val junitVersion = "4.13.1"
    const val runnerVersion = "1.0.2"
    const val espressoVersion = "3.0.2"

    const val materialVersion = "1.2.1"

    const val coreVersion = "1.3.2"
    const val activityVersion = "1.1.0"
    const val fragmentVersion = "1.2.5"
    const val appCompatVersion = "1.2.0"

    const val constraintLayoutVersion = "2.0.4"
    const val coordinatorLayoutVersion = "1.1.0"
    const val swipeRefreshLayoutVersion = "1.1.0"
    const val recyclerViewVersion = "1.1.0"

    const val lifecycleVersion = "2.2.0"
    const val roomVersion = "2.2.5"

    const val retrofitVersion = "2.9.0"
    const val retrofit_converter_gson = "2.6.2"
    const val okHttpVersion = "4.9.0"
    const val moshiVersion = "1.11.0"
    const val PersistentCookieJarVersion = "v1.0.1"

    const val coilVersion = "1.0.0"

    const val brvhaVersion = "3.0.6"

    const val flowLayoutVersion = "1.1.2"

    const val agentWebVersion = "4.1.4"

    const val liveEventBusVersion = "1.7.2"

    const val bannerVersion = "1.4.10"
    const val utilcodexVersion = "1.30.5"
}

object Dependencies {


    const val junit =   "junit:junit:${Versions.junitVersion}"
    const val test_runner =  "com.android.support.test:runner:${Versions.runnerVersion}"
    const val test_espresso =   "com.android.support.test.espresso:espresso-core:${Versions.espressoVersion}"

    //kotlin
    const val kotlinStdlib =  "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val kotlin_coroutines =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val coreKtx =  "androidx.core:core-ktx:${Versions.coreVersion}"

    //androidx
    const val material =  "com.google.android.material:material:${Versions.materialVersion}"
    const val appcompat =  "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val activityKtx =  "androidx.activity:activity-ktx:${Versions.activityVersion}"
    const val fragmentKtx =  "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"
    const val constraintlayout =  "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val coordinatorlayout =  "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinatorLayoutVersion}"
    const val swiperefreshlayout =  "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayoutVersion}"
    const val recyclerview =  "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"

    const val lifecycle_process =  "androidx.lifecycle:lifecycle-process:${Versions.lifecycleVersion}"
    const val lifecycle_runtime =  "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val lifecycle_viewmodel =  "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val lifecycle_livedata =  "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"

    const val room_runtime =  "androidx.room:room-runtime:${Versions.roomVersion}"
    const val room_ktx =  "androidx.room:room-ktx:${Versions.roomVersion}"
    const val room_compiler =  "androidx.room:room-compiler:${Versions.roomVersion}"

    // network
    const val okhttp =  "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okhttp_interceptor =  "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
    const val retrofit =  "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val PersistentCookieJar = "com.github.franmontiel:PersistentCookieJar:${Versions.PersistentCookieJarVersion}"

    const val moshi =  "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    const val moshi_kotlin =  "com.squareup.moshi:moshi-kotlin:${Versions.moshiVersion}"

    const val coil =  "io.coil-kt:coil:${Versions.coilVersion}"
    const val oil_gif =  "io.coil-kt:coil-gif:${Versions.coilVersion}"
    const val oil_svg =  "io.coil-kt:coil-svg:${Versions.coilVersion}"
    const val oil_video =  "io.coil-kt:coil-video:${Versions.coilVersion}"

    //third工具
    const val baseRecyclerViewAdapterHelper =  "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.brvhaVersion}"
    const val flowlayout =  "com.hyman:flowlayout-lib:${Versions.flowLayoutVersion}"
    const val agentweb =  "com.just.agentweb:agentweb:${Versions.agentWebVersion}"
    const val banner =  "com.youth.banner:banner:${Versions.bannerVersion}"
    const val utilcodex =  "com.blankj:utilcodex:${Versions.utilcodexVersion}"


    const val libnet =  ":libnet"
    const val libcore =  ":libcore"


}