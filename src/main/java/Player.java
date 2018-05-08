import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }

    public int cardsInHand(){
        return hand.size();
    }

    public void getCard(Card newCard){
        this.hand.add(newCard);
    }

    public int handTotal(){
        int total = 0;

        for (Card card : this.hand){
            total += card.getValueFromEnum();
        }

        return total;
    }

}
