import java.util.ArrayList;
import java.util.List;

public abstract class DiamondStrategy implements Strategy {

    protected List<Card> cardsPlayedByOpponentUntilNow = new ArrayList<> ();
    protected List<Card> diamondsPlayed = new ArrayList<> ();

    public void addAnOpponentBidMade(Card opponentBid) {
        cardsPlayedByOpponentUntilNow.add(opponentBid);
    }

    public void addADiamondPlayed(Card diamondPlayed) {
        diamondsPlayed.add(diamondPlayed);
    }


}