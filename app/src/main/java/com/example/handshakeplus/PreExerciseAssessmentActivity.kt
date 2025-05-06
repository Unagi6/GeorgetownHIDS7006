package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PreExerciseAssessmentActivity : AppCompatActivity() {

    private lateinit var painLevelSeekBar: SeekBar
    private lateinit var painLevelValueTextView: TextView

    private lateinit var gripStrengthEditText: EditText
    private lateinit var skipGripStrengthSwitch: Switch

    private lateinit var moodVerySadImageButton: ImageButton
    private lateinit var moodSadImageButton: ImageButton
    private lateinit var moodNeutralImageButton: ImageButton
    private lateinit var moodHappyImageButton: ImageButton
    private lateinit var moodVeryHappyImageButton: ImageButton

    private lateinit var sleepQualitySeekBar: SeekBar
    private lateinit var sleepQualityValueTextView: TextView

    private lateinit var fatigueLevelSeekBar: SeekBar
    private lateinit var fatigueLevelValueTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_exercise_assessment) // adjust XML filename if different

        // Initialize Views
        painLevelSeekBar = findViewById(R.id.painLevelSeekBar)
        painLevelValueTextView = findViewById(R.id.painLevelValueTextView)

        gripStrengthEditText = findViewById(R.id.gripStrengthEditText)
        skipGripStrengthSwitch = findViewById(R.id.skipGripStrengthSwitch)

        moodVerySadImageButton = findViewById(R.id.moodVerySadImageButton)
        moodSadImageButton = findViewById(R.id.moodSadImageButton)
        moodNeutralImageButton = findViewById(R.id.moodNeutralImageButton)
        moodHappyImageButton = findViewById(R.id.moodHappyImageButton)
        moodVeryHappyImageButton = findViewById(R.id.moodVeryHappyImageButton)

        sleepQualitySeekBar = findViewById(R.id.sleepQualitySeekBar)
        sleepQualityValueTextView = findViewById(R.id.sleepQualityValueTextView)

        fatigueLevelSeekBar = findViewById(R.id.fatigueLevelSeekBar)
        fatigueLevelValueTextView = findViewById(R.id.fatigueLevelValueTextView)

        // Pain Level SeekBar listener
        painLevelSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                painLevelValueTextView.text = "Value: $progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Sleep Quality SeekBar listener
        val sleepQualityLabels = arrayOf("Very Poor", "Poor", "Okay", "Excellent")
        sleepQualitySeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val label = sleepQualityLabels.getOrElse(progress) { "Unknown" }
                sleepQualityValueTextView.text = "Value: $label"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Fatigue Level SeekBar listener
        fatigueLevelSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                fatigueLevelValueTextView.text = "Value: $progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // Grip Strength Switch listener
        skipGripStrengthSwitch.setOnCheckedChangeListener { _, isChecked ->
            gripStrengthEditText.isEnabled = !isChecked
            if (isChecked) {
                gripStrengthEditText.text.clear()
                gripStrengthEditText.hint = "Skipped"
            } else {
                gripStrengthEditText.hint = "Enter grip strength (e.g., kg)"
            }
        }

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, DailyExercisesActivity::class.java)
            startActivity(intent)
        }

        // Mood button click listeners
        val moodButtons = mapOf(
            moodVerySadImageButton to "Very Sad",
            moodSadImageButton to "Sad",
            moodNeutralImageButton to "Neutral",
            moodHappyImageButton to "Happy",
            moodVeryHappyImageButton to "Very Happy"
        )

        for ((button, mood) in moodButtons) {
            button.setOnClickListener {
                Toast.makeText(this, "Selected Mood: $mood", Toast.LENGTH_SHORT).show()
                highlightSelectedMood(button, moodButtons.keys)
            }
        }
    }

    private fun highlightSelectedMood(selectedButton: ImageButton, allButtons: Collection<ImageButton>) {
        for (button in allButtons) {
            button.alpha = if (button == selectedButton) 1.0f else 0.5f
        }
    }

}