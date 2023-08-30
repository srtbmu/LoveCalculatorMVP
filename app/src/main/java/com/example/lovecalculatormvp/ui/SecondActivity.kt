package com.example.lovecalculatormvp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lovecalculatormvp.ResultPresenter
import com.example.lovecalculatormvp.databinding.ActivitySecondBinding
import com.example.lovecalculatormvp.model.LoveModel
import com.example.lovecalculatormvp.view.ResultView

class SecondActivity : AppCompatActivity(), ResultView {
    private lateinit var binding: ActivitySecondBinding
    private val presenter = ResultPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        val result = intent.getSerializableExtra("key") as LoveModel
        presenter.getData(result)
    }

    override fun showLove(
        percentage: String,
        result: String,
        firstName: String,
        secondName: String
    ) {
        with(binding) {
            firstNameEt.text = percentage
            secondNameEt.text = result
            TvLoveProcent.text = firstName
            Tvadvice.text = secondName
        }
    }
}