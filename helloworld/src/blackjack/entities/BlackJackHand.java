package blackjack.entities;

public class BlackJackHand extends Hand {

    @Override
    public int getHandValue() {
        int value = 0;
        int numOfAces = 0;

        for (Card card : cards) {
            value += card.getValue();

            if (card.getValue() == 11) {
                numOfAces++;
            }
        }

        while (value > 21 && numOfAces > 0) {
            value -= 10;
            numOfAces--;
        }

        return value;
    }

}
