package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ImageButton
import android.widget.Toast

class ImageButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
        val text=findViewById<TextView>(R.id.txt)
        val button1=findViewById<ImageButton>(R.id.wp)
        val button2=findViewById<ImageButton>(R.id.fb)
        val button3=findViewById<ImageButton>(R.id.ig)

        button1.setOnClickListener {
            val result="WHATSAPP SELECTED"
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            val result="FACEBOOK SELECTED"
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            val result="INSTAGARAM SELECTED"
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}