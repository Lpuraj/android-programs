package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Link1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link1)
        val add = findViewById<Button>(R.id.button)
        add.setOnClickListener {
            val ganesh = Intent(this, Link2::class.java)
            startActivity(ganesh)
        }
    }
}