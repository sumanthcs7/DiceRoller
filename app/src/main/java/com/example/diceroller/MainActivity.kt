package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultText: TextView = findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countupButton: Button = findViewById(R.id.countup_button)
        rollButton.setOnClickListener { rollDice() }
        countup_button.setOnClickListener { countUP()}


    }
    private fun rollDice(){
        val randomInt=(1..6).random()
        //Toast.makeText(this,"button clicked",
               // Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()

    }
    private fun countUP()
    {
        val resultText: TextView = findViewById(R.id.result_text)
        val res=resultText.text
        if(resultText.text=="Hello World!")
            resultText.text="1"
        else if(resultText.text!="6"){
            resultText.text=(Integer.parseInt(res as String)+1).toString()
        }

    }

}
