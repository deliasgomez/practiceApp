package com.example.practiceapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.practiceapp.databinding.ActivityLoginBinding


private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.PracticeApp)
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginTvRegister.setOnClickListener {
            startActivity(Intent(this, ActivityRegistro::class.java))
        }

        binding.loginBtnLogin.setOnClickListener {
            val email = binding.loginEtUser.text.toString()
            val password= binding.loginEtpass.text.toString()
            val db = (application as UserApp).database
            val userdb = db.userDao().getById(email)
            val email_db = userdb.email
            val pass_db = userdb.password
            if (email == email_db && pass_db == password){
                startActivity(Intent(this, BuscarActivity::class.java))
            }else{
                Toast.makeText(this, " Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show()
            }
        }
        binding.loginEtUser.addTextChangedListener(object : TextWatcher{

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.loginEtUser.text?.length!! > 0 && binding.loginEtpass.text?.length!! > 0 ){
                    binding.loginBtnLogin.setBackgroundColor(Color.parseColor("#4B4747"))
                }else{
                    binding.loginBtnLogin.setBackgroundColor(Color.parseColor("#9D9C9C"))
                }
            }
        })
        binding.loginEtpass.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.loginEtUser.text?.length!! > 0 && binding.loginEtpass.text?.length!! > 0 ){
                    binding.loginBtnLogin.setBackgroundColor(Color.parseColor("#4B4747"))
                }else{
                    binding.loginBtnLogin.setBackgroundColor(Color.parseColor("#9D9C9C"))
                }
            }
        })
    }
}





