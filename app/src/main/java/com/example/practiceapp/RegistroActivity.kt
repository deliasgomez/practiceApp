package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.databinding.ActivityRegistroBinding


private lateinit var binding: ActivityRegistroBinding
class ActivityRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.registroTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBack.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}