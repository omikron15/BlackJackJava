package game.dealerGames;

import deck.Deck;
import game.CardGame;
import player.Dealer;

public abstract class DealerCardGame extends CardGame {

    protected Dealer dealer;

    public DealerCardGame(Deck deck, Dealer dealer) {
        super(deck);
        this.dealer = dealer;
    }
}
