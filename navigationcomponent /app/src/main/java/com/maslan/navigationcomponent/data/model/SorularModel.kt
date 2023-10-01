package com.maslan.navigationcomponent.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SorularModel(

    val nameSurname: String,
    val email: String,
    val phone: String,
    val hobi: String,
    val hobibir: String,
    val hobiiki: String
) : Parcelable
