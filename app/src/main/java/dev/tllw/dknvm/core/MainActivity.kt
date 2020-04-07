package dev.tllw.dknvm.core

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import dev.tllw.dknvm.R
import dev.tllw.dknvm.data.RestClient
import dev.tllw.dknvm.di.AppComponent
import javax.inject.Inject

class MainActivity : FragmentActivity() {

    @Inject
    lateinit var restClient: RestClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject()
        restClient.connect()
    }

    fun inject() {
        getAppComponent().injectMainActivity(this)
    }

    fun getAppComponent(): AppComponent {
        return (application as DknvmApplication).appComponent
    }
}
