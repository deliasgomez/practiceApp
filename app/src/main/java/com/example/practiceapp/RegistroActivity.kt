package com.example.practiceapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.activity.viewModels
import com.example.practiceapp.databinding.ActivityRegistroBinding


private lateinit var binding: ActivityRegistroBinding
class ActivityRegistro : AppCompatActivity() {
    private val viewModel: RegistroViewModel by viewModels {
        RegistroViewModelFactory(
            (application as UserApp).database
                .userDao()
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.registroTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.registerBack.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.registerEtName.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.registerEtPass.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 ){
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#4B4747"))
                }else{
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#9D9C9C"))
                }
            }
        })
        binding.registerEtEmail.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.registerEtPass.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 ){
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#4B4747"))
                }else{
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#9D9C9C"))
                }
            }
        })
        binding.registerEtPass.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.registerEtPass.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 && binding.registerEtEmail.text?.length!! > 0 ){
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#4B4747"))
                }else{
                    binding.registerBtnAceptar.setBackgroundColor(Color.parseColor("#9D9C9C"))
                }
            }
        })
        binding.registerBtnAceptar.setOnClickListener{
            val name = binding.registerEtName.text.toString()
            val email = binding.registerEtEmail.text.toString()
            val pass = binding.registerEtPass.text.toString()

            if(name?.isNullOrEmpty()==true &&  email?.isNullOrEmpty()==true && pass?.isNullOrEmpty()==true){
                viewModel.registrar(User(name , email, pass))

            }


        }


    }
}