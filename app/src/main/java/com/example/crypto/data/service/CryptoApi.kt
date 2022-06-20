package com.example.crypto.data.service

import com.example.crypto.domain.modules.ConvertResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoApi {
    @GET("price")
    fun getCryptoStatus(
        @Query("fsym") cryptocurrencySymbol: String,
        @Query("tsyms") convertIntoSymbol: String
    ): Single<ConvertResponse>
}
