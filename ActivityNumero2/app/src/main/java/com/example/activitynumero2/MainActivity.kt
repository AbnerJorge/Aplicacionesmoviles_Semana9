package com.example.activitynumero2

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitynumero2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculateAges.setOnClickListener {
            val ageAna = binding.inputAgeAna.text.toString().toIntOrNull()
            if (ageAna != null) {
                val ageJuan = ageAna - 5
                binding.tvResultAges.text = "Ana: $ageAna años, Juan: $ageJuan años"
            } else {
                binding.tvResultAges.text = "Ingrese una edad válida"
            }
        }
    }
}