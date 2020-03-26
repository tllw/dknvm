package dev.tllw.dknvm.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dev.tllw.dknvm.core.DknvmApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilderModule::class
])
interface AppComponent: AndroidInjector<DknvmApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<DknvmApplication>
}
