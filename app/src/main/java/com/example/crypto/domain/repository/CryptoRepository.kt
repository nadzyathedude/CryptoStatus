package com.example.crypto.domain.repository

import com.example.crypto.domain.modules.ConvertResponse
import kotlinx.coroutines.Deferred

interface CryptoRepository {
    fun convertCrypro(convertFrom: String, convertInto: String): Deferred<ConvertResponse>
}