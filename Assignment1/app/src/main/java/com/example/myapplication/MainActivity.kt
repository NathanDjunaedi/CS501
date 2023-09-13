package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myName = "Nathan"
        val text = resources.getString(R.string.greeting, myName)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text1)
        textView.text = text
    }
}