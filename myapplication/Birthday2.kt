package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthday2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday2)
        var txt2=findViewById<TextView>(R.id.txt2)
        var txt3=findViewById<TextView>(R.id.txt3)
        var i=intent.getBundleExtra("info")
        txt2.text= i?.getString("name")
        txt3.text  = i?.getString("dob")

    }
}