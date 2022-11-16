package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    lateinit var text:TextView
    lateinit var input1:EditText
    lateinit var input2:EditText
    lateinit var input3:EditText
    lateinit var Button:Button
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        text=findViewById(R.id.txtView)
        input1=findViewById(R.id.edtTxtone)
        input2=findViewById(R.id.edtTxttwo)
        input3=findViewById(R.id.edtTxtthree)
        Button=findViewById(R.id.button)
        result=findViewById(R.id.textView2)

        Button.setOnClickListener {
            var a = input1.text.toString()
            var b = input2.text.toString().toInt()
            var c = input3.text.toString()
            //result.text =
                println( "SUmbitted")
            //println(result)
            result.text=a
            println(a)
        }
    }
}