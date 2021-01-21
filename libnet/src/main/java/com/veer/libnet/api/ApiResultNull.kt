package com.veer.libnet.api


/**
 * <li>Package: com.veer.libnet.api</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
data class ApiResultNull(var code: Int =-1, var message: String) {
    fun apiData():Int{
        if (0==code) {
            return code
        } else {
            throw ApiException(code, message)
        }
    }
}
