package blackjack.entities;

import java.util.List;

public class Dealer extends Player {
    private Deck deck;

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void dealInitialCards(Player player) {
        player.addCardToHand(deck.dealCard());
        addCardToHand(deck.dealCard());
        player.addCardToHand(deck.dealCard());
        addCardToHand(deck.dealCard());
    }

    public void play(Deck deck) {
        while (getHandValue() < 17) {
            addCardToHand(deck.dealCard());
        }
    }

    public String getVisibleHand() {
        StringBuilder builder = new StringBuilder();
        List<Card> visibleCards = cards.subList(1, cards.size());
        for (Card card : visibleCards) {
            builder.append(card).append(", ");
        }
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 2); // Remove the last comma and space
        }
        return builder.toString();
    }

    public int getVisibleHandValue() {
        int value = 0;
        for (int i = 1; i < cards.size(); i++) {
            value += cards.get(i).getValue();
        }
        return value;
    }
}
