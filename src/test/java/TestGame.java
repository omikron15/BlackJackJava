import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestGame {

    Game game1;
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
        game1 = new Game(deck1, dealer1);
        player1 = new Player("Connor");
        player2 = new Player("Andrew");
        player3 = new Player("Fraser");
        player4 = new Player("X");
        player5 = new Player("Y");
    }

    @Test
    public void hasDeck(){
        assertNotNull(game1.getDeck());
    }

    @Test
    public void noPlayers(){
        assertEquals(0, game1.playerCount());
    }

    @Test
    public void hasPlayers(){
        game1.addPlayer(player1);
        game1.addPlayer(player2);
        assertEquals(2, game1.playerCount());
    }

//    @Test
//    public void dealCards(){
//        game1.addPlayer(player1);
//        game1.addPlayer(player2);
//        game1.dealCards(2);
//        assertEquals(2, player1.cardsInHand());
//        assertEquals(2, player2.cardsInHand());
//        assertEquals(48, deck1.getNumberOfCards());
//    }

//    @Test
//    public void getResults(){
//        game1.addPlayer(player1);
//        game1.addPlayer(player2);
//        game1.dealCards(2);
////      Player result = game1.getResults();
////      System.out.println(result.getName());
//        assertNotNull(game1.getResults());
//    }

//    @Test
//    public void getResultsMessage(){
//        game1.addPlayer(player1);
//        game1.addPlayer(player2);
//        game1.dealCards(2);
////        System.out.println(game1.displayResults());
//        assertTrue(game1.displayResults() instanceof String);
//    }

//    @Test
//    public void getBigAssGame(){
//        game1.addPlayer(player1);
//        game1.addPlayer(player2);
//        game1.addPlayer(player3);
//        game1.addPlayer(player4);
//        game1.addPlayer(player5);
//        game1.dealCards(4);
//        System.out.println(game1.displayResults());
//        assertTrue(game1.displayResults() instanceof String);
//    }

}
