package com.example.mainviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mainviewbinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.apply {
            title = "Second Activity"
            setDisplayHomeAsUpEnabled(true)
        }

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFirstFragment = FirstFragment()
        val fragment = supportFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)

        if (fragment !is FirstFragment) {
            supportFragmentManager.beginTransaction()
                .add(binding.frameContainer.id, mFirstFragment, FirstFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}