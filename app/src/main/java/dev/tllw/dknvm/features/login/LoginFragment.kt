package dev.tllw.dknvm.features.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import dev.tllw.dknvm.R
import dev.tllw.dknvm.databinding.FragmentLoginBinding

class LoginFragment : DaggerFragment() {

    lateinit var binding: FragmentLoginBinding

    val viewModel: LoginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("qqq", "LoginFragment $this")
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
