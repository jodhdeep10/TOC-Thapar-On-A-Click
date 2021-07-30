package com.example.toc_thaparonaclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode

class Bpool : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bpool)
        val pool_a: Button = findViewById(R.id.button4)

        pool_a.setOnClickListener {

            val sub1 = findViewById<EditText>(R.id.sub1)
            val sub2 = findViewById<EditText>(R.id.sub2)
            val sub3 = findViewById<EditText>(R.id.sub3)
            val sub4 = findViewById<EditText>(R.id.sub4)
            val sub5 = findViewById<EditText>(R.id.sub5)
            val sub6 = findViewById<EditText>(R.id.sub6)

            val grade_1: String = sub1.text.toString()
            val grade_2: String = sub2.text.toString()
            val grade_3: String = sub3.text.toString()
            val grade_4: String = sub4.text.toString()
            val grade_5: String = sub5.text.toString()
            val grade_6: String = sub6.text.toString()

            val a = convert(grade_1)
            val b = convert(grade_2)
            val c = convert(grade_3)
            val d = convert(grade_4)
            val e = convert(grade_5)
            val f = convert(grade_6)

            val cg=(((a*4.5)+(b*3.5)+(c*4)+(d*3)+(e*4.5)+(f*2.5))/22)
            var cgp = BigDecimal(cg).setScale(3, RoundingMode.HALF_EVEN).toString()
            if (cgp=="0.000") {
                cgp = "FAIL"
            }
            else cgp="Your CGPA is : ${cgp}"

            try {
                val imm: InputMethodManager =
                    getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            } catch (e: Exception) {
                // TODO: handle exception
            }

            val txt: TextView =findViewById(R.id.textView7)
            txt.setText(cgp)
        }
    }
    private fun convert(g1: String): Int {
        if (g1 == "A+" || g1 == "a+") {
            return 10
        }
        if (g1 == "A" || g1 == "a") {
            return 10
        }
        if (g1 == "A-" || g1 == "a-") {
            return 9
        }
        if (g1 == "B" || g1 == "b") {
            return 8
        }
        if (g1 == "B-" || g1 == "b-") {
            return 7
        }
        if (g1 == "C" || g1 == "c") {
            return 6
        }
        if (g1 == "C-" || g1 == "c-") {
            return 5
        }
        if (g1 == "E" || g1 == "e") {
            return 2
        }
        if (g1 == "F" || g1 == "f") {
            return 0
        }
        return 0
    }
}