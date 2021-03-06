package com.ltmtlu.revolut.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrencyRateModel constructor(
    val base: String,
    val date: String,
    val rates: Map<String, Float>
) : Parcelable