package com.example.helloworld.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBaseConfig()
    }

    private fun initBaseConfig() {
        // 设置状态栏字体颜色，SYSTEM_UI_FLAG_LIGHT_STATUS_BAR：状态栏亮色主题，字体是暗色；SYSTEM_UI_FLAG_VISIBLE：状态栏暗色主题，字体是亮色
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
}