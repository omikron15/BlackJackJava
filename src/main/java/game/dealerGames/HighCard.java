package game.dealerGames;

import deck.Deck;
import game.dealerGames.DealerCardGame;
import player.Player;

import java.util.ArrayList;

public class HighCard extends DealerCardGame {

    public HighCard(Deck deck) {
        super(deck);
    }

    public void play() {
        playHighCard();
    }

    public void playHighCard() {

        if (players.size() < 2) {
            System.out.println("Minimum 2 player required for High deck.Card");
            System.out.println();
            return;
        }

        this.deck.resetDeck();
        clearPlayerHands();
        dealer.dealCards(2, players, deck);

        ArrayList<Player> results = getHighCardResults();

        if (results.size() > 1) {
            System.out.println("Its a draw");
            return;
        }
        System.out.println(results.get(0).getName() + " has won!");

    }

    public ArrayList<Player> getHighCardResults() {
        ArrayList<Player> results = new ArrayList<>();
        results.add(this.players.get(0));

        for (Player player : this.players) {
            if (player.handTotal() > results.get(0).handTotal()) {
                results.clear();
                results.add(player);
            } else if (player.handTotal() == results.get(0).handTotal()) {
                results.add(player);
            }
        }

        if (results.size() > 1) {
            if (results.get(0) == results.get(1)) {
                results.remove(0);
            }
        }

        return results;
    }


}
