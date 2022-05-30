package com.example.crypto.ui.base

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import moxy.MvpView
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

open class BasePresenter<View : MvpView> : MvpPresenter<View>(), KoinComponent {

    protected val router: Router by inject()

    open fun onBackPressed() {
        router.exit()
    }
}
