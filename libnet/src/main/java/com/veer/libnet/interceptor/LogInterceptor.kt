package com.veer.libnet.interceptor

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response
import java.text.SimpleDateFormat
import java.util.*


/**
 * <li>Package: com.veer.libnet.core</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
class LogInterceptor : Interceptor {

    val tag = "okhttp"
    val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")

    override fun intercept(chain: Interceptor.Chain): Response {

        var request = chain.request()


            request = request.newBuilder()
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .build();

        Log.i(
            tag,
            format.format(Date()) + " Requeste " + "\nmethod:" + request.method + "\nurl:" + request.url + "\nbody:" + request.body.toString()
        )
//
        var response = chain.proceed(request)

        //response.peekBody不会关闭流
        Log.i(
            tag,
            format.format(Date()) + " Response " + "\nsuccessful:" + response.isSuccessful + "\nbody:" + response.peekBody(
                1024
            )?.string()
        )


        return response
    }

}