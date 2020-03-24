package dev.tllw.dknvm.features.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    private val _name = MutableLiveData("hello")
    private val _pass = MutableLiveData("")

    val email: LiveData<String> = _name
    val pass: LiveData<String> = _pass

    fun loginClick() {
        Log.d("qqq", "LoginClick")
    }

}
