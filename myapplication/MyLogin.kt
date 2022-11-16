package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MyLogin : AppCompatActivity() {
    lateinit var signin: TextView
    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var login: Button
    lateinit var forget: TextView
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_login)
        signin=findViewById(R.id.signin)
        user=findViewById(R.id.user)
        pass=findViewById(R.id.pass)
        login=findViewById(R.id.login)
        forget=findViewById(R.id.forget)
        result=findViewById(R.id.textView2)
        login.setOnClickListener()
        {
            if(user.text.toString().equals("Mayank")&&pass.text.toString().equals("1234")) {
                val ganesh = Intent(this, Order::class.java)
                startActivity(ganesh)
            }
            else
                result.text="FORGET PASSWORD"
        }
        forget.setOnClickListener()
        {
            val regstr = Intent(this, Registration::class.java)
            startActivity(regstr)
        }

    }
}