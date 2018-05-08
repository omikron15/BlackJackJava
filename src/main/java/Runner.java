public class Runner {



    public static void main(String[] args) {

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

        game1.playBlackJack();
    }

}
