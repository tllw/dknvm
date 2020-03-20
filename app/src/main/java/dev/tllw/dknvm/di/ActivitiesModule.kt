package dev.tllw.dknvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.core.MainActivity

@Module
abstract class ActivitiesModule {

    @ScopeActivity
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}