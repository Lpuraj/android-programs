package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class First : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        var txt=findViewById<EditText>(R.id.txt)
        var btn=findViewById<Button>(R.id.btn)
        var txtv=findViewById<TextView>(R.id.txtv)
        btn.setOnClickListener {
            if(!(txt.text.toString().isEmpty()))
            txtv.text=txt.text
            else
            {
                Toast.makeText(this,"reenter",Toast.LENGTH_LONG).show()
            }
        }
    }
}