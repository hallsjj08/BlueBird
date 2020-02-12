package com.jjas.bluebird.core_game

import com.jjas.bluebird.game_service_handler.GameStateListener

class GameSinglePlayer(listener: GameStateListener) :
    Game(listener) {

    lateinit var trump: String
    private var nest = arrayListOf<Card>()
    private val hands = arrayOf(arrayListOf<Card>(), arrayListOf(), arrayListOf(), arrayListOf())

    override fun startGame(userId: Long) {

        val deck = Deck()

        var card: Card?

        for(i in 1..5) {
            card = deck.takeTop()
            if(card != null) nest.add(card)
        }

        for(i in 0..deck.size()) {
            card = deck.takeTop()
            if(card != null) hands[i % 4].add(card)
        }

        listener.onGameStateChanged("startGame")

    }

    override fun submitNest(trump: String, nest: ArrayList<Card>) {
        this.trump = trump
        this.nest = nest
    }

    override fun bidPass(bid: Int) {

    }

    override fun playCard(cardId: Int) {

    }

    fun getNest(): ArrayList<Card> {
        return nest
    }

    fun getPlayerHand(): ArrayList<Card> {
        return hands[0]
    }

    fun getCPU1Hand(): ArrayList<Card> {
        return hands[1]
    }

    fun getCPU2Hand(): ArrayList<Card> {
        return hands[2]
    }

    fun getCPU3Hand(): ArrayList<Card> {
        return hands[3]
    }

    fun getHands(): Array<ArrayList<Card>> {
        return hands
    }

}