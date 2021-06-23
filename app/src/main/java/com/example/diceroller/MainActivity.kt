package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener{ countUp() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text.toString() == "Hello World!") {
            resultText.text = "1"
        }else if (resultText.text.toString() != "6") {
            val num  = resultText.text.toString().toInt() + 1
            resultText.text = num.toString()
        }
    }
}