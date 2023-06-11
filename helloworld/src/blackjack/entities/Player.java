package blackjack.entities;
import java.util.List;
import java.util.Scanner;


public class Player extends Hand {
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

    public void play(Deck deck) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (!isBust()) {
            System.out.println("Enter 'H' to Hit or 'S' to Stand: ");
            choice = scanner.nextLine().toUpperCase();

            if (choice.equals("H")) {
                addCardToHand(deck.dealCard());
                System.out.println("Player's Hand: " + getHand());
                System.out.println("Player's Hand Value: " + getHandValue());
            } else if (choice.equals("S")) {
                break;
            }
        }
    }
    
    public List<Card> getHand() {
        return cards;
    }

    public boolean isBust() {
        return getHandValue() > 21;
    }
}
