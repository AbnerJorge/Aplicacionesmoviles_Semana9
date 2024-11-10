package com.example.activitynumero5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitynumero5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowFactors.setOnClickListener {
            val factors = getFactors(60)
            val isComposite = factors.size > 2
            binding.tvResultFactors.text = "Factores: ${factors.joinToString(", ")}\nEs compuesto: $isComposite"
        }
    }

    private fun getFactors(num: Int): List<Int> {
        val factors = mutableListOf<Int>()
        for (i in 1..num) {
            if (num % i == 0) factors.add(i)
        }
        return factors
    }
}