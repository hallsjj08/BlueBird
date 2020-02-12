package com.jjas.bluebird.presentation

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayerPresentation(val id: Long, val name: String, val hand: List<CardPresentation>) : Parcelable