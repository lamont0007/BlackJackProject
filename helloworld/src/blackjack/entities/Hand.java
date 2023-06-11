package blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    protected List<Card> cards = new ArrayList<>();

    public abstract int getHandValue();

    public void addCardToHand(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Card card : cards) {
            builder.append(card).append(", ");
        }
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 2); // Remove the last comma and space
        }
        return builder.toString();
    }
}
