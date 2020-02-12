package com.jjas.bluebird.core_game

import com.jjas.bluebird.data.CardDataModel
import com.jjas.bluebird.presentation.CardPresentation

data class Card(val id: Int, val suit: String, val number: Int, val pointValue: Int, val drawableId: Int)
    :
    PresentationDataMapper<CardPresentation, CardDataModel> {
    override fun mapToPresentation(): CardPresentation {
        return CardPresentation(id, drawableId)
    }

    override fun mapToDataModel(): CardDataModel {
        return CardDataModel(id)
    }

}