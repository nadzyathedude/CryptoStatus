package com.example.crypto.data.repository

import com.example.crypto.data.service.CryptoApi
import com.example.crypto.domain.modules.ConvertResponse
import com.example.crypto.domain.repository.CryptoRepository
import io.reactivex.rxjava3.core.Single

class CryptoRepositoryImpl(private val api: CryptoApi) : CryptoRepository {
    override fun convertCrypro(
        convertFrom: String,
        convertInto: String
    ): Single<ConvertResponse> {
        return api.getCryptoStatus(convertFrom, convertInto)
    }
}