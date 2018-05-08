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

    public int acesInHand(){
        int total = 0;
        for (Card card : hand){
            if (card.getRank() == Rank.ACE) {
                total += 1;
            }
        }
        return total;

    }

    public int handTotal(){
        int total = 0;

        for (Card card : this.hand){
            total += card.getValueFromEnum();
        }

        return total;
    }

    public int blackJackHandTotal(){
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

    public boolean isBust(){
        return (blackJackHandTotal() > 21);


    }

    public boolean checkForBlackJack(){
        return (blackJackHandTotal() == 21);
    }



}
