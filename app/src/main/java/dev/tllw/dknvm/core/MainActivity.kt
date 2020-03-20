package dev.tllw.dknvm.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import dev.tllw.dknvm.R
import dev.tllw.dknvm.ui.TitleProvider
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var titleProvider: TitleProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        title = titleProvider.getTitle()
    }
}
