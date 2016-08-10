import java.util.Scanner;

public class DiamondInput extends DiamondStrategy {
    @Override
    public Card getNextMove(Hand hand) {
        Scanner sc = new Scanner(System.in);
        int cardValue = sc.nextInt();
        Card card = new Card(Card.Suit.WILDCARD, cardValue);
        return card;
    }
}
