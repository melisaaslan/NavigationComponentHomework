package com.maslan.navigationcomponent.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KisiselBilgiModel(
    val nameSurname: String,
    val phone: String,
    val email: String
) : Parcelable


