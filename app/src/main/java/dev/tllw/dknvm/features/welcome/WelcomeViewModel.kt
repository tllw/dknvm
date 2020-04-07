package dev.tllw.dknvm.features.welcome

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class WelcomeViewModel @Inject constructor() : ViewModel() {

    init {
        Log.d("qqq", "WelcomeViewModel $this")
    }
}
