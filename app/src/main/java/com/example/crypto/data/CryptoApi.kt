package com.example.crypto.data

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoApi {
    @GET()
    fun getCryptoStatus(
        @Query("fsym") cryptocurrencySymbol: String,
        @Query("tsyms") convertIntoSymbol: String
    ) : Deferred<>
}
