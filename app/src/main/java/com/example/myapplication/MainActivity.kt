package com.example.myhighhapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloText =  findViewById<TextView>(R.id.textHello)
        helloText.run{
            setOnClickListener(
                {
                    helloText.text = "Hi, World!"
                }
            )

        }


    }
}
