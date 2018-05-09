import player.Dealer;
import deck.Deck;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player1;
    ArrayList<Player> players;

    @Before
    public void before() {
        dealer = new Dealer("DEALER");
        deck = new Deck();
        player1 = new Player("Name");
        players = new ArrayList<>();
        players.add(player1);


    }

    @Test
    public void hasName() {
        assertEquals("DEALER", dealer.getName());
    }

    @Test
    public void canDeal() {
        dealer.dealCards(2, players, deck);
        assertEquals(2, dealer.cardsInHand());
        assertEquals(2, player1.cardsInHand());
    }
}
