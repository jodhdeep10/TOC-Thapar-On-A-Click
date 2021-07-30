package com.example.toc_thaparonaclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Timetable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timetable)
        val mon: Button = findViewById(R.id.button)
        mon.setOnClickListener {
            runhere1()
        }
        val tue: Button = findViewById(R.id.button2)
        tue.setOnClickListener {
            runhere2()
        }
        val wed: Button = findViewById(R.id.button3)
        wed.setOnClickListener {
            runhere3()
        }
        val thu: Button = findViewById(R.id.button4)
        thu.setOnClickListener {
            runhere4()
        }
        val fri: Button = findViewById(R.id.button5)
        fri.setOnClickListener {
            runhere5()
        }
    }

    private fun runhere1() {
        val intent = Intent(this, Monday::class.java)
        startActivity(intent)
    }
    private fun runhere2() {
        val intent = Intent(this, Tuesday::class.java)
        startActivity(intent)
    }
    private fun runhere3() {
        val intent = Intent(this, Wednesday::class.java)
        startActivity(intent)
    }
    private fun runhere4() {
        val intent = Intent(this, Thursday::class.java)
        startActivity(intent)
    }
    private fun runhere5() {
        val intent = Intent(this, Friday::class.java)
        startActivity(intent)
    }

}