package com.example.addapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et1: EditText = findViewById(R.id.et1)
        var et2: EditText = findViewById(R.id.et2)
        var btnAdd: Button = findViewById(R.id.btnAdd)
        var tvAns: TextView = findViewById(R.id.tvAns)
        var btnClear: Button = findViewById(R.id.btnClear)

        btnAdd.setOnClickListener {
            var sum = et1.text.toString().toInt() + et2.text.toString().toInt()
            tvAns.text = "合計は" + sum
        }
        btnClear.setOnClickListener{
            et1.text.clear()
            et2.text.clear()
            tvAns.text = "答え"
        }
    }
}