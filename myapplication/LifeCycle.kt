package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifeCycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
        Log.d("lifecycle", "onCreate invoked")
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume invoked")
    }
    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "onDestroy invoked")
    }
}