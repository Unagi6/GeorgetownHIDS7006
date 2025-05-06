package com.example.handshakeplus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TacoTuesdayActivity : AppCompatActivity() {

    private lateinit var tacoImageView: ImageView
    private lateinit var bottomNavHome: ImageView
    private lateinit var bottomNavExercises: ImageView
    private lateinit var bottomNavProgress: ImageView
    private lateinit var bottomNavProfile: ImageView

    private val youtubeLink = "https://www.youtube.com/watch?v=h3rj_u2qbtY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taco_tuesday)

        tacoImageView = findViewById(R.id.tacoImageView)
        bottomNavHome = findViewById(R.id.bottomNavHome)
        bottomNavExercises = findViewById(R.id.bottomNavExercises)
        bottomNavProgress = findViewById(R.id.bottomNavProgress)
        bottomNavProfile = findViewById(R.id.bottomNavProfile)

        tacoImageView.setOnClickListener {
            // Play the song from the YouTube link
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeLink))
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Could not open YouTube link.", Toast.LENGTH_SHORT).show()
            }
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