package com.example.admin.mykatlin

import android.app.Application
import kotlin.properties.Delegates

/**
 * Created by admin on 2017/11/3.
 */
class App : Application() {
    companion object {
        var instance: App by Delegates.notNull()
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}