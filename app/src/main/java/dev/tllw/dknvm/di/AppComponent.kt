package dev.tllw.dknvm.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.tllw.dknvm.core.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    ViewModelModule::class,
    FragmentsBuilderModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun injectMainActivity(mainActivity: MainActivity)
}
