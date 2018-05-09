import player.Dealer;
import deck.Deck;
import game.Game;
import player.Player;

import java.util.Scanner;

public class Runner {

   static Game game1;
   static Scanner input = new Scanner( System.in );
   static Deck deck1;
   static Dealer dealer1;

    public static void main(String[] args) {

        deck1 = new Deck();
        dealer1 = new Dealer("DEALER");
        game1 = new Game(deck1, dealer1);

        boolean finished = false;
        int gameSelection;

        while (!finished) {

            System.out.println("Welcome to the game.Game:");
            System.out.println("Please select '1' for BlackJack");
            System.out.println("Please select '2' for Highcard");
            System.out.println("Please select '9' for players menu");
            System.out.println("Please select '0' to Exit");
            System.out.println();
            gameSelection = (input.nextInt());

            switch (gameSelection) {
                case 1 : game1.playBlackJack();
                break;

                case 2 : game1.playHighCard();
                break;

                case 9: playerMenu();

            }
        }
        System.out.println("game.Game Over");
    }

    //need to be static? why ?
    public static void playerMenu(){

        int menuSelection;
        String playerName;

        boolean quitMenu = false;

        while(!quitMenu) {
            System.out.println("Players Menu:");
            System.out.println("Please select '1' to see all current players");
            System.out.println("Please select '2' to add a player");
            System.out.println("Please select '0' to return to the game menu");
            System.out.println();
            menuSelection = (input.nextInt());

            switch (menuSelection) {
                case 1 :
                    System.out.println("Players in the game:");
                    game1.displayPlayers();
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("Please enter a player name:");
                    //weirdness! next line need to be in twice or terminal wont wait for user input...seek help...
                    playerName = input.nextLine();
                    playerName = input.nextLine();
                    game1.addPlayer(new Player(playerName));
                    System.out.println(playerName + " has been added to the game");
                    System.out.println();
                    break;

                case 0 :
                    quitMenu = true;
                    break;
            }

        }
    }


}
