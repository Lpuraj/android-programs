package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Addition : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)
        var first=findViewById<EditText>(R.id.first)
        var second=findViewById<EditText>(R.id.second)
        var res=findViewById<TextView>(R.id.txtv)
        var btn=findViewById<Button>(R.id.press)
        btn.setOnClickListener {
            var n1=first.text.toString().toInt()
            var n2= second.text.toString().toInt()
            var t :Int= n1+n2
            res.text=t.toString()
            //Toast.makeText(this,t.toString(), Toast.LENGTH_LONG).show()
        }
    }
}