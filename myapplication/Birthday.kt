package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Birthday : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        var txt=findViewById<EditText>(R.id.txt)
        var btn=findViewById<Button>(R.id.btn)
        var dob=findViewById<EditText>(R.id.dob)
        btn.setOnClickListener {
            val str =txt.text.toString()// txt.text.toString()
            var dob=dob.text.toString()
            var obj=Intent(this,Birthday2::class.java)
            var b=Bundle()
             b.putString("name",str)
             b.putString("dob",dob)
            obj.putExtra("info",b)
            startActivity(obj)
        }


    }
}