package dev.tllw.dknvm.features.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import dev.tllw.dknvm.R
import dev.tllw.dknvm.core.BaseFragment
import dev.tllw.dknvm.databinding.FragmentLoginBinding
import dev.tllw.dknvm.di.factory.ViewModelProviderFactory

class LoginFragment(private val viewModelProviderFactory: ViewModelProviderFactory) : BaseFragment() {

    private lateinit var viewModel: LoginViewModel
    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qqq", "LoginFragment $this")

        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(LoginViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        // Bind layout with ViewModel
        binding.viewmodel = viewModel
        // LiveData needs the lifecycle owner
        binding.lifecycleOwner = this

        return binding.root
    }
}
