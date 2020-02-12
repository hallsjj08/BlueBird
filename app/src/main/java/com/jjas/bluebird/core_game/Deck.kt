package com.jjas.bluebird.core_game

import com.jjas.bluebird.R
import java.util.*
import kotlin.collections.ArrayList

class Deck {

    private var deck = ArrayList(unsheffledDeck)

    init {
        deck.shuffle()
    }

    fun takeTop(): Card? {
        return if(deck.isNotEmpty()) deck.removeAt(0) else null
    }

    fun size(): Int {
        return deck.size
    }

    companion object {

        const val SUIT_CLUB = "club"
        const val SWUIT_SPADE = "spade"
        const val SUIT_DIAMOND = "diamond"
        const val SUIT_HEARTS = "hearts"
        const val JOKER = "joker"

        val unsheffledDeck = Collections.unmodifiableList(arrayListOf(
            Card(0, SUIT_CLUB, 1, 15, R.drawable._2_of_clubs),
            Card(1, SUIT_CLUB, 5, 5, R.drawable._5_of_clubs),
            Card(2, SUIT_CLUB, 6, 0, R.drawable._6_of_clubs),
            Card(3, SUIT_CLUB, 7, 0, R.drawable._7_of_clubs),
            Card(4, SUIT_CLUB, 8, 0, R.drawable._8_of_clubs),
            Card(5, SUIT_CLUB, 9, 0, R.drawable._9_of_clubs),
            Card(6, SUIT_CLUB, 10, 10, R.drawable._10_of_clubs),
            Card(7, SUIT_CLUB, 11, 0, R.drawable.jack_of_clubs),
            Card(8, SUIT_CLUB, 12, 0, R.drawable.queen_of_clubs2),
            Card(9, SUIT_CLUB, 13, 0, R.drawable.king_of_clubs2),
            Card(10,SUIT_CLUB, 14, 10, R.drawable.ace_of_clubs),

            Card(11, SWUIT_SPADE, 1, 15, R.drawable._2_of_spades),
            Card(12, SWUIT_SPADE, 5, 5, R.drawable._5_of_spades),
            Card(13, SWUIT_SPADE, 6, 0, R.drawable._6_of_spades),
            Card(14, SWUIT_SPADE, 7, 0, R.drawable._7_of_spades),
            Card(15, SWUIT_SPADE, 8, 0, R.drawable._8_of_spades),
            Card(16, SWUIT_SPADE, 9, 0, R.drawable._9_of_spades),
            Card(17, SWUIT_SPADE, 10, 10, R.drawable._10_of_spades),
            Card(18, SWUIT_SPADE, 11, 0, R.drawable.jack_of_spades),
            Card(19, SWUIT_SPADE, 12, 0, R.drawable.queen_of_spades2),
            Card(20, SWUIT_SPADE, 13, 0, R.drawable.king_of_spades2),
            Card(21, SWUIT_SPADE, 14, 10, R.drawable.ace_of_spades),

            Card(22, SUIT_DIAMOND, 1, 15, R.drawable._2_of_diamonds),
            Card(23, SUIT_DIAMOND, 5, 5, R.drawable._5_of_diamonds),
            Card(24, SUIT_DIAMOND, 6, 0, R.drawable._6_of_diamonds),
            Card(25, SUIT_DIAMOND, 7, 0, R.drawable._7_of_diamonds),
            Card(26, SUIT_DIAMOND, 8, 0, R.drawable._8_of_diamonds),
            Card(27, SUIT_DIAMOND, 9, 0, R.drawable._9_of_diamonds),
            Card(28, SUIT_DIAMOND, 10, 10, R.drawable._10_of_diamonds),
            Card(29, SUIT_DIAMOND, 11, 0, R.drawable.jack_of_diamonds),
            Card(30, SUIT_DIAMOND, 12, 0, R.drawable.queen_of_diamonds2),
            Card(31, SUIT_DIAMOND, 13, 0, R.drawable.king_of_diamonds2),
            Card(32, SUIT_DIAMOND, 14, 10, R.drawable.ace_of_diamonds),

            Card(33, SUIT_HEARTS, 1, 15, R.drawable._2_of_hearts),
            Card(34, SUIT_HEARTS, 5, 5, R.drawable._5_of_hearts),
            Card(35, SUIT_HEARTS, 6, 0, R.drawable._6_of_hearts),
            Card(36, SUIT_HEARTS, 7, 0, R.drawable._7_of_hearts),
            Card(37, SUIT_HEARTS, 8, 0, R.drawable._8_of_hearts),
            Card(38, SUIT_HEARTS, 9, 0, R.drawable._9_of_hearts),
            Card(39, SUIT_HEARTS, 10, 10, R.drawable._10_of_hearts),
            Card(40, SUIT_HEARTS, 11, 0, R.drawable.jack_of_hearts),
            Card(41, SUIT_HEARTS, 12, 0, R.drawable.queen_of_hearts2),
            Card(42, SUIT_HEARTS, 13, 0, R.drawable.king_of_hearts2),
            Card(43, SUIT_HEARTS, 14, 10, R.drawable.ace_of_hearts),

            Card(44, JOKER, 20, 20, R.drawable.red_joker))
        )
    }
}