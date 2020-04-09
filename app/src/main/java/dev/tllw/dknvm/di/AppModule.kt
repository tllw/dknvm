package dev.tllw.dknvm.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dev.tllw.dknvm.data.*
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindRestClient(restClient: StubRestClient): RestClient

    @Binds
    @Singleton
    abstract fun bindAuthClient(authClient: StubAuthClient) : AuthClient

    /*
    Workaround that allows both abstract and concrete annotations in the same Module,
    i.e. both provides and binds. In our case, the code above is exchangeable with

        @Binds
        abstract fun bindNet(net: StubNet): Net

    but not an equivalent as Binds does not generate implementation, therefore is preferable.
    */
    @Module
    companion object {
        @Singleton
        @Provides
        fun provideNet() : Net {
            return StubNet()
        }
    }
}
