package com.hasanbilgin.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hasanbilgin.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun mySum(view: View) {
        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null) {
            binding.resultText.text = "Hata!"
        } else {
            result = number1!! + number2!!
            binding.resultText.text = "Sonuç: $result"
        }
    }

    fun mySub(view: View) {
        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null) {
            binding.resultText.text = "Hata!"
        } else {
            result = number1!! - number2!!
            binding.resultText.text = "Sonuç: $result"
        }
    }

    fun myMultiply(view: View) {
        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null) {
            binding.resultText.text = "Hata!"
        } else {
            result = number1!! * number2!!
            binding.resultText.text = "Sonuç: $result"
        }
    }

    fun myDiv(view: View) {
        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null) {
            binding.resultText.text = "Hata!"
        } else {
            result = number1!! / number2!!
            binding.resultText.text = "Sonuç: $result"
        }
    }
}