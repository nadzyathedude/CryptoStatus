package com.example.crypto.data.repository

import com.example.crypto.data.service.CryptoApi
import com.example.crypto.domain.modules.ConvertResponse
import com.example.crypto.domain.repository.CryptoRepository
import kotlinx.coroutines.Deferred

class CryptoRepositoryImpl(private val api: CryptoApi) : CryptoRepository {
    override fun convertCrypro(
        convertFrom: String,
        convertInto: String
    ): Deferred<ConvertResponse> {
        return api.getCryptoStatus(convertFrom, convertInto)
    }
}