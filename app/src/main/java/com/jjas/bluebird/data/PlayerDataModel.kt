package com.jjas.bluebird.data

import com.jjas.bluebird.data.CardDataModel

data class PlayerDataModel(val id: Long, val name: String, val hand: List<CardDataModel>)