package game;

import deck.Deck;
import player.Dealer;
import player.Player;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class CardGame implements Playable {

    protected Deck deck;
    protected ArrayList<Player> players;



    public CardGame(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
    }

    public Deck getDeck(){
        return this.deck;
    }

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player newPlayer){
        this.players.add(newPlayer);
    }

    public void displayPlayers(){
        if (playerCount() == 0){
            System.out.println("No players are currently in the game");
            System.out.println();
            return;
        }

        for (Player player : this.players){
            System.out.println(player.getName());
        }
    }

//    public void resetDeck(){
//        this.deck.resetDeck();
//    }
//
//    public void clearPlayerHands(){
//        for(Player player : this.players){
//            player.clearHand();
//        }
//    }

//    public void playBlackJack(){
//        if(players.size() < 1){
//            System.out.println("Minimum 1 player required for blackjack");
//            System.out.println();
//            return;
//        }
//        resetDeck();
//        clearPlayerHands();
//        dealer.dealCards(2, players, deck);
////        dealer.handTotal();
//        BlackJack();
//
//    }

//    public void BlackJack(){
//
//        System.out.println("BlackJack game.CardGame:");
//        System.out.println();
//        for (String result : BlackJackLogic()){
//            System.out.println(result);
//        }
//    }
//
//    public ArrayList<String> BlackJackLogic(){
//        ArrayList<String> results = new ArrayList<>();
//
//        if (dealer.checkForBlackJack()) {
//            results.add("player.Dealer has BlackJack, All players lose!");
//            return results;
//        } else {
//            for (Player player : players){
//                System.out.println(player.getName() + ", it is your turn");
//                blackJackTurn(player);
//            }
//        }
//
//        blackJackTurn(dealer);
//
//        results = blackJackResults();
//
//        return results;
//
//
//    }
//
//    public ArrayList<String> blackJackResults() {
//        ArrayList<String> results = new ArrayList<>();
//        for (Player player : players) {
//            if (player.isBust()) {
//                results.add(player.getName() + " is bust, player.Dealer wins");
//            } else if (dealer.isBust()) {
//                results.add(player.getName()+ " with " + player.blackJackHandTotal() + " beats the dealer who is bust");
//            }else{
//                if (player.blackJackHandTotal() > dealer.blackJackHandTotal()) {
//                    results.add(player.getName() + " with " + player.blackJackHandTotal() + " beats the dealer with " + dealer.blackJackHandTotal());
//                } else {
//                    results.add("player.Dealer with " + dealer.blackJackHandTotal() + " beats " + player.getName() + " with " + player.blackJackHandTotal());
//                }
//            }
//        }
//        return results;
//    }
//
//
//    public void blackJackTurn(Dealer dealer){
//        boolean turnFinished = false;
//        while (!turnFinished) {
//            if (dealer.blackJackHandTotal() < 16){
//                dealer.dealCard(dealer, deck);
//            } else{
//                return;
//            }
//
//        }
//    }
//
//    public void blackJackTurn(Player player){
//        Scanner input = new Scanner( System.in );
//        boolean turnFinished = false;
//        if (player.checkForBlackJack()){
//            System.out.println("BlackJack");
//            return;
//        }
//
//        while (!turnFinished){
//            if (player.checkForBlackJack()){
//                System.out.println("Your hand value is: 21...Automatic Stick ");
//                return;
//            }
//            System.out.println("Your hand value is: " + player.blackJackHandTotal());
//            System.out.println("Please enter 'Hit' or 'Stick'");
//            String user_input;
//            user_input = input.next();
//            user_input = user_input.toLowerCase();
//            if (user_input.equals("stick")){
//                System.out.println();
//                return;
//            }else if (user_input.equals("hit")){
//                dealer.dealCard(player, deck);
//                if (player.isBust()){
//                    turnFinished = true;
//                    System.out.println("Your hand value is: " + player.blackJackHandTotal());
//                    System.out.println("BUST!");
//                }
//            }
//
//        }
//    }

//    public ArrayList<Player> getHighCardResults(){
//        ArrayList<Player> results = new ArrayList<>();
//        results.add(this.players.get(0));
//
//        for (Player player : this.players){
//            if(player.handTotal() > results.get(0).handTotal()){
//                results.clear();
//                results.add(player);
//            }else if(player.handTotal() == results.get(0).handTotal()){
//                results.add(player);
//            }
//        }
//
//        if (results.size() > 1){
//            if (results.get(0) == results.get(1) ){
//                results.remove(0);
//            }
//        }
//
//        return results;
//    }
//
//    public void playHighCard(){
//
//        if(players.size() < 2){
//            System.out.println("Minimum 2 player required for High deck.Card");
//            System.out.println();
//            return;
//        }
//
//        resetDeck();
//        clearPlayerHands();
//        dealer.dealCards(2, players, deck);
//
//        ArrayList<Player> results = getHighCardResults();
//
//        if (results.size() > 1) {
//            System.out.println( "Its a draw");
//            return;
//        }
//        System.out.println(results.get(0).getName() + " has won!");
//
//    }


}
