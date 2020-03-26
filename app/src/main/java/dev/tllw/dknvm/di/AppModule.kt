package dev.tllw.dknvm.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import dev.tllw.dknvm.core.DknvmApplication
import dev.tllw.dknvm.data.Net
import dev.tllw.dknvm.data.RestClient
import dev.tllw.dknvm.data.StubNet
import dev.tllw.dknvm.data.StubRestClient
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindContext(application: DknvmApplication): Application

    @Binds
    @Singleton
    abstract fun bindRestClient(restClient: StubRestClient): RestClient

//    @Binds
//    @Singleton
//    abstract fun bindUserSession(userSession: UserSessionImpl): UserSession

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
