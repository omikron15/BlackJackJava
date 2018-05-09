import deck.Card;
import deck.Rank;
import deck.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void getSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void getRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void getRankValue(){
        int value = card.getValueFromEnum();
        assertEquals(11, value);
    }

}
