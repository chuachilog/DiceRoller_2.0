package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener{ clear() }

        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)

    }

    private fun rollDice() {

        val drawableResource = getRandomDiceImage()
        val drawableResource1 = getRandomDiceImage()

        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource1)
    }

    private fun clear() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage1.setImageResource(R.drawable.empty_dice)
    }

    private fun getRandomDiceImage(): Int {

        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

}