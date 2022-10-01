package com.example.androidstudyjamsession2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")
        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Name: "+name+"\nEmail: "+email+"\nPhone: "+phone
    }
}