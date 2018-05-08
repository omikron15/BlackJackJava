import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        Game game1;
        Deck deck1;
        Dealer dealer1;
        Player player1;
        Player player2;
        Player player3;
        Player player4;
        Player player5;

        deck1 = new Deck();
        dealer1 = new Dealer("DEALER");
        game1 = new Game(deck1, dealer1);
        player1 = new Player("Connor");
        player2 = new Player("Andrew");
        player3 = new Player("Fraser");
        player4 = new Player("X");
        player5 = new Player("Y");

        game1.addPlayer(player1);
        game1.addPlayer(player2);

        boolean finished = false;

        while (!finished) {

            System.out.println("Welcome to the Game:");
            System.out.println("Please select '1' for BlackJack");
            System.out.println("Please select '2' for Highcard");
            System.out.println("Enter any number to quit");
            int gameSelection;
            gameSelection = (input.nextInt());
            if (gameSelection == 1) {
                game1.playBlackJack();
            } else if (gameSelection == 2) {
                game1.playHighCard();
            } else {
                System.out.println("Game Over");
                return;
            }
        }
    }
}
