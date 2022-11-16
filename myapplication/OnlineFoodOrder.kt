package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class OnlineFoodOrder : AppCompatActivity() {
    lateinit var uname:EditText
    lateinit var pwd:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_food_order)
         uname = findViewById<EditText>(R.id.uname)
         pwd = findViewById<EditText>(R.id.password)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            if(true)
            {
                val ganesh = Intent(this, Order::class.java)
                startActivity(ganesh)
           }
            else
            {val result = StringBuilder()
                result.append("Wrong ")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()

            }

        }
    }
}