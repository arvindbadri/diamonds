import java.util.List;

public abstract class DiamondStrategy implements Strategy {

    protected List<Card> cardsPlayedByOpponentUntilNow;
    protected List<Card> diamondsPlayed;

    public void addAnOpponentBidMade(Card opponentBid) {
        cardsPlayedByOpponentUntilNow.add(opponentBid);
    }

    public void addADiamondPlayed(Card diamondPlayed) {
        diamondsPlayed.add(diamondPlayed);
    }

}