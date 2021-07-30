package com.example.toc_thaparonaclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess)
        val mon: Button = findViewById(R.id.button)
        mon.setOnClickListener {
            runhere1()
        }
        val tue: Button = findViewById(R.id.button2)
        tue.setOnClickListener {
            runhere2()
        }
        val wed: Button = findViewById(R.id.button5)
        wed.setOnClickListener {
            runhere3()
        }
        val thu: Button = findViewById(R.id.button6)
        thu.setOnClickListener {
            runhere4()
        }
        val fri: Button = findViewById(R.id.button7)
        fri.setOnClickListener {
            runhere5()
        }
        val sat: Button = findViewById(R.id.button8)
        sat.setOnClickListener {
            runhere6()
        }
        val sun: Button = findViewById(R.id.button9)
        sun.setOnClickListener {
            runhere7()
        }

    }

    private fun runhere1() {
        val intent = Intent(this, Mondaymess::class.java)
        startActivity(intent)
    }
    private fun runhere2() {
        val intent = Intent(this, Tuesdaymess::class.java)
        startActivity(intent)
    }
    private fun runhere3() {
        val intent = Intent(this, Wednesdaymess::class.java)
        startActivity(intent)
    }
    private fun runhere4() {
        val intent = Intent(this, Thursdaymess::class.java)
        startActivity(intent)
    }
    private fun runhere5() {
        val intent = Intent(this, Fridaymess::class.java)
        startActivity(intent)
    }
    private fun runhere6() {
        val intent = Intent(this, Saturdaymess::class.java)
        startActivity(intent)
    }
    private fun runhere7() {
        val intent = Intent(this, Sundaymess::class.java)
        startActivity(intent)
    }



}