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

    public void addPlayers(ArrayList<Player> players){
        for (Player player : players){
            this.players.add(player);
        }
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




}
