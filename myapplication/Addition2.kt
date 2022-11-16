package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Addition2 : AppCompatActivity() {
    lateinit var edt1: EditText
    lateinit var edt2: EditText
    lateinit var btn : Button
    lateinit var txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition2)
        btn=findViewById<Button>(R.id.btn)
        edt1=findViewById<EditText>(R.id.edit_text)
        edt2= findViewById(R.id.edit_text2)
        txt=findViewById<TextView>(R.id.txt)
        btn.setOnClickListener {
            var res=StringBuilder()
            res.append("HEllo your answer\n")
            var n1 = edt1.text.toString()
            var n2 = edt2.text.toString()
            var sum = n1.toInt() + n2.toInt()
            res.append(sum.toString())
            txt.text ="${res}+Result is:+${sum}"
        }
    }
}