package ru.geekbrains.helloflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.helloflavors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = BuildConfig.MY_BUILD_TYPE
    }
}