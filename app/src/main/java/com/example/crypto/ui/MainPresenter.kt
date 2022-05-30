package com.example.crypto.ui

import com.example.crypto.ui.base.BasePresenter
import com.example.crypto.ui.base.Screens
import moxy.MvpView

class MainPresenter : BasePresenter<MvpView>()  {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.newRootScreen(Screens.Ethereum())
    }
}