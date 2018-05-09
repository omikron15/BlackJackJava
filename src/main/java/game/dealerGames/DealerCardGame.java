package game.dealerGames;

import deck.Deck;
import game.CardGame;
import player.Dealer;
import player.Player;

public abstract class DealerCardGame extends CardGame {

    protected Dealer dealer;

    public DealerCardGame(Deck deck) {
        super(deck);
    }

    public void addDealer(Dealer dealer){
        this.dealer = dealer;
    }


    public void resetDeck(){
        this.deck.resetDeck();
    }

    public void clearPlayerHands(){
        for(Player player : this.players){
            player.clearHand();
        }
    }
}
