
public class Card {
    private Suit suit;
    private Face face;

    public Card (Suit suit, int faceValue) {

    }

    public int getFaceValue() {
        return this.face.ordinal() + 2;
    }
    
    public String getSuit() {
    	return this.suit;
    }

    public enum Face {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, WILDCARD;
    }

    public enum Suit {
        SPADES, HEARTS, DIAMONDS, CLUBS, WILDCARD;
    }
}
