package dev.tllw.dknvm.data

import android.util.Log

// a stub of a RestClient, requires Network client instance
class RestClient(val net: Net) {

    init {
        Log.d("qqq", "RestClient init $this")
    }
}
