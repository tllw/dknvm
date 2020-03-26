package dev.tllw.dknvm.features.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.tllw.dknvm.data.RestClient
import javax.inject.Inject

class LoginViewModel
    @Inject constructor(
        restClient: RestClient
    ) : ViewModel() {

    init {
        Log.d("qqq", "LoginViewModel $this")
    }

    private val _name = MutableLiveData("hello")
    private val _pass = MutableLiveData("")

    val email: LiveData<String> = _name
    val pass: LiveData<String> = _pass

//    fun loginClick() {
//        Log.d("qqq", "LoginClick")
//    }
}
