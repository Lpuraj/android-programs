package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.CheckBox
import android.widget.Toast

class Order : AppCompatActivity() {
    lateinit var pizza: CheckBox
    lateinit var coffee: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button
    lateinit var txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        pizza = findViewById(R.id.checkBox1)
        coffee = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)
        txt=findViewById(R.id.txt)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items")
            if (pizza.isChecked) {
                result.append("\nPizza 100Rs")
                totalAmount += 100
            }
            if (coffee.isChecked) {
                result.append("\nCoffee 50Rs")
                totalAmount += 50
            }
            if (burger.isChecked) {
                result.append("\nBurger 120Rs")
                totalAmount += 120
            }
            result.append("\nTotal: " + totalAmount + "Rs")
            //Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            result.append("\nTHANKU ")
            txt.text=result
        }
    }
}