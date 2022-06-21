package com.example.crypto.domain.modules

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ConvertResponse(
    @SerializedName("RUB")
    @Expose
    val rub : Float,

    @SerializedName("USD")
    @Expose
    val usd : Float,

    @SerializedName("EUR")
    @Expose
    val eur : Float
) : Parcelable
