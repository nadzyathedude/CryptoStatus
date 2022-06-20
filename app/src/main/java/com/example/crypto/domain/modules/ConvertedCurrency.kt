package com.example.crypto.domain.modules

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ConvertedCurrency(
    @SerializedName("") @Expose val currencyName: String,

    @SerializedName("") @Expose val currencyCost: Float
) : Parcelable
