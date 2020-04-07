package dev.tllw.dknvm.core

import android.app.Application
import dev.tllw.dknvm.di.AppComponent
import dev.tllw.dknvm.di.DaggerAppComponent

class DknvmApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppComponent()

    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}
