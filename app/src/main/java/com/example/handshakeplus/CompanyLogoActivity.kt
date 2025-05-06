package com.example.handshakeplus

// <!--Login Screen code-->

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class CompanyLogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_logo)

        // Delay the transition to TitleActivity by 2 seconds
        Handler().postDelayed({
            val intent = Intent(this, TitleActivity::class.java) // Changed to TitleActivity
            startActivity(intent)
            finish() // Close this activity
        }, 2000) // Delay in milliseconds (2 seconds)
    }
}