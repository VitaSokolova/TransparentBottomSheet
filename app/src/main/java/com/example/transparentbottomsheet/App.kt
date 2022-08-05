package com.example.transparentbottomsheet

import android.app.Application

/**
 * @author v.sokolova
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // This is for registering the listener object
        registerActivityLifecycleCallbacks(ActivityLifecycleListener)
        // This is for registering the listener class
        // registerActivityLifecycleCallbacks(ActivityLifecycleHandler(this))
    }
}
