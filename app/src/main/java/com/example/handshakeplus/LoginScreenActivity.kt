package com.example.handshakeplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStreamReader

class LoginScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Get references to the views
        val signInButton: Button = findViewById(R.id.signInButton)
        val signUpTextView: TextView = findViewById(R.id.signUpTextView)
        val emailEditText: EditText = findViewById(R.id.emailEditText) // Assuming you have these in your login layout
        val passwordEditText: EditText = findViewById(R.id.passwordEditText) // Assuming you have these in your login layout

        // Set click listener for the "Sign In" button
        signInButton.setOnClickListener {
            val enteredEmail = emailEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            if (enteredEmail.equals("guest", ignoreCase = true) && enteredPassword.equals("guest", ignoreCase = true)) {
                // Guest login: Proceed directly to PatientDashboardActivity
                val intent = Intent(this, PatientDashboardActivity::class.java)
                startActivity(intent)
                finish() // Optional: Close LoginScreenActivity after navigating
            } else {
                // Normal login: Read user data from file and (you'll need to implement actual authentication)
                val userData = readUserDataFromFile()

                if (userData.isNotEmpty()) {
                    // For this basic example, we'll just navigate if the file exists.
                    // In a real app, you would validate entered email and password against the file content.
                    val intent = Intent(this, PatientDashboardActivity::class.java)
                    startActivity(intent)
                    finish() // Optional: Close LoginScreenActivity after navigating
                } else {
                    Toast.makeText(this, "No user data found. Please sign up first.", Toast.LENGTH_LONG).show()
                }
            }
        }

        // Set click listener for the "Sign up" TextView (hyperlink)
        signUpTextView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close LoginScreenActivity after navigating
        }
    }

    private fun readUserDataFromFile(): String {
        val filename = "user_data.txt"
        var fileContent = StringBuilder("")
        try {
            val fileInputStream: FileInputStream = openFileInput(filename)
            val inputStreamReader = InputStreamReader(fileInputStream)
            val bufferedReader = BufferedReader(inputStreamReader)
            var line: String? = bufferedReader.readLine()
            while (line != null) {
                fileContent.append(line).append("\n")
                line = bufferedReader.readLine()
            }
            bufferedReader.close()
            inputStreamReader.close()
            fileInputStream.close()
        } catch (e: IOException) {
            // File not found or error reading
            e.printStackTrace()
        }
        return fileContent.toString()
    }
}