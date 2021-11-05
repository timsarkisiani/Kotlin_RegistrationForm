package com.example.shualeduri2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var answer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        answer = findViewById(R.id.answer)
        answer.setOnClickListener(){
            Toast.makeText(applicationContext, " წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
        }
    }
}