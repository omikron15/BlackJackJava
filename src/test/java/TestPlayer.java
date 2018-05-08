import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player1;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){
        player1 = new Player("Connor");
        card1 = new Card(Suit.SPADES, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.EIGHT);
        card3 = new Card(Suit.HEARTS, Rank.KING);
        card4 = new Card(Suit.CLUBS, Rank.QUEEN);

    }

    @Test
    public void getName(){
        assertEquals("Connor", player1.getName());
    }

    @Test
    public void noHand(){
          assertEquals(0, player1.cardsInHand());
    }

    @Test
    public void getCard(){
        player1.getCard(card1);
        assertEquals(1, player1.cardsInHand());
    }

    @Test
    public void HandTotal__oneCard(){
        player1.getCard(card1);
        assertEquals(11, player1.handTotal());
    }

    @Test
    public void HandTotal__twoCards(){
        player1.getCard(card1);
        player1.getCard(card2);
        assertEquals(19, player1.handTotal());
    }

    @Test
    public void blackJackHandTotal__21() {
        player1.getCard(card1);
        player1.getCard(card3);
        assertEquals(21, player1.BlackJackHandTotal());
        assertEquals(true, player1.checkForBlackJack());

    }

    @Test
    public void blackJackHandTotal__Not21() {
        player1.getCard(card1);
        player1.getCard(card2);
        assertEquals(19, player1.BlackJackHandTotal());
        assertEquals(false, player1.checkForBlackJack());

    }
}
