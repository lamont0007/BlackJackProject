package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

	public static void main(String[] args) {

		Deck deck = new Deck();
		System.out.println(deck.checkDeckSize());

		deck.shuffle();
		final int initialDeckSize = deck.checkDeckSize();

		for (int cardNumber = 0; cardNumber < initialDeckSize; cardNumber++) {
			Card card = deck.dealCard();

			System.out.println("cardNumber: " + cardNumber + " " + card + " " + deck.checkDeckSize());
		}
	}

}