package dev.tllw.dknvm.data

import android.util.Log

interface Net {

}

// A stub of a network client
class StubNet: Net {

    init {
        Log.d("qqq", "Net init $this")
    }
}
