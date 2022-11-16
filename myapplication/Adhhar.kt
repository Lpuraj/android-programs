package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Adhhar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adhhar)
        var name=findViewById<EditText>(R.id.name)
        var fname=findViewById<EditText>(R.id.father)
        var mname=findViewById<EditText>(R.id.mother)
        var location=findViewById<EditText>(R.id.location)
        var pin=findViewById<EditText>(R.id.pin)
        var dob=findViewById<EditText>(R.id.dob)
        var res=StringBuilder()
        var btn=findViewById<Button>(R.id.submit)
        var txt=findViewById<TextView>(R.id.textView2)
        btn.setOnClickListener {
            res.append("YOURS NAME : "+name.text+"\n")
            res.append("YOURS FATHER'S NAME : "+fname.text+"\n")
            res.append("YOURS MOTHER'S NAME : "+mname.text+"\n")
            res.append("YOURS DOB : "+dob.text+"\n")
            res.append("YOURS ADDRESS : "+location.text+"\n")
            res.append("YOURS PIN : "+pin.text+"\n")
            txt.text=res
        }
    }
}