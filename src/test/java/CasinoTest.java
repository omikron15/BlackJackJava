import casino.Casino;
import deck.Deck;
import org.junit.Before;
import org.junit.Test;
import player.Dealer;

import static org.junit.Assert.assertEquals;

public class CasinoTest {

    Casino casino1;
    Dealer dealer;
    Deck deck;

    @Before
    public void setUp() throws Exception {
        dealer = new Dealer("Mr Dealer");
        deck = new Deck();
        casino1 = new Casino("Connor's Casino", dealer, deck);
    }

    @Test
    public void getName() {
        assertEquals("Connor's Casino", casino1.getName());
    }

    @Test
    public void getInitialGameCount() {
        assertEquals(0, casino1.gameCount());
    }

    @Test
    public void getInitialPlayerCount() {
        assertEquals(0, casino1.playerCount());
    }
}
