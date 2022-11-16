package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var uname = findViewById<EditText>(R.id.rgstr)
        var  pwd = findViewById<EditText>(R.id.pwd1)
        var  repwd = findViewById<EditText>(R.id.pwd)
        var  btn1 = findViewById<Button>(R.id.btn1)
        var  btn2 = findViewById<Button>(R.id.btn2)
        val newpwd=pwd.text.toString()
        val newpwd1=repwd.text.toString()
        btn1.setOnClickListener {
            if(newpwd==newpwd1)
            {
                val ganesh = Intent(this, Order::class.java)
                startActivity(ganesh)
            }
            else
            {
                Toast.makeText(applicationContext,"RE ENTER",Toast.LENGTH_SHORT).show()
            }

        }
        btn2.setOnClickListener {

                val sec = Intent(this, MyLogin::class.java)
                startActivity(sec)

        }
    }
}