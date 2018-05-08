import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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
        displayResultsBlackJack();

    }

    public ArrayList<String> compareHandsBlackJack(){
        ArrayList<String> results = new ArrayList<>();
        if (!dealer.checkForBlackJack()){
            for (Player player : players){
                if (player.handTotal() > dealer.handTotal()){
                    results.add(player.getName() + " with " + player.handTotal() + " beats the dealer with " + dealer.handTotal());
                }else {
                    results.add("Dealer with " + dealer.handTotal() + " beats " + player.getName() + " with " + player.handTotal());
                }

            }
        }
        return results;
    }

    public void displayResultsBlackJack(){
        for (String result : compareHandsBlackJack()){
            System.out.println(result);

        }
    }


//    public ArrayList<Player> getResults(){
//        ArrayList<Player> results = new ArrayList<>();
//        results.add(this.players.get(0));
//
//        for (Player player : this.players){
//            if(player.handTotal() > results.get(0).handTotal()){
//                results.clear();
//                results.add(player);
//            }else if(player.handTotal() == results.get(0).handTotal()){
//                results.add(player);
//            }
//        }
//
//        if (results.size() > 1){
//            if (results.get(0) == results.get(1) ){
//                results.remove(0);
//            }
//        }
//
//        return results;
//    }
//
//    public String displayResults(){
//
//        ArrayList<Player> results = getResults();
//
//        if (results.size() > 1) {
//            return "Its a draw";
//        }
//        return results.get(0).getName() + " has won!";
//
//    }


}
