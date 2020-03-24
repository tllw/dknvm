package dev.tllw.dknvm.core

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.tllw.dknvm.data.RestClient
import dev.tllw.dknvm.di.DaggerAppComponent
import javax.inject.Inject

class DknvmApplication : DaggerApplication() {

    @Inject
    lateinit var restClient: RestClient

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
