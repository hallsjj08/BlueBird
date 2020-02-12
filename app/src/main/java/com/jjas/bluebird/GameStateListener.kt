package com.jjas.bluebird

import android.os.Parcelable

interface GameStateListener {

    fun onGameStateChanged(action: String, data: Parcelable)

}