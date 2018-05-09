import casino.Casino;
import game.dealerGames.HighCard;
import player.Dealer;
import deck.Deck;
import game.CardGame;
import player.Player;

import java.util.Scanner;

public class Runner {

   static CardGame cardGame1;
   static Scanner input = new Scanner( System.in );

//  New declaration after refactor
   static Deck deck;
   static Dealer dealer;
   static Casino casino;
   static Player player1;
   static Player player2;
   static HighCard highCard;


    public static void main(String[] args) {
        deck = new Deck();
        dealer = new Dealer("Dealer");
        casino = new Casino("Connor's Casino", dealer, deck);
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        highCard = new HighCard(deck);
        casino.addPlayer(player1);
        casino.addPlayer(player2);
        casino.addGame(highCard);


        casino.playGame(highCard);


    }
//
//        deck1 = new Deck();
//        dealer1 = new Dealer("DEALER");
//        cardGame1 = new CardGame(deck1, dealer1);
//
//        boolean finished = false;
//        int gameSelection;
//
//        while (!finished) {
//
//            System.out.println("Welcome to the game.CardGame:");
//            System.out.println("Please select '1' for BlackJack");
//            System.out.println("Please select '2' for Highcard");
//            System.out.println("Please select '9' for players menu");
//            System.out.println("Please select '0' to Exit");
//            System.out.println();
//            gameSelection = (input.nextInt());
//
//            switch (gameSelection) {
//                case 1 : cardGame1.playBlackJack();
//                break;
//
//                case 2 : cardGame1.playHighCard();
//                break;
//
//                case 9: playerMenu();
//
//            }
//        }
//        System.out.println("game.CardGame Over");
//    }
//
//    //need to be static? why ?
//    public static void playerMenu(){
//
//        int menuSelection;
//        String playerName;
//
//        boolean quitMenu = false;
//
//        while(!quitMenu) {
//            System.out.println("Players Menu:");
//            System.out.println("Please select '1' to see all current players");
//            System.out.println("Please select '2' to add a player");
//            System.out.println("Please select '0' to return to the game menu");
//            System.out.println();
//            menuSelection = (input.nextInt());
//
//            switch (menuSelection) {
//                case 1 :
//                    System.out.println("Players in the game:");
//                    cardGame1.displayPlayers();
//                    System.out.println();
//                    break;
//
//                case 2 :
//                    System.out.println("Please enter a player name:");
//                    //weirdness! next line need to be in twice or terminal wont wait for user input...seek help...
//                    playerName = input.nextLine();
//                    playerName = input.nextLine();
//                    cardGame1.addPlayer(new Player(playerName));
//                    System.out.println(playerName + " has been added to the game");
//                    System.out.println();
//                    break;
//
//                case 0 :
//                    quitMenu = true;
//                    break;
//            }
//
//        }
//    }
//
//
}
