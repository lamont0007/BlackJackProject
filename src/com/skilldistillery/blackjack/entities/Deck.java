package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public void creatDeckOfCard() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}

	}

	public int checkDeckSize() {
		return deck.size();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card dealCard() {
		Card aCard = null;
		aCard = deck.remove(0);
		return aCard;
	}

}
