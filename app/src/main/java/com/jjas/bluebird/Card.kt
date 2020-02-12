package com.jjas.bluebird

data class Card(val id: Int, val suit: String, val number: Int, val pointValue: Int, val drawableId: Int)
    : PresentationDataMapper<CardPresentation, CardDataModel> {
    override fun mapToPresentation(): CardPresentation {
        return CardPresentation(id, drawableId)
    }

    override fun mapToDataModel(): CardDataModel {
        return CardDataModel(id)
    }

}