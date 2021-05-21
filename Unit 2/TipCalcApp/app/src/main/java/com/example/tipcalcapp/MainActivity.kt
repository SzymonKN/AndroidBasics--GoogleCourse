package com.example.tipcalcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.example.tipcalcapp.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateTip() }
       /* val editTextCost : EditText = findViewById(R.id.cost_of_service)
        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)
        val calculateButton : Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener {
            val tipPercent : Double = when(radioGroup.checkedRadioButtonId) {

                else ->
            }
        }*/

    }
    private fun calculateTip(){
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val tipPercentage = when(binding.radioGroup.checkedRadioButtonId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = cost*tipPercentage
        if(binding.roundUpSwitch.isChecked)
            tip = ceil(tip)

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_textView,formattedTip)
    }

}