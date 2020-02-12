package com.jjas.bluebird

import android.os.Handler
import android.os.Looper
import android.os.Message

class GameHandler(looper: Looper, val game: GameImpl) : Handler(looper) {

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        when(msg.what) {

            MESSAGE_START_GAME -> game.startGame(msg.)

            MESSAGE_BID_PASS -> game.bidPass(msg.arg1)

            MESSAGE_SUBMIT_NEST -> game.run {
                val data = msg.data
                val trump = data.getString("")
                val nest = data.getParcelableArray("")
                submitNest(trump, nest)
            }

            MESSAGE_PLAY_CARD -> game.playCard(msg.arg1, msg.arg2)
        }
    }

    companion object {
        const val MESSAGE_START_GAME = 0
        const val MESSAGE_BID_PASS = 1
        const val MESSAGE_SUBMIT_NEST = 2
        const val MESSAGE_PLAY_CARD = 3
    }
}