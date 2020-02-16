package com.jjas.bluebird.game_service_handler

import android.os.Handler
import android.os.Looper
import android.os.Message
import com.jjas.bluebird.core_game.GameImpl

class GameHandler(looper: Looper, val game: GameImpl) : Handler(looper) {

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        when(msg.what) {

            MESSAGE_START_GAME -> game.startGame(0)

            MESSAGE_BID_PASS -> game.bidPass(msg.arg1)

            MESSAGE_SUBMIT_NEST -> game.submitNest("", ArrayList())

            MESSAGE_PLAY_CARD -> game.playCard(0)
        }
    }

    companion object {
        const val MESSAGE_START_GAME = 0
        const val MESSAGE_BID_PASS = 1
        const val MESSAGE_SUBMIT_NEST = 2
        const val MESSAGE_PLAY_CARD = 3
    }
}