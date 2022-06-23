package com.example.practiceapp

import android.content.Intent
import android.database.sqlite.SQLiteConstraintException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.practiceapp.Database.User
import com.example.practiceapp.databinding.ActivityRegisterBinding


private lateinit var binding: ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.registerTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBack.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.registerEtName.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Utils().fullFieldsRegister(
                    binding.registerEtName,
                    binding.registerEtEmail,
                    binding.registerEtPass,
                    binding.registerBtnAccept
                )
            }
        })
        binding.registerEtEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Utils().fullFieldsRegister(
                    binding.registerEtName,
                    binding.registerEtEmail,
                    binding.registerEtPass,
                    binding.registerBtnAccept
                )
            }
        })
        binding.registerEtPass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Utils().fullFieldsRegister(
                    binding.registerEtName,
                    binding.registerEtEmail,
                    binding.registerEtPass,
                    binding.registerBtnAccept
                )
            }
        })
        binding.registerBtnAccept.setOnClickListener {
            val name = binding.registerEtName.text.toString()
            val email = binding.registerEtEmail.text.toString()
            val password = binding.registerEtPass.text.toString()
            val db = (application as UserApp).database
            try {
                db.userDao().insert(User(name, email, password))
                Toast.makeText(this, "Usuario agregado", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
            } catch (e: SQLiteConstraintException) {
                Toast.makeText(this, "El usuario ya existe", Toast.LENGTH_SHORT).show()

            }
        }
    }
}