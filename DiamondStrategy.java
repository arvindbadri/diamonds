import java.util.List;

public class DiamondStrategy implements Strategy{

    DiamondGame game;
    Player opponent;
    List<Card> cardsPlayedByOpponentUntilNow;
    List<Card> diamondsPlayed;

    public void addAnOpponentBidMade(Card opponentBid) {

    }

    public void addADiamondPlayed(Card diamondPlayed) {

    }


    @Override
    public Card getNextMove(Hand hand) {
        cardsPlayedByOpponentUntilNow.add(game.showBid(opponent));
        diamondsPlayed = game.getDiamondsPlayed();
        return null;
    }
}
