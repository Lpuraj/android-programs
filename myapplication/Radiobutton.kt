package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView
import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.Toast

class Radiobutton : AppCompatActivity() {
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radiobutton)
        val rgrp=findViewById<RadioGroup>(R.id.rgp)
        val sub=findViewById<Button>(R.id.btn1)
        val res=findViewById<Button>(R.id.btn2)
        val text1=findViewById<TextView>(R.id.txtView)
        sub.setOnClickListener {
            val selectId:Int = rgrp.checkedRadioButtonId
            radioButton = findViewById(selectId)
            var out:String = radioButton.text.toString()
            text1.text = "Selected: $out "
        }
        res.setOnClickListener {
            Toast.makeText(applicationContext,"hello",Toast.LENGTH_SHORT).show()
            rgrp.setOnCheckedChangeListener(null);
            rgrp.clearCheck();
            text1.text = " "
            rgrp.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(
                        applicationContext, " On checked change : ${radio.text}",
                        Toast.LENGTH_SHORT
                    ).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
                }
            )


        }

        rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )
    }
}

