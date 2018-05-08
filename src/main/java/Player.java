import java.util.ArrayList;

public class Player {

    private String name;
    protected ArrayList<Card> hand;

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

    public boolean checkForAce(){
        for (Card card : hand){
            if (card.getRank() == Rank.ACE) {
                return true;
            }
        }
        return false;
    }

    public int handTotal(){
        int total = 0;

        for (Card card : this.hand){
            total += card.getValueFromEnum();
        }

        return total;
    }

    public int BlackJackHandTotal(){
        int total = 0;

        for (Card card : this.hand){
            if ((card.getValueFromEnum() >= 10)&(card.getRank() != Rank.ACE)){
                total += 10;
            } else {
              total += card.getValueFromEnum();
            }
        }
        if ((total > 21)&(checkForAce())){
            total -= 10;
        }
        return total;
    }

    public boolean checkForBlackJack(){

        return (BlackJackHandTotal() == 21);

    }

}
