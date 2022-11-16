package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
class IntentDataTransfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_data_transfer)

        var b1 = findViewById<Button>(R.id.button)// compute
        var rg1 = findViewById<RadioGroup>(R.id.radioGroup)
        var rb = arrayOfNulls<RadioButton>(4)// array of radiobutton
        var et1 = findViewById<EditText>(R.id.editText2)
        var et2= findViewById<EditText>(R.id.editText3)

        rb[0] = findViewById(R.id.radioButton)
        rb[1] = findViewById(R.id.radioButton2)
        rb[2] = findViewById(R.id.radioButton3)
        rb[3] = findViewById(R.id.radioButton4)
        b1.setOnClickListener{

            val i = Intent(this, IntentDataTransferSecond::class.java)
            var b = Bundle()
            var x: Int = et1.getText().toString().toInt()
            var y: Int = et2.getText().toString().toInt()
            if (rg1.getCheckedRadioButtonId() == R.id.radioButton) {
                b.putString("operation", "+")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton2) {
                b.putString("operation", "-")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton3) {
                b.putString("operation", "*")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton4) {
                b.putString("operation", "/")
            }
//Toast.makeText(MainActivity.this," hh"+b.getString("operation"),Toast.LENGTH_LONG).show();
            b.putInt("First", x)
            b.putInt("second", y)
            i.putExtra("info", b)
            startActivity(i)
        }
    }
}