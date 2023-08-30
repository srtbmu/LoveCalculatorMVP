package com.example.lovecalculatormvp.view

import com.example.lovecalculatormvp.model.LoveModel

interface LoveView {

    fun navigateToResultScreen(loveModel: LoveModel)

    fun showError(error: String)
}