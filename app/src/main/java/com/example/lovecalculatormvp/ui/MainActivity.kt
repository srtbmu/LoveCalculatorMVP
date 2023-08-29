package com.example.lovecalculatormvp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
        val intent = Intent(this, SecondActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("key", loveModel)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}