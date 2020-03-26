package dev.tllw.dknvm.data

import android.util.Log
import javax.inject.Inject

interface AuthClient {

}

// a stub of a AuthClient, requires RestClient instance
class StubAuthClient @Inject constructor(val restClient: RestClient) : AuthClient {

    init {
        Log.d("qqq", "AuthClient init $this")
    }
}
