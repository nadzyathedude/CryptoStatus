package com.example.crypto.domain.modules

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ConvertedCurrency(
    @SerializedName("") @Expose val currencyName: String,

    @SerializedName("") @Expose val currencyCost: Float
)
