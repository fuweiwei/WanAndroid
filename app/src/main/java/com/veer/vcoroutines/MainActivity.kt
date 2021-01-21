package com.veer.vcoroutines

import com.veer.libcore.base.BaseVmActivity
import com.veer.vcoroutines.databinding.ActivityMainBinding

/**
 * <li>Package: com.veer.vcoroutines</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
class MainActivity : BaseVmActivity<MainViewModel,ActivityMainBinding>() {
    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        super.initData()
        mViewModel.content.set("11111")
        mViewModel.mainTest()

    }

    override fun initVariableId(): Int {
            return BR.data
    }
}