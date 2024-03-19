package com.example.multiplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val multiplyButton = findViewById<Button>(R.id.button)
        multiplyButton.setOnClickListener {
// create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java)

            intent.putExtra("tableNumber",
                editTextText.text.toString())
// start the activity
            startActivity(intent)


        }
    }
}