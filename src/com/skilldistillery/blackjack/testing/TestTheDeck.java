package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println(deck.checkDeckSize());
		deck.shuffle();
		for(cardNumber = 0; cardNumber <deck.checkDecksize(); cardNumber++) {
			Card card = deck.dealCard();
			System.out.println(card = " " + deck.checkDeckSize());
	}
	}
	

}