import deck.Deck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckPopulated(){
        assertEquals(52, deck.getNumberOfCards() );
    }

    @Test
    public void giveCard(){
        deck.giveCard();
        assertEquals(51, deck.getNumberOfCards());
    }
}
