
public class TestMain {
    public static void main(String[] args) {
        Hand handOfHearts = new DiamondHand(Pack.getAllOfSuit(Card.Suit.HEARTS));
        Player user = new Player(handOfHearts, new DiamondInput(), "user");
        Hand handOfSpades = new DiamondHand(Pack.getAllOfSuit(Card.Suit.SPADES));
        Player computer = new Player(handOfSpades, new TopmostPick(), "computer");
        new DiamondGame(user, computer).conductGame();
    }
}
