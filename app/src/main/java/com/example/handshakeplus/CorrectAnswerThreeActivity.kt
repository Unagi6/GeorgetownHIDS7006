package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CorrectAnswerThreeActivity : AppCompatActivity() {

    private lateinit var nextQuestionButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_answer_three) // Make sure this matches your XML file name

        // Initialize the UI elements
        nextQuestionButton = findViewById(R.id.completeButton)

        // Set OnClickListener for the Next Question button
        nextQuestionButton.setOnClickListener {
            // Start the QuizQuestionTwoActivity
            val intent = Intent(this, QuizResultsActivity::class.java)
            startActivity(intent)
        }
    }
}