package dev.tllw.dknvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.core.MainActivity
import dev.tllw.dknvm.core.MainActivityModule

@Module
abstract class ActivitiesModule {

    @ScopeActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}
