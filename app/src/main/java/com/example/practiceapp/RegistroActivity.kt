package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isNotEmpty
import androidx.core.widget.doOnTextChanged
import com.example.practiceapp.databinding.ActivityRegistroBinding

private lateinit var binding: ActivityRegistroBinding
class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.registroTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}