package com.skilldistillery.blackjack.entities;

public enum Suit {
	SPADE("Spades"), CLUB("Clubs"), DIAMOND("Diamonds"), HEART("Hearts");

	private final String veryNiceName;

	Suit(String niceName) {

		veryNiceName = niceName;

	}

	public String getVeryniceName() {
		return veryNiceName;
	}

	@Override
	public String toString() {
		return veryNiceName;
	}

}
