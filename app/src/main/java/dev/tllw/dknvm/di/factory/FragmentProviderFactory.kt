package dev.tllw.dknvm.di.factory

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import dev.tllw.dknvm.data.RestClient
import dev.tllw.dknvm.features.login.LoginFragment
import dev.tllw.dknvm.features.welcome.WelcomeFragment
import javax.inject.Inject

class FragmentProviderFactory @Inject constructor(
    private val viewModelFactory: ViewModelProviderFactory,
    restClient: RestClient): FragmentFactory() {

    init {
        Log.d("qqq", "FragmentProviderFactory $this")
    }

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        Log.d("qqq", "FragmentProviderFactory instantiate")

        return when (className) {
            LoginFragment::class.java.name -> LoginFragment(viewModelFactory)
            WelcomeFragment::class.java.name -> {
                WelcomeFragment(viewModelFactory)
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}
