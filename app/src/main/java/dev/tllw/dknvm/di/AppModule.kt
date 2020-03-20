package dev.tllw.dknvm.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.core.DknvmApplication
import dev.tllw.dknvm.core.MainActivity
import dev.tllw.dknvm.data.Net
import dev.tllw.dknvm.data.RestClient
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun providesApplication(app: DknvmApplication): Context = app.applicationContext

    @Singleton
    @Provides
    fun provideNet() = Net()

    @Singleton
    @Provides
    fun providesRestClient(net: Net) = RestClient(net)
}
