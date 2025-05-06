package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizResultsActivity : AppCompatActivity() {

    private lateinit var congratsTextView: TextView
    private lateinit var scoreMessageTextView: TextView
    private lateinit var scoreTextView: TextView
    private lateinit var quizCompletionMessageTextView: TextView
    private lateinit var navigationPromptTextView: TextView
    private lateinit var takeQuizAgainButton: Button
    private lateinit var homeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)

        // Initialize UI elements
        congratsTextView = findViewById(R.id.congratsTextView)
        scoreMessageTextView = findViewById(R.id.scoreMessageTextView)
        scoreTextView = findViewById(R.id.scoreTextView)
        quizCompletionMessageTextView = findViewById(R.id.quizCompletionMessageTextView)
        navigationPromptTextView = findViewById(R.id.navigationPromptTextView)
        takeQuizAgainButton = findViewById(R.id.takeQuizAgainButton)
        homeButton = findViewById(R.id.homeButton)

        // Get the score from the Intent (assuming you pass it from the last quiz question)
        val score = intent.getIntExtra("score", 0)
        val totalQuestions = intent.getIntExtra("total_questions", 3) // Assuming a total of 3 questions
        scoreTextView.text = "3/3"

        // Set OnClickListener for the "Take Quiz again" button
        takeQuizAgainButton.setOnClickListener {
            // Start the first quiz question activity again
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
            finish() // Close this activity
        }

        // Set OnClickListener for the "Home" button
        homeButton.setOnClickListener {
            // Navigate back to the main dashboard
            val intent = Intent(this, PatientDashboardActivity::class.java)
            // Optional flags to clear the back stack and go to the main dashboard
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // Close this activity
        }
    }
}