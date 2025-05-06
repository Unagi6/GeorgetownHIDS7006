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

class QuizQuestionTwoActivity : AppCompatActivity() {

    private lateinit var quizTitleTextView: TextView
    private lateinit var questionNumberTextView: TextView
    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var optionA: RadioButton
    private lateinit var optionB: RadioButton
    private lateinit var optionC: RadioButton

    private val correctAnswer = "(B) Extension"
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question_two)

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
                    // Correct answer: turn green and disable the RadioGroup
                    it.setBackgroundColor(Color.parseColor("#4CAF50")) // Use getColor(R.color.correct_answer_green)
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                    optionsRadioGroup.isEnabled = false
                    for (i in 0 until optionsRadioGroup.childCount) {
                        optionsRadioGroup.getChildAt(i).isEnabled = false
                    }

                    // Start the CorrectAnswerOneActivity after a short delay
                    handler.postDelayed({
                        val intent = Intent(this, CorrectAnswerTwoActivity::class.java)
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
                        // Uncheck the radio button after the delay if you want the user to re-select
                        // group.clearCheck()
                    }, 500) // 500 milliseconds delay
                }
            }
        }
    }
}