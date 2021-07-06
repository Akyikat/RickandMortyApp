package com.example.myapplication.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Season (
    val id: Int,
    val title: String,
    val urlImage: String
    ) : Parcelable
