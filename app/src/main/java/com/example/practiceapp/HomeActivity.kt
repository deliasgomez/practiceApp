package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.practiceapp.databinding.ActivitySearchBinding

private lateinit var currentFragment : Fragment
private lateinit var binding: ActivitySearchBinding
class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,HomeFragment()).commit()

        binding.searchButtonNavigation.setOnItemSelectedListener{
            when(it.itemId) {
                R.id.home   -> currentFragment = HomeFragment()
                R.id.play   -> currentFragment = PlayFragment()
                R.id.search -> currentFragment = SearchFragment()
                R.id.perfil -> currentFragment = UserFragment()

            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, currentFragment).commit()
            true


        }

        }
    }
