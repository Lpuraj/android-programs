package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HotelBooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_booking)
        var btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var obj=Intent(this,Welcome::class.java)
            startActivity(obj)
        }
    }
}