package com.example.crypto.ui.fragment

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.crypto.domain.modules.ConvertedCurrency


interface StatusView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun extractConvertedMoneyResult(currencyStatusResponse: List<ConvertedCurrency>)
}