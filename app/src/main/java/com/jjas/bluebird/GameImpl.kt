package com.jjas.bluebird

interface GameImpl {

    fun startGame(userId: Long)

    fun submitNest(trump: String, nest: ArrayList<Card>)

    fun bidPass(bid: Int)

    fun playCard(cardId: Int)

}