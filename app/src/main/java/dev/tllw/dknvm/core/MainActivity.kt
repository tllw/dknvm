package dev.tllw.dknvm.core

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentFactory
import dev.tllw.dknvm.R
import dev.tllw.dknvm.data.RestClient
import dev.tllw.dknvm.di.AppComponent
import javax.inject.Inject

class MainActivity : FragmentActivity() {

    @Inject
    lateinit var restClient: RestClient

    @Inject
    lateinit var fragmentFactory: FragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        supportFragmentManager.fragmentFactory = fragmentFactory
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        restClient.connect()
    }

    fun inject() {
        getAppComponent().injectMainActivity(this)
    }

    fun getAppComponent(): AppComponent {
        return (application as DknvmApplication).appComponent
    }
}
