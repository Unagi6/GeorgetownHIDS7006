package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val learnMoreButton: Button = findViewById(R.id.learnMoreButton)

        learnMoreButton.setOnClickListener {
            // Handle Learn More button click
            Toast.makeText(this, "Learn More Clicked", Toast.LENGTH_SHORT).show()
            // Add code to navigate to the learning content.
            startActivity(Intent(this, QuizQuestionOneActivity::class.java))
        }
    }
}