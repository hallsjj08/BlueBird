package com.jjas.bluebird.core_game

interface PresentationDataMapper<T, K> {

    fun mapToPresentation(): T

    fun mapToDataModel(): K

}