import game.dealerGames.BlackJack;
import player.Dealer;
import deck.Deck;
import game.CardGame;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CardGameTest {

    BlackJack blackJackGame;
    Deck deck1;
    Dealer dealer1;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;

    @Before
    public void before(){
        deck1 = new Deck();
        dealer1 = new Dealer("DEALER");
        blackJackGame = new BlackJack(deck1, dealer1);
        player1 = new Player("Connor");
        player2 = new Player("Andrew");
        player3 = new Player("Fraser");
        player4 = new Player("X");
        player5 = new Player("Y");
    }

    @Test
    public void hasDeck(){
        assertNotNull(blackJackGame.getDeck());
    }

    @Test
    public void noPlayers(){
        assertEquals(0, blackJackGame.playerCount());
    }

    @Test
    public void hasPlayers(){
        blackJackGame.addPlayer(player1);
        blackJackGame.addPlayer(player2);
        assertEquals(2, blackJackGame.playerCount());
    }

//    @Test
//    public void dealCards(){
//        cardGame1.addPlayer(player1);
//        cardGame1.addPlayer(player2);
//        cardGame1.dealCards(2);
//        assertEquals(2, player1.cardsInHand());
//        assertEquals(2, player2.cardsInHand());
//        assertEquals(48, deck1.getNumberOfCards());
//    }

//    @Test
//    public void getResults(){
//        cardGame1.addPlayer(player1);
//        cardGame1.addPlayer(player2);
//        cardGame1.dealCards(2);
////      player.Player result = cardGame1.getResults();
////      System.out.println(result.getName());
//        assertNotNull(cardGame1.getResults());
//    }

//    @Test
//    public void getResultsMessage(){
//        cardGame1.addPlayer(player1);
//        cardGame1.addPlayer(player2);
//        cardGame1.dealCards(2);
////        System.out.println(cardGame1.displayResults());
//        assertTrue(cardGame1.displayResults() instanceof String);
//    }

//    @Test
//    public void getBigAssGame(){
//        cardGame1.addPlayer(player1);
//        cardGame1.addPlayer(player2);
//        cardGame1.addPlayer(player3);
//        cardGame1.addPlayer(player4);
//        cardGame1.addPlayer(player5);
//        cardGame1.dealCards(4);
//        System.out.println(cardGame1.displayResults());
//        assertTrue(cardGame1.displayResults() instanceof String);
//    }

}
