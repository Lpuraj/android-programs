package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class IntentDataTransferSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_data_transfer_second)
        var tv = findViewById<TextView>(R.id.textView4)
        val i1 = intent
        val b1 = i1.getBundleExtra("info")
        val x = b1?.getInt("First")
        val y = b1?.getInt("second")
        var res = 0
        val op = b1?.getString("operation")
        Toast.makeText(this, "" + x + y + op, Toast.LENGTH_LONG).show()
        when (op) {
            "+" -> if (x != null && y != null) {
                res = x + y
            }
            "-" -> if (x != null && y != null) {
                res = x - y
            }
            "*" -> if (x != null && y != null) {
                res = x * y
            }
            "/" -> if (x != null && y != null) {
                res = x / y
            }
        }

        tv.text=res.toString()
    }
}