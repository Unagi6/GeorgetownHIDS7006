package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PostExerciseSurveyActivity : AppCompatActivity() {

    private lateinit var postPainLevelSeekBar: SeekBar
    private lateinit var postPainLevelValueTextView: TextView
    private lateinit var postGripStrengthEditText: EditText
    private lateinit var postFatigueLevelSeekBar: SeekBar
    private lateinit var postFatigueLevelValueTextView: TextView
    private lateinit var exerciseDifficultySeekBar: SeekBar
    private lateinit var exerciseDifficultyValueTextView: TextView
    private lateinit var sessionFeedbackEditText: EditText
    private lateinit var completeButton: Button
    private lateinit var bottomNavHome: ImageView
    private lateinit var bottomNavExercises: ImageView
    private lateinit var bottomNavProgress: ImageView
    private lateinit var bottomNavProfile: ImageView

    private val exerciseDifficultyOptions = listOf("Low", "Medium", "High")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_exercise_survey)

        postPainLevelSeekBar = findViewById(R.id.postPainLevelSeekBar)
        postPainLevelValueTextView = findViewById(R.id.postPainLevelValueTextView)
        postGripStrengthEditText = findViewById(R.id.postGripStrengthEditText)
        postFatigueLevelSeekBar = findViewById(R.id.postFatigueLevelSeekBar)
        postFatigueLevelValueTextView = findViewById(R.id.postFatigueLevelValueTextView)
        exerciseDifficultySeekBar = findViewById(R.id.exerciseDifficultySeekBar)
        exerciseDifficultyValueTextView = findViewById(R.id.exerciseDifficultyValueTextView)
        sessionFeedbackEditText = findViewById(R.id.sessionFeedbackEditText)
        completeButton = findViewById(R.id.completeButton)
        bottomNavHome = findViewById(R.id.bottomNavHome)
        bottomNavExercises = findViewById(R.id.bottomNavExercises)
        bottomNavProgress = findViewById(R.id.bottomNavProgress)
        bottomNavProfile = findViewById(R.id.bottomNavProfile)

        postPainLevelSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                postPainLevelValueTextView.text = "Value: $progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        postFatigueLevelSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                postFatigueLevelValueTextView.text = "Value: $progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        exerciseDifficultySeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                exerciseDifficultyValueTextView.text = "Value: ${exerciseDifficultyOptions.getOrNull(progress) ?: ""}"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        completeButton.setOnClickListener {
            val painLevel = postPainLevelSeekBar.progress
            val gripStrength = postGripStrengthEditText.text.toString()
            val fatigueLevel = postFatigueLevelSeekBar.progress
            val difficulty = exerciseDifficultyOptions.getOrNull(exerciseDifficultySeekBar.progress)
            val feedback = sessionFeedbackEditText.text.toString()

            val surveyData = "Pain Level: $painLevel\n" +
                    "Grip Strength: $gripStrength\n" +
                    "Fatigue Level: $fatigueLevel\n" +
                    "Difficulty: $difficulty\n" +
                    "Feedback: $feedback"

            Toast.makeText(this, "Survey Data:\n$surveyData", Toast.LENGTH_LONG).show()

            // Create an Intent to go back to DailyExercisesActivity
            val intent = Intent(this, DailyExercisesActivity::class.java)
            // Add an extra to signal that a completion event occurred
            intent.putExtra("survey_completed", true)
            startActivity(intent)
            finish() // Close the current activity
        }

        bottomNavHome.setOnClickListener {
            startActivity(Intent(this, PatientDashboardActivity::class.java))
        }

        bottomNavExercises.setOnClickListener {
            startActivity(Intent(this, PainSurvy::class.java))
        }

        bottomNavProgress.setOnClickListener {
            // Handle progress navigation
        }

        bottomNavProfile.setOnClickListener {
            startActivity(Intent(this, TacoTuesdayActivity::class.java))
        }
    }
}