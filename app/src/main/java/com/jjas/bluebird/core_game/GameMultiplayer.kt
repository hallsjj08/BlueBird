package com.jjas.bluebird.core_game

import com.jjas.bluebird.game_service_handler.GameStateListener

class GameMultiplayer(listener: GameStateListener) : Game(listener) {
    override fun startGame(userId: Long) {
    }

    override fun submitNest(trump: String, nest: ArrayList<Card>) {
    }

    override fun bidPass(bid: Int) {
    }

    override fun playCard(cardId: Int) {
    }
}