package com.example.myapplication.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Episode(
    val description: String,
    val id: Int,
    val title: String,
    val videoPreviewImage: String,
    val videoUrl: String,
):Parcelable