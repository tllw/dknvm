package dev.tllw.dknvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.core.MainActivity
import dev.tllw.dknvm.di.annotation.ActivityScope

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun bindMainActivity(): MainActivity
}
