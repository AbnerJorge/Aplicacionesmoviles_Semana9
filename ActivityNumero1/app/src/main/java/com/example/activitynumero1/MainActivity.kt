package com.example.activitynumero1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitynumero1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckPrime.setOnClickListener {
            val number = binding.inputNumber.text.toString().toIntOrNull()
            if (number != null){
                val isPrime = isPrime(number)
                binding.tvResultPrime.text = if (isPrime) "Es primo" else "No es primo"
            } else{
                binding.tvResultPrime.text = "Ingrese un número válido"
            }
        }
    }
}

private fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}