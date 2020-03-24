package dev.tllw.dknvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.features.login.LoginFragment
import dev.tllw.dknvm.features.login.LoginModule
import dev.tllw.dknvm.features.welcome.WelcomeFragment

@Module
abstract class FragmentsModule {

    @ScopeFragment
    @ContributesAndroidInjector(modules=[LoginModule::class, ViewModelModule::class])
    abstract fun bindLoginFragment(): LoginFragment

    @ScopeFragment
    @ContributesAndroidInjector
    abstract fun bindWelcomeFragment(): WelcomeFragment
}
