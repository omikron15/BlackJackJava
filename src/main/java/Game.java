import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Dealer dealer;


    public Game(Deck deck, Dealer dealer){
        this.deck = deck;
        this.players = new ArrayList<>();
        this.dealer = dealer;
    }

    public Deck getDeck(){
        return this.deck;
    }

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player newPlayer){
        this.players.add(newPlayer);
    }

    public void playBlackJack(){

        dealer.dealCards(2, players, deck);
        dealer.handTotal();
        BlackJack();

    }

    public void BlackJack(){
        System.out.println("BlackJack Game:");
        for (String result : BlackJackLogic()){
            System.out.println(result);
        }
    }

    public ArrayList<String> BlackJackLogic(){
        ArrayList<String> results = new ArrayList<>();

        if (dealer.checkForBlackJack()) {
            results.add("Dealer has BlackJack, All players lose!");
            return results;
        } else {
            for (Player player : players){
                System.out.println(player.getName() + ", it is your turn");
                blackJackTurn(player);
            }
        }

        blackJackTurn(dealer);

        results = blackJackResults();

        return results;


    }

    public ArrayList<String> blackJackResults() {
        ArrayList<String> results = new ArrayList<>();
        for (Player player : players) {
            if (player.isBust()) {
                results.add(player.getName() + " is bust, Dealer wins");
            } else if (dealer.isBust()) {
                results.add(player.getName()+ " with " + player.handTotal() + " beats the dealer who is bust");
            }else{
                if (player.handTotal() > dealer.handTotal()) {
                    results.add(player.getName() + " with " + player.handTotal() + " beats the dealer with " + dealer.handTotal());
                } else {
                    results.add("Dealer with " + dealer.handTotal() + " beats " + player.getName() + " with " + player.handTotal());
                }
            }
        }
        return results;
    }


    public void blackJackTurn(Dealer dealer){
        boolean turnFinished = false;
        while (!turnFinished) {
            if (dealer.blackJackHandTotal() < 16){
                dealer.dealCard(dealer, deck);
            } else{
                return;
            }

        }
    }

    public void blackJackTurn(Player player){
        Scanner input = new Scanner( System.in );
        boolean turnFinished = false;
        if (player.checkForBlackJack()){
            System.out.println("BlackJack");
            return;
        }

        while (!turnFinished){
            if (player.checkForBlackJack()){
                System.out.println("Your hand value is: 21...Automatic Stick ");
                return;
            }
            System.out.println("Your hand value is: " + player.blackJackHandTotal());
            System.out.println("Please enter 'Hit' or 'Stick'");
            String user_input;
            user_input = input.next();
            user_input = user_input.toLowerCase();
            if (user_input.equals("stick")){
                return;
            }else if (user_input.equals("hit")){
                dealer.dealCard(player, deck);
                if (player.isBust()){
                    turnFinished = true;
                    System.out.println("Your hand value is: " + player.blackJackHandTotal());
                    System.out.println("BUST!");
                }
            }

        }
    }




    public ArrayList<Player> getHighCardResults(){
        ArrayList<Player> results = new ArrayList<>();
        results.add(this.players.get(0));

        for (Player player : this.players){
            if(player.handTotal() > results.get(0).handTotal()){
                results.clear();
                results.add(player);
            }else if(player.handTotal() == results.get(0).handTotal()){
                results.add(player);
            }
        }

        if (results.size() > 1){
            if (results.get(0) == results.get(1) ){
                results.remove(0);
            }
        }

        return results;
    }

    public String playHighCard(){

        ArrayList<Player> results = getHighCardResults();

        if (results.size() > 1) {
            return "Its a draw";
        }
        return results.get(0).getName() + " has won!";

    }


}
