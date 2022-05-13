package com.example.crypto.domain.modules

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ConvertResponse(
    @SerializedName("")
    @Expose
    val result: List<ConvertedCurrency>
)
