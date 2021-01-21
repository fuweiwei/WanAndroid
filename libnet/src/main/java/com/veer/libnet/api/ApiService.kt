package com.veer.libnet.api

import com.veer.libnet.bean.Category
import retrofit2.http.GET

/**
 * <li>Package: com.veer.libnet.api</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
interface ApiService {
    companion object {
        const val BASE_URL = "https://www.wanandroid.com"
    }
    @GET("project/tree/json")
    suspend fun getProjectCategories(): ApiResult<MutableList<Category>>
}