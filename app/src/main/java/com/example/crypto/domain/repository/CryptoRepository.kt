package com.example.crypto.domain.repository

import com.example.crypto.domain.modules.ConvertResponse
import io.reactivex.rxjava3.core.Single

interface CryptoRepository {
    fun convertCrypro(convertFrom: String, convertInto: String): Single<ConvertResponse>
}