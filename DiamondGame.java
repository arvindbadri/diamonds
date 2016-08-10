import java.util.ArrayList;
import java.util.List;

public class DiamondGame {
    private Player user;
    private Player computer;
    private Card bidOn;
    private Card userBid;
    private Card computerBid;
    private List<Card> diamondList;
    private List<Card> diamondsPlayed;
    private Boolean isGameOver = false;
    private Boolean playerWon = false;
    private Boolean computerWon = false;

    public DiamondGame(Player user, Player computer) {
        this.user = user;
        this.computer = computer;
        this.diamondList = Pack.getAllOfSuit(Card.Suit.DIAMONDS);
        this.diamondsPlayed = new ArrayList<>();
    }

    void conductGame() {
        //TODO: insert code to cycle through players and get bids.
        //For player, accept input and get bid.
        //For computer, plug in strategy and get bid.

        while (!(isGameOver)) {
            bidOn = diamondList.get(0);
            conductBid();
        }
    }

    void conductBid() {
        System.out.println("Card bid on: " + bidOn.getFaceValue() + " " + bidOn.getSuit());
        System.out.print("User bid: ");
        userBid = user.getBid();
        System.out.print(userBid.getSuit() + " " + userBid.getFaceValue() + " ");
        System.out.print("  Computer bid: ");
        computerBid = computer.getBid();
        System.out.print(computerBid.getSuit() + " " + computerBid.getFaceValue() + " ");
        double pointsAtStake = bidOn.getFaceValue();
        if (userBid.getFaceValue() > computerBid.getFaceValue()) {
            user.awardPoints(pointsAtStake);
            System.out.println("User gets " + pointsAtStake + " points");
        }
        else if (userBid.getFaceValue() < computerBid.getFaceValue()) {
            computer.awardPoints(pointsAtStake);
            System.out.println("Computer gets " + pointsAtStake + " points");
        }
        else {
            user.awardPoints(pointsAtStake/2D);
            computer.awardPoints(pointsAtStake/2D);
            System.out.println("Both get " + pointsAtStake/2D + " points");
        }
        updateGameState();
    }

    void updateGameState() {
        user.setLastDiamondPlayed(bidOn);
        user.setLastBidPlacedByOtherPlayer(computerBid);
        computer.setLastDiamondPlayed(bidOn);
        computer.setLastBidPlacedByOtherPlayer(userBid);
        if (diamondList.size() != 1) {
            diamondList.remove(bidOn);
        }
        else {
            isGameOver = true;
            if (user.getPoints() > computer.getPoints()) {
                playerWon = true;
            }
            else if (user.getPoints() < computer.getPoints()) {
                computerWon = true;
            }
            if (playerWon == true) {
                System.out.println("Player won");
            }
            else if (computerWon == true) {
                System.out.println("Computer won");
            }
            else {
                System.out.println("Draw");
            }
        }
        diamondsPlayed.add(bidOn);
    }

    public List<Card> getDiamondsPlayed() {
        return diamondsPlayed;
    }
}
