package dev.tllw.dknvm.di

import dagger.Module
import dagger.Provides
import dev.tllw.dknvm.ui.TitleProvider

@Module
class ActivityModule {

    @Provides
    @ScopeActivity
    fun provideActivityDependency() = TitleProvider()
}
