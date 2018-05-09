package deck;
import deck.Card;
import deck.Rank;
import deck.Suit;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        populateDeck();
        shuffleDeck();
    }

    private void populateDeck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                Card card;
                card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public int getNumberOfCards(){
        return this.cards.size();
    }

    private void shuffleDeck(){
        Collections.shuffle(this.cards);
    }

    public Card giveCard(){
        return this.cards.remove(0);
    }

    public void resetDeck(){
        cards.clear();
        populateDeck();
        shuffleDeck();
    }
}
