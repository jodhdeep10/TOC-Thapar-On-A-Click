package com.example.toc_thaparonaclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cgpacalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cgpacalculator)
        val poola: Button = findViewById(R.id.button)
        poola.setOnClickListener {
            val i = Intent(this, Apool::class.java)
            startActivity(i)
        }
        val poolb: Button = findViewById(R.id.button2)
        poolb.setOnClickListener {
            val i = Intent(this, Bpool::class.java)
            startActivity(i)
        }
    }
}