package com.example.myportfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class projects : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        val img4 = findViewById<ImageView>(R.id.img4)
        img4.setOnClickListener { val i = Intent(this,MainActivity::class.java)
        startActivity(i)}
    }
}