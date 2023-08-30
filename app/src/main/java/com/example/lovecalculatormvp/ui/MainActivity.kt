package com.example.lovecalculatormvp.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.changeScreen
import com.example.lovecalculatormvp.Presenter
import com.example.lovecalculatormvp.databinding.ActivityMainBinding
import com.example.lovecalculatormvp.model.LoveModel
import com.example.lovecalculatormvp.view.LoveView

class MainActivity : AppCompatActivity(), LoveView {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnCalculator.setOnClickListener {
                presenter.getLoveResult(firstEd.text.toString(), secondEd.text.toString())
            }
        }
    }

    override fun navigateToResultScreen(loveModel: LoveModel) {
        changeScreen(SecondActivity(), loveModel)
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}