package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThumbExtensionActivity : AppCompatActivity() {

    private lateinit var checkBoxSet1: CheckBox
    private lateinit var checkBoxSet2: CheckBox
    private lateinit var checkBoxSet3: CheckBox
    private lateinit var recordedButton: Button
    private lateinit var swipeToCompleteButton: Button
    private lateinit var bottomNavHome: ImageView
    private lateinit var bottomNavExercises: ImageView
    private lateinit var bottomNavProgress: ImageView
    private lateinit var bottomNavProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thumb_extension)

        checkBoxSet1 = findViewById(R.id.checkBoxSet1)
        checkBoxSet2 = findViewById(R.id.checkBoxSet2)
        checkBoxSet3 = findViewById(R.id.checkBoxSet3)
        recordedButton = findViewById(R.id.recordedButton)
        swipeToCompleteButton = findViewById(R.id.swipeToCompleteButton)
        bottomNavHome = findViewById(R.id.bottomNavHome)
        bottomNavExercises = findViewById(R.id.bottomNavExercises)
        bottomNavProgress = findViewById(R.id.bottomNavProgress)
        bottomNavProfile = findViewById(R.id.bottomNavProfile)

        // You can add logic here to handle the checkbox states
        // For example, saving the state when checked

        recordedButton.setOnClickListener {
            // Handle the "Recorded" button click
            // Maybe this changes the button's appearance or updates a status
            Toast.makeText(this, "Exercise Recorded!", Toast.LENGTH_SHORT).show()
        }

        swipeToCompleteButton.setOnClickListener {
            // Here, we'll just treat it as a regular button click
            Toast.makeText(this, "Exercise Completed!", Toast.LENGTH_SHORT).show()
            // You might then navigate back to the daily exercises screen
            startActivity(Intent(this, PostExerciseSurveyActivity::class.java))
            // finish()
        }

        bottomNavHome.setOnClickListener {
            startActivity(Intent(this, PatientDashboardActivity::class.java))
        }

        bottomNavExercises.setOnClickListener {
            startActivity(Intent(this, DailyExercisesActivity::class.java))
        }

        bottomNavProgress.setOnClickListener {
            // Handle progress navigation
        }

        bottomNavProfile.setOnClickListener {
            // Handle profile navigation
        }
    }
}