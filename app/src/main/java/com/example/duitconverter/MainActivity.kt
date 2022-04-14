package com.example.duitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.duitconverter.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener() {
            convert()
        }
    }

    fun convert() {
        val stringInTextField = binding.inputToConvertEditText.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        val selectedId = binding.duitOptions.checkedRadioButtonId
        val convertPercentage = when (selectedId)
        {
            R.id.option_euro -> 15620.81
            R.id.option_usd -> 14366.00
            R.id.option_yen -> 114.51
            else -> 03831.34
        }

        val Result = convertPercentage * cost!!
        val indonesianLocale  = Locale("in", "ID")
        val formattedConvert = NumberFormat.getCurrencyInstance(indonesianLocale).format(Result)
        binding.convertResult.text = getString(R.string.convert_result, formattedConvert)
    }
}