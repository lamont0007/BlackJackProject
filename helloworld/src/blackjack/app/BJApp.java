package blackjack.app;

import blackjack.entities.Card;
import blackjack.entities.Deck;
import blackjack.entities.Player;
import blackjack.entities.Dealer;

public class BJApp {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player();
        Dealer dealer = new Dealer();
        dealer.setDeck(deck);

        dealer.dealInitialCards(player);

        System.out.println("-- Welcome to Blackjack! --");
        System.out.println();
        System.out.println("Player's Hand: " + player.getHand());
        System.out.println("Player's Hand Value: " + player.getHandValue());
        System.out.println();
        System.out.println("Dealer's Hand: " + dealer.getVisibleHand());
        System.out.println("Dealer's Hand Value: " + dealer.getVisibleHandValue());
        System.out.println();
        System.out.println("-- Player's Turn --");
        System.out.println();

        player.play(deck);

        System.out.println("-- Dealer's Turn --");
        System.out.println();
        dealer.play(deck);

        System.out.println("-- Final Result --");
        System.out.println();
        System.out.println("Player's Hand: " + player.getHand());
        System.out.println("Player's Hand Value: " + player.getHandValue());
        System.out.println();
        System.out.println("Dealer's Hand: " + dealer.getHand());
        System.out.println("Dealer's Hand Value: " + dealer.getHandValue());
        System.out.println();

        determineWinner(player, dealer);
    }

    private static void determineWinner(Player player, Dealer dealer) {
        int playerHandValue = player.getHandValue();
        int dealerHandValue = dealer.getHandValue();

        if (playerHandValue > 21 && dealerHandValue > 21) {
            System.out.println("Both player and dealer bust. It's a tie!");
        } else if (playerHandValue > 21) {
            System.out.println("Player busts. Dealer wins!");
        } else if (dealerHandValue > 21) {
            System.out.println("Dealer busts. Player wins!");
        } else if (playerHandValue == dealerHandValue) {
            System.out.println("It's a tie!");
        } else if (playerHandValue > dealerHandValue) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
    }
}
