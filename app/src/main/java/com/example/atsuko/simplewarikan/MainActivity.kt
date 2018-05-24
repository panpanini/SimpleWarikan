package com.example.atsuko.simplewarikan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.calculate_button).setOnClickListener {
            val cost = findViewById<EditText>(R.id.cost).text.toString()
            val peopleCount = findViewById<EditText>(R.id.people).text.toString()

            findViewById<TextView>(R.id.result).text =
                    CostCalculator().calculateCost(cost, peopleCount)
        }
    }
}
