package com.example.myportfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Education : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val img3 = findViewById<ImageView>(R.id.img3)

        img3.setOnClickListener { val i = Intent(this,MainActivity::class.java)
        startActivity(i)}
    }
}