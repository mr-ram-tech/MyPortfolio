package com.example.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class profsplash : AppCompatActivity() {
    val activityScope = CoroutineScope(Dispatchers.Main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profsplash)
        activityScope.launch {
            delay(1000)

            var intent=Intent(this@profsplash,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onPause(){
        activityScope.cancel()
        super.onPause()
    }

}