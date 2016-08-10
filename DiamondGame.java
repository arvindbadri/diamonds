import java.util.List;

public class DiamondGame {
    Player user;
    Player computer;
    Card bidOn;
    Card userBid;
    Card computerBid;
    List<Card> diamondList;
    List<Card> diamondsPlayed;
    Boolean isGameOver = false;

    public DiamondGame(Player user, Player computer) {
        //TODO: insert code to populate diamondList
        this.user = user;
        this.computer = computer;
    }

    void conductGame() {
        //TODO: insert code to cycle through players and get bids.
        //For player, accept input and get bid.
        //For computer, plug in strategy and get bid.
    }

    void conductBid() {
        userBid = user.getBid();
        computerBid = computer.getBid();
        double pointsAtStake = bidOn.getFaceValue();
        if (userBid.getFaceValue() > computerBid.getFaceValue()) {
            user.awardPoints(pointsAtStake);
        }
        else if (userBid.getFaceValue() < computerBid.getFaceValue()) {
            computer.awardPoints(pointsAtStake);
        }
        else {
            user.awardPoints(pointsAtStake/2D);
            computer.awardPoints(pointsAtStake/2D);
        }
        updateGameState();
    }

    void updateGameState() {
        if (!(diamondList.isEmpty())) {
            diamondList.remove(bidOn);
        }
        else {
            isGameOver = true;
        }
        diamondsPlayed.add(bidOn);
    }

    public Card showBid(Player player) {
        if (player.equals(user)) {
            return userBid;
        }
        else if (player.equals(computer)) {
            return computerBid;
        }
        return null;
    }

    public List<Card> getDiamondsPlayed() {
        return diamondsPlayed;
    }
}
