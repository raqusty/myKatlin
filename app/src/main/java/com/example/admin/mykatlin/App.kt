package com.example.admin.mykatlin

import android.app.Application

/**
 * Created by admin on 2017/11/3.
 */
class App : Application() {
    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}