package com.example.handshakeplus

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionOneActivity : AppCompatActivity() {

    private lateinit var quizTitleTextView: TextView
    private lateinit var questionNumberTextView: TextView
    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var optionA: RadioButton
    private lateinit var optionB: RadioButton
    private lateinit var optionC: RadioButton

    private val correctAnswer = "(B) Opposition"
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question_one)

        // Initialize the UI elements
        quizTitleTextView = findViewById(R.id.quizTitleTextView)
        questionNumberTextView = findViewById(R.id.questionNumberTextView)
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        optionA = findViewById(R.id.optionA)
        optionB = findViewById(R.id.optionB)
        optionC = findViewById(R.id.optionC)

        // Set a listener for the RadioGroup to handle option selection
        optionsRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            selectedRadioButton?.let {
                val selectedAnswer = it.text.toString()

                if (selectedAnswer == correctAnswer) {
                    // Correct answer: turn green and navigate to the next screen
                    it.setBackgroundColor(Color.parseColor("#4CAF50")) // Use getColor(R.color.correct_answer_green)
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()

                    // Disable the RadioGroup after the correct answer is selected
                    optionsRadioGroup.isEnabled = false
                    for (i in 0 until optionsRadioGroup.childCount) {
                        optionsRadioGroup.getChildAt(i).isEnabled = false
                    }

                    // Start the CorrectAnswerOneActivity after a short delay
                    handler.postDelayed({
                        val intent = Intent(this, CorrectAnswerOneActivity::class.java)
                        startActivity(intent)
                        finish() // Optional: finish this activity
                    }, 1000) // 1-second delay
                } else {
                    // Incorrect answer: turn red, but don't disable the RadioGroup
                    it.setBackgroundColor(Color.parseColor("#F44336")) // Use getColor(R.color.incorrect_answer_red)
                    Toast.makeText(this, "Incorrect, try again!", Toast.LENGTH_SHORT).show()

                    // Optionally, revert the color after a short delay
                    handler.postDelayed({
                        it.setBackgroundResource(R.drawable.radio_button_background)
                        // group.clearCheck() // Optional: uncheck the radio button
                    }, 500) // 0.5-second delay
                }
            }
        }
    }
}