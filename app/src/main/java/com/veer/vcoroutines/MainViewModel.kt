package com.veer.vcoroutines

import androidx.databinding.ObservableField
import com.blankj.utilcode.util.ToastUtils
import com.veer.libcore.base.BaseViewModel
import com.veer.libnet.api.VRetrofitClient

/**
 * <li>Package: com.veer.vcoroutines</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
class MainViewModel: BaseViewModel(){
    val content = ObservableField<String>()
    suspend fun test() = VRetrofitClient.service.getProjectCategories().apiData()

    fun mainTest(){
        launch(
            block = {
             val list =   test()
                ToastUtils.showShort(list.size.toString())
                content.set(list.size.toString())
            },
            error = {
                ToastUtils.showShort(it.toString())
            }

        )
    }

}