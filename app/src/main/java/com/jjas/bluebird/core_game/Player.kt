package com.jjas.bluebird.core_game

import com.jjas.bluebird.data.PlayerDataModel
import com.jjas.bluebird.presentation.PlayerPresentation

class Player(val id: Long, val name: String, val hand: ArrayList<Card>) :
    PresentationDataMapper<PlayerPresentation, PlayerDataModel> {

    fun addCard(card: Card) {
        hand.add(card)
    }

    override fun mapToPresentation(): PlayerPresentation {
        return PlayerPresentation(
            id,
            name,
            hand.map { it.mapToPresentation() })
    }

    override fun mapToDataModel(): PlayerDataModel {
        return PlayerDataModel(
            id,
            name,
            hand.map { it.mapToDataModel() })
    }
}