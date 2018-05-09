import casino.Casino;
import deck.Deck;
import game.CardGame;
import game.dealerGames.BlackJack;
import org.junit.Before;
import org.junit.Test;
import player.Dealer;
import player.Player;

import static org.junit.Assert.assertEquals;

public class CasinoTest {

    Casino casino1;
    Dealer dealer;
    Deck deck;
    BlackJack blackJackGame;
    Player player;

    @Before
    public void before() {
        dealer = new Dealer("Mr Dealer");
        deck = new Deck();
        casino1 = new Casino("Connor's Casino", dealer, deck);
        blackJackGame = new BlackJack(deck, dealer);
        player = new Player("Player 1");
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

    @Test
    public void addGame() {
        casino1.addGame(blackJackGame);
        assertEquals(1, casino1.gameCount());
    }

    @Test
    public void addPlayer() {
        casino1.addPlayer(player);
        assertEquals(1, casino1.playerCount());
    }

    @Test
    public void removeGame() {
        casino1.removeGame(blackJackGame);
        assertEquals(0, casino1.gameCount());
    }

    @Test
    public void removePlayer() {
        casino1.removePlayer(player);
        assertEquals(0, casino1.playerCount());
    }


}
