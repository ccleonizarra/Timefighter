package com.example.timefighter

import android.app.Application
import com.example.timefighter.data.AppContainer
import com.example.timefighter.data.DefaultAppContainer

class MainApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}