package com.example.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val about = findViewById<Button>(R.id.about)
        val skills = findViewById<Button>(R.id.skills)
        val Edu = findViewById<Button>(R.id.edu)
        val proj = findViewById<Button>(R.id.proj)
        val achieve = findViewById<Button>(R.id.achieve)

        about.setOnClickListener {
            val i = Intent(this,About_activity::class.java)
            startActivity(i)
        }
        skills.setOnClickListener { val i = Intent(this,Skill::class.java)
            startActivity(i) }
        Edu.setOnClickListener { val i = Intent(this,Education::class.java)
            startActivity(i) }
        proj.setOnClickListener { val i = Intent(this,projects::class.java)
            startActivity(i) }
        achieve.setOnClickListener { val i = Intent(this,achievements::class.java)
            startActivity(i) }
    }

}