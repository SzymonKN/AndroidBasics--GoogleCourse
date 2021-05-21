package com.example.tipcalcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextCost : EditText = findViewById(R.id.cost_of_service)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        val calculateButton : Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener {
            val tipPercent : Double = when {

                else ->
            }
        }
    }
}