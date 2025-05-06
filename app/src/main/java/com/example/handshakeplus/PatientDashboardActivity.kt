package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar
import java.util.Locale

class PatientDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_dashboard)

        val profileImageView: ImageView = findViewById(R.id.profileImageView)
        val welcomeTextView: TextView = findViewById(R.id.welcomeTextView)
        val daysOfWeekLayout: LinearLayout = findViewById(R.id.daysOfWeekLayout)
        val treatmentPlanCard: LinearLayout = findViewById(R.id.treatmentPlanCard)
        val quizCard: LinearLayout = findViewById(R.id.quizCard)
        val recoveryProgress: ProgressBar = findViewById(R.id.recoveryProgressBar)
        val recoveryPercentage: TextView = findViewById(R.id.recoveryPercentageTextView)
        val exercisesCount: TextView = findViewById(R.id.exercisesCountTextView)
        val repsCount: TextView = findViewById(R.id.repsCountTextView)
        val bottomNavHome: ImageView = findViewById(R.id.bottomNavHome)
        val bottomNavExercises: ImageView = findViewById(R.id.bottomNavExercises)
        val bottomNavProgress: ImageView = findViewById(R.id.bottomNavProgress)
        val bottomNavProfile: ImageView = findViewById(R.id.bottomNavProfile)
        val quizButton: ImageView = findViewById(R.id.myImageButton) // This line is correct for the XML you provided

        welcomeTextView.text = "Welcome, Nathan"
        profileImageView.setImageResource(R.drawable.default_profile_pic)

        updateDayCheckmarks(daysOfWeekLayout)

        treatmentPlanCard.setOnClickListener {
            Toast.makeText(this, "Treatment Plan Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to treatment plan activity/fragment
        }

        quizCard.setOnClickListener {
            Toast.makeText(this, "Quiz Card Clicked", Toast.LENGTH_SHORT).show()
            // The entire quizCard LinearLayout is clickable.
            // If you want the click to be handled specifically by the myImageButton:
            // You can remove the quizCard.setOnClickListener and use quizButton.setOnClickListener instead.

        }

        // Set an OnClickListener for the myImageButton (the arrow in the Quiz Card)
        quizButton.setOnClickListener {
            Toast.makeText(this, "Quiz Button Clicked", Toast.LENGTH_SHORT).show()
            // Start the Quiz Activity when the arrow button is clicked
            startActivity(Intent(this, QuizActivity::class.java))
        }

        recoveryProgress.progress = 20
        recoveryPercentage.text = "28%"
        exercisesCount.text = "16"
        repsCount.text = "125"

        bottomNavHome.setOnClickListener {
            val intent = Intent(this, PatientDashboardActivity::class.java)
            startActivity(intent)
        }
        bottomNavExercises.setOnClickListener {
            val survey = Intent(this, PainSurvy::class.java)
            startActivity(survey)
        }
        bottomNavProgress.setOnClickListener {
            val extent = Intent(this, MainActivity::class.java)
            startActivity(extent)
        }
        bottomNavProfile.setOnClickListener {
            val test = Intent(this, TacoTuesdayActivity::class.java)
            startActivity(test)
        }

        // ... Other initialization and logic ...
    }

    private fun updateDayCheckmarks(daysOfWeekLayout: LinearLayout) {
        val completedDays = listOf(Calendar.MONDAY, Calendar.WEDNESDAY, Calendar.FRIDAY) // Example
        val calendar = Calendar.getInstance()
        val firstDayOfWeek = calendar.firstDayOfWeek
        val days = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")

        for (i in 0 until daysOfWeekLayout.childCount) {
            val dayView = daysOfWeekLayout.getChildAt(i) as LinearLayout
            val dayTextView = dayView.getChildAt(0) as? TextView // Assuming TextView is the first child
            val checkmarkImageView = dayView.getChildAt(1) as? ImageView // Assuming ImageView is the second child

            // Calculate the actual day of the week for the current position in the layout
            val calendarDayOfWeek = (firstDayOfWeek + i - 1 + 7) % 7 + 1

            // Get the abbreviation for the current day
            val dayAbbreviation = when (calendarDayOfWeek) {
                Calendar.SUNDAY -> "Sun"
                Calendar.MONDAY -> "Mon"
                Calendar.TUESDAY -> "Tue"
                Calendar.WEDNESDAY -> "Wed"
                Calendar.THURSDAY -> "Thu"
                Calendar.FRIDAY -> "Fri"
                Calendar.SATURDAY -> "Sat"
                else -> ""
            }

            // Construct the expected ID of the ImageView
            val checkmarkIdName = "dayCheckmark$dayAbbreviation"
            val checkmarkId = resources.getIdentifier(checkmarkIdName, "id", packageName)

            // Find the ImageView using the constructed ID
            val checkmark = findViewById<ImageView>(checkmarkId)

            if (completedDays.contains(calendarDayOfWeek)) {
                checkmark?.visibility = View.VISIBLE
            } else {
                checkmark?.visibility = View.INVISIBLE
            }
        }
    }
}