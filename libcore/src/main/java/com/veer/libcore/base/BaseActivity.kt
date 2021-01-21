package com.veer.libcore.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * <li>Package: com.veer.libcore.base</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(!isDataBing()){
            setContentView(layoutRes())
        }
    }

    abstract fun layoutRes():Int

    open fun isDataBing() = false
}
