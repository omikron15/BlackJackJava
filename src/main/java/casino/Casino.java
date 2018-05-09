package casino;

import deck.Deck;
import game.CardGame;
import game.Playable;
import game.dealerGames.BlackJack;
import game.dealerGames.DealerCardGame;
import player.Dealer;
import player.Player;

import java.util.ArrayList;

public class Casino {

    String name;
    Dealer dealer;
    Deck deck;
    ArrayList<Playable> games;
    ArrayList<Player> players;

    public Casino(String name, Dealer dealer, Deck deck){
        this.name  = name;
        this.dealer = dealer;
        this.deck = deck;
        this.games = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int playerCount(){
        return this.players.size();
    }

    public int gameCount(){
        return this.games.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void addGame(CardGame cardGame){
        this.games.add(cardGame);
    }

    public void removePlayer(Player player){
        this.players.remove(player);
    }

    public void removeGame(CardGame cardGame){
        this.players.remove(cardGame);
    }

    public void playGame(Playable playable){
        ((CardGame) playable).addPlayers(players);

        if (playable instanceof DealerCardGame){
            ((DealerCardGame) playable).addDealer(dealer);
        }
        playable.play();
    }


}
