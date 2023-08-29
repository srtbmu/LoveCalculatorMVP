package com.example.lovecalculatormvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lovecalculatormvp.R
import com.example.lovecalculatormvp.databinding.ActivitySecondBinding
import com.example.lovecalculatormvp.model.LoveModel

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        val result = intent.getSerializableExtra("key") as LoveModel
        with(binding) {
            firstName.text = result.firstName
            secondName.text = result.secondName
            textResult.text = result.percentage + "%"
            text.text = result.result
        }
    }
}