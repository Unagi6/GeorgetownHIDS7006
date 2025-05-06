package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.FileOutputStream
import java.io.IOException

class SignUpActivity : AppCompatActivity() {

    private var dominantHand: String = "" // To store the selected dominant hand

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val fullNameEditText: EditText = findViewById(R.id.fullNameEditText)
        val injuryTypeEditText: EditText = findViewById(R.id.injuryTypeEditText)
        val surgeryDateEditText: EditText = findViewById(R.id.surgeryDateEditText)
        val leftHandButton: Button = findViewById(R.id.leftHandButton)
        val rightHandButton: Button = findViewById(R.id.rightHandButton)
        val assignedTherapistEditText: EditText = findViewById(R.id.assignedTherapistEditText)
        val inviteCodeEditText: EditText = findViewById(R.id.inviteCodeEditText)
        val emailEditText: EditText = findViewById(R.id.emailEditText) // NEW: email field
        val passwordEditText: EditText = findViewById(R.id.passwordEditText) // password field
        val completeSetupButton: Button = findViewById(R.id.completeSetupButton)

        completeSetupButton.setOnClickListener {
            val fullName = fullNameEditText.text.toString()
            val injuryType = injuryTypeEditText.text.toString()
            val surgeryDate = surgeryDateEditText.text.toString()
            val assignedTherapist = assignedTherapistEditText.text.toString()
            val inviteCode = inviteCodeEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (dominantHand.isNotEmpty()) {
                val userData = "Full Name: $fullName\n" +
                        "Injury Type: $injuryType\n" +
                        "Surgery Date: $surgeryDate\n" +
                        "Dominant Hand: $dominantHand\n" +
                        "Assigned Therapist: $assignedTherapist\n" +
                        "Invite Code: $inviteCode\n" +
                        "Email: $email\n" +
                        "Password: $password\n"

                saveUserDataToFile(userData)

                val intent = Intent(this, PatientDashboardActivity::class.java)
                startActivity(intent)
                finish() // Optional: Close SignUpActivity after navigating
            } else {
                Toast.makeText(this, "Please select your dominant hand", Toast.LENGTH_SHORT).show()
            }
        }

        leftHandButton.setOnClickListener {
            dominantHand = "Left"
            leftHandButton.isSelected = true
            rightHandButton.isSelected = false
        }

        rightHandButton.setOnClickListener {
            dominantHand = "Right"
            rightHandButton.isSelected = true
            leftHandButton.isSelected = false
        }
    }

    private fun saveUserDataToFile(userData: String) {
        val filename = "user_data.txt"
        try {
            val fileOutputStream: FileOutputStream = openFileOutput(filename, MODE_PRIVATE)
            fileOutputStream.write(userData.toByteArray())
            fileOutputStream.close()
            Toast.makeText(this, "User data saved to $filename", Toast.LENGTH_SHORT).show()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Error saving user data", Toast.LENGTH_SHORT).show()
        }
    }
}