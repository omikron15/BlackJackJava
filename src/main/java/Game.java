import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<>();
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

    public void dealCards(int cardsPerPlayer){
        while (cardsPerPlayer > 0) {
            for (Player player : this.players) {
                Card newCard = deck.giveCard();
                player.getCard(newCard);
            }
            cardsPerPlayer -= 1;
        }
    }

    public ArrayList<Player> getResults(){
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

    public String displayResults(){

        ArrayList<Player> results = getResults();

        if (results.size() > 1) {
            return "Its a draw";
        }
        return results.get(0).getName() + " has won!";

    }


}
