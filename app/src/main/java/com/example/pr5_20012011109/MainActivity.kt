package com.example.pr5_20012011109

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var bt1: Button
lateinit var bt2: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1=findViewById(R.id.bt1)
        bt2=findViewById(R.id.bt2)
        implict_intent()
    }
    fun implict_intent(){
        bt1.setOnClickListener() {

        }
    }
}