package dev.tllw.dknvm.core

import dagger.Module
import dagger.Provides
import dev.tllw.dknvm.di.ScopeActivity
import dev.tllw.dknvm.ui.TitleProvider

@Module
class MainActivityModule {

    @Provides
    @ScopeActivity
    fun provideActivityDependency() = TitleProvider()
}
