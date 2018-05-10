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
        if(hasMinimumPlayer()) {
            prepGame();
            dealer.dealCards(2, players, deck);
            playHighCard();
        }
    }

    public void playHighCard() {

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

        if (results.size() > 1) {
            System.out.println("Its a draw");
            for (Player player : results) {
                System.out.println(player.getName() +" has a score of: " + player.handTotal());
            }
            return;
        }
        Player winner = results.get(0);

        System.out.println(winner.getName() + " has won with a score " + winner.handTotal());
        System.out.println("Game summary:");

        for(Player player : this.players){
            System.out.println(player.getName() + " scored " + player.handTotal());
        }
    }

//    public ArrayList<Player> getHighCardResults() {
//        ArrayList<Player> results = new ArrayList<>();
//        results.add(this.players.get(0));
//
//        for (Player player : this.players) {
//            if (player.handTotal() > results.get(0).handTotal()) {
//                results.clear();
//                results.add(player);
//            } else if (player.handTotal() == results.get(0).handTotal()) {
//                results.add(player);
//            }
//        }
//
//        if (results.size() > 1) {
//            if (results.get(0) == results.get(1)) {
//                results.remove(0);
//            }
//        }
//
//        return results;
//    }

    public boolean hasMinimumPlayer(){

        if (players.size() < 2) {
            System.out.println("Minimum 2 player required for HighCard");
            System.out.println();
            return false;
        }
        return true;
    }

    public void prepGame(){
        this.deck.resetDeck();
        clearPlayerHands();
    }


}
