package com.blackjack.status;

/**
 * Created by posid on 11/28/2016
 */
public enum TableStatus {
    // Dealing cards to players
    DEALING,

    // Waiting on a player's input
    WAITING_ON_PLAYER,
//
//    // Waiting on player 2 input
//    WAITING_ON_2,
//
//    // Waiting on player 3 input
//    WAITING_ON_3,
//
//    // Waiting on player 4 input
//    WAITING_ON_4,
//
//    // Waiting on player 5 input
//    WAITING_ON_5,
//
//    // Waiting on player 6 input
//    WAITING_ON_6,

    // Dealer's turn
    DEALER_TURN,

    // Waiting on players to bet before the hand
    WAITING_ON_BETS,

    // Hand is over, waiting on all players to check in before going to next hand
    WAITING_ON_CHECKIN
}
