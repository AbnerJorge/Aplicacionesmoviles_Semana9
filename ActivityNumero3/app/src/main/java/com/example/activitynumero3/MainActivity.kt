package com.example.activitynumero3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitynumero3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculateArea.setOnClickListener {
            val base = binding.inputBase.text.toString().toDoubleOrNull()
            val height = binding.inputHeight.text.toString().toDoubleOrNull()
            if (base != null && height != null) {
                val area = (base * height) / 2
                binding.tvResultArea.text = "Área: $area"
            } else {
                binding.tvResultArea.text = "Ingrese valores válidos"
            }
        }
    }
}