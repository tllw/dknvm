package dev.tllw.dknvm.ui

import android.util.Log
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class TitleProvider {

    init {
        Log.d("qqq", "TitleProvider $this")
    }

    fun getTitle(): String {
        val time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))
        return "Activity resumed at $time"
    }
}
