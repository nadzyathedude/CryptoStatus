package com.example.crypto.domain.intercator

import com.example.crypto.domain.modules.ConvertResponse
import io.reactivex.rxjava3.core.Single

interface CryptoInteractor {
    fun loadCurrencyStatus(convertFrom: String, convertInto: String): Single<ConvertResponse>
}