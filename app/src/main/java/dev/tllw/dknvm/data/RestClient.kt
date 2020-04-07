package dev.tllw.dknvm.data

import android.app.Application
import android.util.Log
import javax.inject.Inject

interface RestClient {

    fun connect()
}

// a stub of a RestClient, requires Network client instance
class StubRestClient @Inject constructor(val net: Net, private val appContext: Application) : RestClient {

    init {
        Log.d("qqq", "RestClient init $this")
    }

    override fun connect() {

    }
}
