package dev.tllw.dknvm.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.tllw.dknvm.di.annotation.ViewModelKey
import dev.tllw.dknvm.features.login.LoginViewModel
import dev.tllw.dknvm.viewmodel.ViewModelProviderFactory

@Module
public abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey( LoginViewModel::class )
    abstract fun bindLoginViewModel( loginViewModel: LoginViewModel): ViewModel
}
