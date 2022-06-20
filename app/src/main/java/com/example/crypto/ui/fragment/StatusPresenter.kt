package com.example.crypto.ui.fragment

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.crypto.domain.intercator.CryptoInteractor
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@InjectViewState
class StatusPresenter() : MvpPresenter<StatusView>(), KoinComponent {
    private val converInto = "RUB,EUR,USD,YEN"
    private val compositeDisposable = CompositeDisposable()
    private val interactor: CryptoInteractor by inject()

    fun loadData(convertFrom: String) {
        compositeDisposable.add(
            interactor.loadCurrencyStatus("ETH", converInto)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { convertedResult ->
                    viewState.extractConvertedMoneyResult(convertedResult.result)
                }

        )
    }
}
