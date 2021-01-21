package com.veer.libnet.api

import com.blankj.utilcode.util.Utils
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor
import com.veer.libnet.core.LogInterceptor
import com.veer.libnet.core.MoshiHelper
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * <li>Package: com.veer.libnet.api</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
object RetrofitClient {

    /**Cookie 持久化*/
    private val cookiePersistor = SharedPrefsCookiePersistor(Utils.getApp())
    private val cookieJar = PersistentCookieJar(SetCookieCache(), cookiePersistor)

    /**log**/
    private val logInterceptor = LogInterceptor()

    /**OkhttpClient*/
    private val okHttpClient = OkHttpClient.Builder()
        .callTimeout(10, TimeUnit.SECONDS)
        .addNetworkInterceptor(logInterceptor)
        .build()

    /**Retrofit*/
    private val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(ApiService.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(MoshiHelper.moshi))
        .build()

    /**ApiService*/
    val apiService: ApiService = retrofit.create(ApiService::class.java)

    /**清除Cookie*/
    fun clearCookie() = cookieJar.clear()

    /**是否有Cookie*/
    fun hasCookie() = cookiePersistor.loadAll().isNotEmpty()
}