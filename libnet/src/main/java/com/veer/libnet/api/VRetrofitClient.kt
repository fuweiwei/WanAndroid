package com.veer.libnet.api

import com.blankj.utilcode.util.Utils
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.io.File


/**
 * <li>Package: com.veer.libnet.api</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description:具体实现Retrofit的单例</li>
 */
object VRetrofitClient : BaseRetrofitClient() {
    /**service */
    val service by lazy { getService(ApiService::class.java, ApiService.BASE_URL) }
    /**Cookie 持久化*/
    private val cookieJar by lazy { PersistentCookieJar(SetCookieCache(), SharedPrefsCookiePersistor(Utils.getApp())) }

    override fun handleBuilder(builder: OkHttpClient.Builder) {
        val httpCacheDirectory = File(Utils.getApp().cacheDir, "responses")
        val cacheSize = 10 * 1024 * 1024L // 10 MiB
        val cache = Cache(httpCacheDirectory, cacheSize)
        builder.cache(cache)
                .cookieJar(cookieJar)
    }
    /**清除Cookie*/
    fun clearCookie() = cookieJar.clear()

}