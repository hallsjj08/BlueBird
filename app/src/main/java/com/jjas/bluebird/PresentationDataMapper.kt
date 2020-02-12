package com.jjas.bluebird

interface PresentationDataMapper<T, K> {

    fun mapToPresentation(): T

    fun mapToDataModel(): K

}