package com.example.toc_thaparonaclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Nearby : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nearby)
        val decath: Button = findViewById(R.id.button)
        decath.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="Decathlon"
            val lat : Double=30.619681088872856
            val lng : Double=76.82430238226392
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }

        val dmart: Button = findViewById(R.id.button3)
        dmart.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="D'mart"
            val lat : Double=30.620428524720115
            val lng : Double=76.8219193822639
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }
        val guru: Button = findViewById(R.id.button2)
        guru.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="Gurudwara"
            val lat : Double=30.557956678548482
            val lng : Double=76.90407489600966
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }
        val mcd: Button = findViewById(R.id.button4)
        mcd.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="Burger King"
            val lat : Double=30.6209841581969
            val lng : Double=76.82389832752186
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }
        val mov: Button = findViewById(R.id.button5)
        mov.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="INOX"
            val lat : Double=30.62000394883077
            val lng : Double=76.82332908341357
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }
        val hos: Button = findViewById(R.id.button6)
        hos.setOnClickListener {
            val i = Intent(this, Decathlon::class.java)

            val str : String="Chander Hospital"
            val lat : Double=30.583168600181775
            val lng : Double=76.84325041899615
            i.putExtra("latitude",lat)
            i.putExtra("longitude",lng)
            i.putExtra("place",str)
            startActivity(i)
        }
    }
}
