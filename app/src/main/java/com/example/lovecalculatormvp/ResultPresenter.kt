package com.example.lovecalculatormvp

import com.example.lovecalculatormvp.model.LoveModel
import com.example.lovecalculatormvp.view.ResultView

class ResultPresenter(private val resultView: ResultView) {

    fun getData(loveModel: LoveModel) {
        resultView.showLove(
            loveModel.firstName,
            loveModel.secondName,
            loveModel.percentage,
            loveModel.result
        )
    }
}