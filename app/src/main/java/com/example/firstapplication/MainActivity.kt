package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var additionButton : Button
    lateinit var subtractionButton : Button
    lateinit var multiplicationButton : Button
    lateinit var divisionButton : Button
    lateinit var textFieldOne : EditText
    lateinit var textFieldTwo : EditText
    lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        additionButton = findViewById(R.id.addition_button)
        subtractionButton = findViewById(R.id.subtraction_button)
        multiplicationButton = findViewById(R.id.multiplication_button)
        divisionButton = findViewById(R.id.division_button)
        textFieldOne = findViewById(R.id.enter_first_num)
        textFieldTwo = findViewById(R.id.enter_second_num)
        textViewResult = findViewById(R.id.result_text)

        additionButton.setOnClickListener(this)
        subtractionButton.setOnClickListener(this)
        multiplicationButton.setOnClickListener(this)
        divisionButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var num1 = textFieldOne.text.toString().toDouble()
        var num2 = textFieldTwo.text.toString().toDouble()
        var result = 0.0
        when(v?.id) {
            R.id.addition_button -> {
                result = num1 + num2
            }
            R.id.subtraction_button -> {
                result = num1 - num2
            }
            R.id.multiplication_button -> {
                result = num1 * num2
            }
            R.id.division_button -> {
                result = num1 / num2
            }
        }

        textViewResult.text = "Result :$result"
    }
}