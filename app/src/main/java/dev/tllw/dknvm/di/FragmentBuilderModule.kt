package dev.tllw.dknvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.tllw.dknvm.features.login.LoginFragment
import dev.tllw.dknvm.features.login.LoginModule
import dev.tllw.dknvm.features.login.LoginScope
import dev.tllw.dknvm.features.welcome.WelcomeFragment
import dev.tllw.dknvm.features.welcome.WelcomeModule
import dev.tllw.dknvm.features.welcome.WelcomeScope

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [LoginModule::class])
    @LoginScope
    abstract fun bindLoginFragment(): LoginFragment

    @ContributesAndroidInjector(modules = [WelcomeModule::class])
    @WelcomeScope
    abstract fun bindWelcomeFragment(): WelcomeFragment
}
