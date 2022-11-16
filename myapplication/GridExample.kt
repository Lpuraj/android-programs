package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myapplication.ImageButton as ImageButton1

class GridExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_example)
        var grid=findViewById<GridLayout>(R.id.grid)
        var res=StringBuilder()
        var txt1=findViewById<TextView>(R.id.txt1)
        var txt2=findViewById<TextView>(R.id.txt2)
        var imag1=findViewById<ImageButton>(R.id.image1)
        var imag2=findViewById<ImageButton>(R.id.image2)
        imag1.setOnClickListener {
            res.clear()
            res.append("HELLO ar you prevert")
            txt1.text=res.toString()
            //Toast.makeText(this,res,Toast.LENGTH_LONG).show()
        }
        imag2.setOnClickListener {
            res.clear()
            res.append("hello are you foody")
            //Toast.makeText(this,res,Toast.LENGTH_LONG).show()
            txt2.text=res.toString()
        }
    }
}