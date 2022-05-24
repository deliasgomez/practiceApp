package com.example.practiceapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
lateinit var override: Override
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}