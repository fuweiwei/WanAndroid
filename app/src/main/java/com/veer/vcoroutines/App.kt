package com.veer.vcoroutines

import android.app.Application
import com.blankj.utilcode.util.ProcessUtils.isMainProcess
import com.blankj.utilcode.util.Utils

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        // 主进程初始化
        if (isMainProcess(this)) {
            init()
        }
    }

    private fun init() {
        Utils.init(this)
    }

}