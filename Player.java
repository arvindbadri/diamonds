public class Player {
    private Hand hand;
    private double points;
    private DiamondStrategy strategy;
    private String name;
    private Card lastDiamondPlayed;
    private Card lastBidPlacedByOtherPlayer;

    public void setLastDiamondPlayed(Card lastDiamondPlayed) {
        this.lastDiamondPlayed = lastDiamondPlayed;
    }

    public void setLastBidPlacedByOtherPlayer(Card lastBidPlacedByOtherPlayer) {
        this.lastBidPlacedByOtherPlayer = lastBidPlacedByOtherPlayer;
    }


    public Player(Hand hand, DiamondStrategy strategy, String name) {
        this.hand = hand;
        this.points = 0D;
        this.strategy = strategy;
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void placeBid(Card card) {
        hand.removeCard(card);
    }

    public void awardPoints(double points) {
        this.points += points;
    }

    private Card getCardToBid() {
        strategy.addADiamondPlayed(lastDiamondPlayed);
        strategy.addAnOpponentBidMade(lastBidPlacedByOtherPlayer);
        return strategy.getNextMove(hand);
    }

    public Card getBid() {
        Card bidCard = getCardToBid();
        placeBid(bidCard);
        return bidCard;
    }

    public Boolean equals(Player player) {
        return name.equals(player.name);
    }
}
