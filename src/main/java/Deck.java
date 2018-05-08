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
                Card card = new Card(suit, rank);
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
}
