package dev.tllw.dknvm.features.login

import dagger.Subcomponent

@Subcomponent(
    modules = [
        LoginModule::class
    ])
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory
    {
        fun create(): LoginComponent
    }

}
