
public class Card {
    private Suit suit;
    private Face face;

    public Card (String suit, int faceValue) {

    }

    public int getFaceValue() {
        return this.face.ordinal() + 2;
    }

    enum Face {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, WILDCARD;
    }

    enum Suit {
        SPADES, HEARTS, DIAMONDS, CLUBS, WILDCARD;
    }
}
