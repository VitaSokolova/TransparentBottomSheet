package com.example.transparentbottomsheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.WindowCompat
import com.example.transparentbottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(
                    android.R.id.content,
                    FirstFragment()
                )
                .commitNow()
        }
    }
}
