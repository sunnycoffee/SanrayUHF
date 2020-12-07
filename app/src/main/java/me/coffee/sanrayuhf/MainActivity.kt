package me.coffee.sanrayuhf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        SanrayUHF.start()
    }

    override fun onStop() {
        super.onStop()
        SanrayUHF.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        SanrayUHF.close()
    }
}