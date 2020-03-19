package dev.tllw.dknvm.core

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dev.tllw.dknvm.di.DaggerAppComponent

class DknvmApplication : DaggerApplication() {

        override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
            return DaggerAppComponent.factory().create(this)
        }
}
