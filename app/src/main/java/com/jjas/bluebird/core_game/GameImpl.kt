package com.jjas.bluebird.core_game

import com.jjas.bluebird.core_game.Card

interface GameImpl {

    fun startGame(userId: Long)

    fun submitNest(trump: String, nest: ArrayList<Card>)

    fun bidPass(bid: Int)

    fun playCard(cardId: Int)

}