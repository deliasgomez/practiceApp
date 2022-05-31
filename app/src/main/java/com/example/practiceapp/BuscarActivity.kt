package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.practiceapp.databinding.ActivityBuscarBinding
private lateinit var currentFragment : Fragment
private lateinit var binding: ActivityBuscarBinding
class BuscarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBuscarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,HomeFragment()).commit()

        binding.buscarBottonNavigation.setOnItemSelectedListener{
            when(it.itemId) {
                R.id.home -> currentFragment = HomeFragment()
                R.id.play -> currentFragment = PlayFragment()
                R.id.search -> currentFragment = SearchFragment()
                R.id.perfil -> currentFragment = UserFragment()

            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, currentFragment).commit()
            true


        }

        }
    }
