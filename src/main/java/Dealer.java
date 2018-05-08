import java.util.ArrayList;

public class Dealer extends Player {

    public Dealer(String name){
        super(name);
    }

    public void dealCards(int cardsPerPlayer, ArrayList<Player> players, Deck deck){
        while (cardsPerPlayer > 0) {
            Card newDealerCard = deck.giveCard();
            getCard(newDealerCard);
            for (Player player : players) {
                Card newPlayerCard = deck.giveCard();
                player.getCard(newPlayerCard);
            }
            cardsPerPlayer -= 1;
        }
    }


}
