package com.jjas.bluebird.core_game

interface GameImpl {

    fun startGame(userId: Long)

    fun bidPass(bid: Int)

    fun submitNest(trump: String, nest: ArrayList<Card>)

    fun playCard(cardId: Int)

    companion object GameAction {
        const val ACTION_START_GAME = "com.jjas.bluebird.action.START_GAME"
        const val ACTION_BID_PASS = "com.jjas.bluebird.action.BID_PASS"
        const val ACTION_SUBMIT_NEST = "com.jjas.bluebird.action.SUBMIT_NEST"
        const val ACTION_PLAY_CARD = "com.jjas.bluebird.action.PLAY_CARD"
    }

}