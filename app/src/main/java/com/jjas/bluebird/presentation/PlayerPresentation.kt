package com.jjas.bluebird.presentation

import android.os.Parcelable
import com.jjas.bluebird.presentation.CardPresentation
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayerPresentation(val id: Long, val name: String, val hand: List<CardPresentation>) : Parcelable