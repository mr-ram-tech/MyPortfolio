package com.example.myportfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class achievements : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)

        val img2 = findViewById<ImageView>(R.id.img2)

        img2.setOnClickListener { val i = Intent(this,MainActivity::class.java)
        startActivity(i)}

    }
}