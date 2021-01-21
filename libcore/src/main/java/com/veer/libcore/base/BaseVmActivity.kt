package com.veer.libcore.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

/**
 * <li>Package: com.veer.libcore.base</li>
 * <li>Author: Veer</li>
 * <li>Date:  2021/1/21</li>
 * <li>Description: </li>
 */
abstract class BaseVmActivity<VM : BaseViewModel, DB : ViewDataBinding> : BaseActivity() {

    protected open lateinit var mViewModel: VM
    protected open lateinit var mDataBing: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        initDataBing()
        observe()
        initView()
        initData()
    }

    override fun isDataBing()=true

    /**
     * 初始化ViewModel
     */
    private fun initViewModel() {
        mViewModel = ViewModelProvider(this).get(getTClass())
    }
    /**
     * 初始化DataBing
     */
    private fun initDataBing() {
        mDataBing = DataBindingUtil.setContentView(this, layoutRes())
        mDataBing.apply {
            lifecycleOwner = this@BaseVmActivity
        }
        mDataBing.setVariable(initVariableId(),mViewModel)
    }

    /**
     * 获取泛型对相应的Class对象
     * @return
     */
     open fun getTClass(): Class<VM>{
        //返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。
        val type =
            this.javaClass.genericSuperclass as ParameterizedType
        //返回表示此类型实际类型参数的 Type 对象的数组()，想要获取第二个泛型的Class，所以索引写1
        return type.actualTypeArguments[0] as Class<VM> //<T>
    }

    /**
     * 订阅，LiveData、Bus
     */
    open fun observe() {
        // 登录失效，跳转登录页
        mViewModel.loginStatusInvalid.observe(this, Observer{
            if (it) {

            }
        })
    }

    /**
     * 数据初始化相关
     */
    open fun initView() {
        // Override if need
    }

    /**
     * 懒加载数据
     */
    open fun initData() {
        // Override if need
    }
    /**
     * view 的 variable 的 model id
     * databing和viewModel建立关系
     * @return
     */
    abstract fun initVariableId(): Int

}
