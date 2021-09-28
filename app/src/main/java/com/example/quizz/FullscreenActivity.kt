package com.example.quizz

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FullscreenActivity : AppCompatActivity() {

    private var result: String = "Paris"
    private lateinit var choise1: Button
    private lateinit var choise2: Button
    private lateinit var choise3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)

        choise1 = findViewById(R.id.choise1)
        choise2 = findViewById(R.id.choise2)
        choise3 = findViewById(R.id.choise3)

        choise1.setOnClickListener {
            if (choise1.text.equals(result)) {
                showToastMessage(true)
            } else {
                showToastMessage(false)
            }
        }

        choise2.setOnClickListener {
            if (choise2.text.equals(result)) {
                showToastMessage(true)
            } else {
                showToastMessage(false)
            }
        }

        choise3.setOnClickListener {
            if (choise3.text.equals(result)) {
                showToastMessage(true)
            } else {
                showToastMessage(false)
            }
        }
    }

    fun showToastMessage(boolean: Boolean) {
        if (boolean) {
            Toast.makeText(this@FullscreenActivity, "Correct", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@FullscreenActivity, "Wrong", Toast.LENGTH_SHORT).show()
        }
    }
}