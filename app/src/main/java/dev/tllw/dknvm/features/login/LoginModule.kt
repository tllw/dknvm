package dev.tllw.dknvm.features.login

import dagger.Binds
import dagger.Module
import dev.tllw.dknvm.data.AuthClient
import dev.tllw.dknvm.data.StubAuthClient

@Module
abstract class LoginModule {

    @Binds
    @LoginScope
    abstract fun bindAuthClient(authClient: StubAuthClient) : AuthClient
}
