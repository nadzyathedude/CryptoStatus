package com.example.crypto.domain.intercator

import com.example.crypto.domain.modules.ConvertResponse
import com.example.crypto.domain.repository.CryptoRepository
import io.reactivex.rxjava3.core.Single

class CryptoInteractorImpl(private val cryptoRepository: CryptoRepository) : CryptoInteractor {
    override fun loadCurrencyStatus(
        convertFrom: String,
        convertInto: String
    ): Single<ConvertResponse> {
        return cryptoRepository.convertCrypro(convertFrom, convertInto)

    }
}
