package com.jjas.bluebird

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SinglePlayerGameTest {
    @Test
    fun testStartGame() {
        val game = SinglePlayerGame()
        game.startGame()
        assertEquals(5, game.getNest().size)
        val hands = game.getHands()
        for(element in hands) assertEquals(10, element.size)
    }
}