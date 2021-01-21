package com.veer.libnet.api

/**
 * <li>Package: com.veer.libnet.api</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
class ApiException(var code: Int, override var message: String) : RuntimeException()