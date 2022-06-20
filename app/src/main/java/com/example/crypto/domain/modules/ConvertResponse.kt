package com.example.crypto.domain.modules

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ConvertResponse(
    @SerializedName("result")
    @Expose
    val result: List<ConvertedCurrency>
) : Parcelable
