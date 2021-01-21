package com.veer.vcoroutines

import com.blankj.utilcode.util.ToastUtils
import com.veer.libnet.api.VRetrofitClient
import com.veer.vcoroutines.base.BaseViewModel

/**
 * <li>Package: com.veer.vcoroutines</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
class MainViewModel:BaseViewModel(){
    suspend fun test() =
        VRetrofitClient.service.getProjectCategories().apiData()
    fun mainTest(){
        launch(
            block = {
             val list =   test()
                ToastUtils.showShort(list.size.toString())
            },
            error = {
                ToastUtils.showShort(it.toString())
            }

        )
    }

}