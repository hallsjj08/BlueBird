package com.jjas.bluebird.core_game

import com.jjas.bluebird.game_service_handler.GameStateListener

abstract class Game(val listener: GameStateListener) : GameImpl{
}