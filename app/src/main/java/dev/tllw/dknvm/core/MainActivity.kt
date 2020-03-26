package dev.tllw.dknvm.core

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import dev.tllw.dknvm.R

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
