package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PainSurvy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.action_survy)

        // Add any necessary logic here, e.g., button click listeners
        val backButton = findViewById<android.widget.Button>(R.id.backToSurveyButton)
        backButton.setOnClickListener {
            val startIntent = Intent(this, PreExerciseAssessmentActivity::class.java)
            startActivity(startIntent)
        }

        val homeButton = findViewById<android.widget.ImageView>(R.id.bottomNavHome)
        homeButton.setOnClickListener {
            val intent = Intent(this, PatientDashboardActivity::class.java)
            startActivity(intent)
        }

        val exercisesButton = findViewById<android.widget.ImageView>(R.id.bottomNavExercises)
        exercisesButton.setOnClickListener {
            val intent = Intent(this, PainSurvy::class.java)
            startActivity(intent)
        }

        val progressButton = findViewById<android.widget.ImageView>(R.id.bottomNavProgress)
        progressButton.setOnClickListener {
            // Handle progress navigation
        }

        val profileButton = findViewById<android.widget.ImageView>(R.id.bottomNavProfile)
        profileButton.setOnClickListener {
            startActivity(Intent(this, TacoTuesdayActivity::class.java))
        }
    }
}