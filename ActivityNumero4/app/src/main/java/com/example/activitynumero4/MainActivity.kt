package com.example.activitynumero4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitynumero4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculateDays.setOnClickListener {
            val workers = binding.inputWorkers.text.toString().toIntOrNull()
            val initialDays = binding.inputInitialDays.text.toString().toIntOrNull()
            if (workers != null && initialDays != null && workers > 0) {
                val daysNeeded = (initialDays * 4) / workers
                binding.tvResultDays.text = "Días necesarios: $daysNeeded"
            } else {
                binding.tvResultDays.text = "Ingrese valores válidos"
            }
        }
    }
}