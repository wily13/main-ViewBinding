package com.example.mainviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mainviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.textView?.text = "This is view binding"
    }
}