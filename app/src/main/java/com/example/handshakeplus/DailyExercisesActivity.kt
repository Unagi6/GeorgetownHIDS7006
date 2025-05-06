package com.example.handshakeplus

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DailyExercisesActivity : AppCompatActivity() {

    private lateinit var dailyProgressBar: ProgressBar
    private lateinit var wristExerciseCard: CardView
    private lateinit var thumbExerciseCard: CardView
    private lateinit var fingerScissorCard: CardView
    private lateinit var flatPinchCard: CardView
    private lateinit var viewAllButton: Button
    private lateinit var bottomNavHome: ImageView
    private lateinit var bottomNavExercises: ImageView
    private lateinit var bottomNavProgress: ImageView
    private lateinit var bottomNavProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_exercises)

        dailyProgressBar = findViewById(R.id.dailyProgressBar)
        wristExerciseCard = findViewById(R.id.cardWristExercise)
        thumbExerciseCard = findViewById(R.id.cardThumbExercise)
        fingerScissorCard = findViewById(R.id.cardFingerScissor)
        flatPinchCard = findViewById(R.id.cardFlatPinch)
        viewAllButton = findViewById(R.id.viewAllButton)
        bottomNavHome = findViewById(R.id.bottomNavHome)
        bottomNavExercises = findViewById(R.id.bottomNavExercises)
        bottomNavProgress = findViewById(R.id.bottomNavProgress)
        bottomNavProfile = findViewById(R.id.bottomNavProfile)
        // Assuming you still have a single gotoTestButton for the Thumb exercise initially
        val gotoTestButton: ImageView = findViewById(R.id.gotoTestButton) // Make sure the ID is correct

        // Placeholder for setting progress dynamically
        dailyProgressBar.progress = 30 // Initial progress

        gotoTestButton.setOnClickListener {
            startActivity(Intent(this, ThumbExtensionActivity::class.java))
        }

        wristExerciseCard.setOnClickListener {
            // Intent to Wrist Exercise Test Activity
            // startActivity(Intent(this, WristExerciseTestActivity::class.java))
        }

        thumbExerciseCard.setOnClickListener {
            // Intent to Thumb Exercise Test Activity
            // startActivity(Intent(this, ThumbExerciseTestActivity::class.java))
        }

        fingerScissorCard.setOnClickListener {
            // Intent to Finger Scissor Test Activity
            // startActivity(Intent(this, FingerScissorTestActivity::class.java))
        }

        flatPinchCard.setOnClickListener {
            // Intent to Flat Pinch Test Activity
            // startActivity(Intent(this, FlatPinchTestActivity::class.java))
        }

        viewAllButton.setOnClickListener {
            // Intent to View All Exercises Activity
            // startActivity(Intent(this, AllExercisesActivity::class.java))
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
            startActivity(Intent(this, TacoTuesdayActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        // Check if the survey was completed
        val surveyCompleted = intent.getBooleanExtra("survey_completed", false)
        if (surveyCompleted) {
            // Change the background color of the CardViews to green
            thumbExerciseCard.setCardBackgroundColor(Color.parseColor("#E8F5E9")) // Light green
            fingerScissorCard.setCardBackgroundColor(Color.parseColor("#E8F5E9")) // Light green
            flatPinchCard.setCardBackgroundColor(Color.parseColor("#E8F5E9")) // Light green
            // You can also update the progress bar here if needed
            dailyProgressBar.progress = 75 // Example: 3 out of 4 completed
        }
        // Clear the extra to prevent re-triggering on orientation changes
        intent.removeExtra("survey_completed")
    }
}