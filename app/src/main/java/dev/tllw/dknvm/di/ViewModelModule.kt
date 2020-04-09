package dev.tllw.dknvm.di

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.tllw.dknvm.di.factory.FragmentProviderFactory
import dev.tllw.dknvm.di.annotation.ViewModelKey
import dev.tllw.dknvm.features.login.LoginViewModel
import dev.tllw.dknvm.features.welcome.WelcomeViewModel
import dev.tllw.dknvm.di.factory.ViewModelProviderFactory

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    abstract fun bindWelcomeViewModel(viewModel: WelcomeViewModel): ViewModel

    @Binds
    abstract fun bindFragmentFactory(factory: FragmentProviderFactory): FragmentFactory
}
