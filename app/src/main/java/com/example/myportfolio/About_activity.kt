package com.example.myportfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class About_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val img1 = findViewById<ImageView>(R.id.img1)

        img1.setOnClickListener { val i = Intent(this,MainActivity::class.java)
        startActivity(i)}

        val l1 = findViewById<LinearLayout>(R.id.l1)
        val l2 = findViewById<LinearLayout>(R.id.l2)
        val l3 = findViewById<LinearLayout>(R.id.l3)
        val l4 = findViewById<LinearLayout>(R.id.l4)


        l1.setOnClickListener {
            val openGit = Intent(android.content.Intent.ACTION_VIEW)
            openGit.data = Uri.parse("https://github.com/")
            startActivity(openGit)
        }

        l2.setOnClickListener {
            val openLinkedin = Intent(android.content.Intent.ACTION_VIEW)
            openLinkedin.data = Uri.parse("https://www.linkedin.com/in/ramakrushna-sahoo-6aaa66244")
            startActivity(openLinkedin)
        }

        l3.setOnClickListener {
            val openResume = Intent(android.content.Intent.ACTION_VIEW)
            openResume.data = Uri.parse("https://drive.google.com/file/d/1NaYG7SJCp4zFQUNumIZ1HfakFAHoYl_A/view?usp=drivesdk")
            startActivity(openResume)
        }

        l4.setOnClickListener{
            val openEmail = Intent(Intent.ACTION_SEND)
            val recp = arrayOf<String>("sramakrushna7@gmailcom")
            openEmail.putExtra(Intent.EXTRA_EMAIL,recp)
            openEmail.putExtra(Intent.EXTRA_SUBJECT,"Subject text here....")
            openEmail.putExtra(Intent.EXTRA_TEXT,"BOdy of the content here....")
            openEmail.putExtra(Intent.EXTRA_CC,"mailtocc@gmail.com")
            openEmail.setType("text/html")
            openEmail.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(openEmail,"Send mail"))

        }
    }
}