package dev.tllw.dknvm.features.welcome

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import dev.tllw.dknvm.R
import dev.tllw.dknvm.core.BaseFragment
import dev.tllw.dknvm.databinding.FragmentWelcomeBinding
import dev.tllw.dknvm.viewmodel.ViewModelProviderFactory
import javax.inject.Inject

class WelcomeFragment: BaseFragment() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    private lateinit var viewModel: WelcomeViewModel

    lateinit var binding: FragmentWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qqq", "WelcomeFragment $this")

        getAppComponent().injectWelcomeFragment(this)

        viewModel = ViewModelProvider(this, providerFactory).get(WelcomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }
}
