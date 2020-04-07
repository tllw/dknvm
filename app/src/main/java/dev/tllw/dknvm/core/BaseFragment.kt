package dev.tllw.dknvm.core

import android.os.Bundle
import androidx.fragment.app.Fragment
import dev.tllw.dknvm.di.AppComponent

open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun getAppComponent() : AppComponent {
        return (activity as MainActivity).getAppComponent()
    }

}
