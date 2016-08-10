import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    private List<Card> cardList;

    protected Hand(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    protected Card removeCard(Card card) {
        if (cardList.remove(card)) {
            return card;
        }
        return null;
    }

    protected Card removeTop() {
        Card card = cardList.get(0);
        cardList.remove(card);
        return card;
    }
}
