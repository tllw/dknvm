package dev.tllw.dknvm.data

import android.util.Log
import dev.tllw.dknvm.core.DknvmApplication
import javax.inject.Inject

interface RestClient {

}

// a stub of a RestClient, requires Network client instance
class StubRestClient @Inject constructor(val net: Net, private val appContext: DknvmApplication) : RestClient {

    init {
        Log.d("qqq", "RestClient init $this")
        Log.d("qqq", "RestClient appContext is $appContext")
    }
}
