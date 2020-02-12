package com.jjas.bluebird.game_service_handler

import android.os.Parcelable

interface GameStateListener {

    fun onGameStateChanged(action: String, data: Parcelable)

}