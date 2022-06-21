package com.example.crypto.ui.fragment

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType


interface StatusView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun initRecycler(currencyStatusResponse: List<Float>)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showProgressBarState()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showContentState()
}