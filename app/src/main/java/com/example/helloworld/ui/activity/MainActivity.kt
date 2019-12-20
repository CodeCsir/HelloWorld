package com.example.helloworld.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.helloworld.R
import com.example.helloworld.base.BaseActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        initData()
        initView()
        initListener()
    }

    private fun initData() {

    }

    private fun initView() {

    }

    private fun initListener() {
        button1.setOnClickListener { onButton1Click() }
        button2.setOnClickListener { onButton2Click() }
        button3.setOnClickListener { onButton3Click() }
        window.decorView.setOnSystemUiVisibilityChangeListener {
            Log.d(TAG, "visibility:$it")
        }
    }

    /**
     * 三种全屏选项 https://developer.android.com/training/system-ui/immersive#immersive
     * 粘性沉浸模式
     * 同沉浸模式不同之处在于如果用户从隐藏了系统栏的边缘滑动，系统栏会显示出来，但它们是半透明的，无互动几秒钟后，或者用户在系统栏之外的任何位置轻触或做手势时，系统栏会自动消失。
     */
    private fun onButton3Click() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

    /**
     * 沉浸模式
     * 系统栏隐藏时，从隐藏系统栏的任一边滑动恢复状态栏
     */
    private fun onButton2Click() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE or View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

    /**
     * 向后倾斜模式
     * 系统栏隐藏时，点击屏幕恢复系统栏
     * 场景：观看视频
     */
    private fun onButton1Click() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }

}
