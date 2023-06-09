package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	private Rank rank;
	private Suit suit;
	
	private Card() {
		
	}

	public Card(Rank rank, Suit Suit) {
		this.setRank(rank);
		this.setSuit(Suit);
	}

	public int getValue() {
		return Rank.getValue();
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int HashCode() {
		final int prime = 31;
		int bjResult = 1;
		bjResult = prime * bjResult;
		bjResult = prime * bjResult;
		return bjResult;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

}
