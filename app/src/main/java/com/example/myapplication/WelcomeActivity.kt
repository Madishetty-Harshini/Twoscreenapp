package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Retrieve the username passed from MainActivity
        val username = intent.getStringExtra("username")
        val welcomeTextView = findViewById<TextView>(R.id.welcome_text)
        welcomeTextView.text = "Welcome, $username!"
    }
}
