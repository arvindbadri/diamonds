
public class TopmostPick extends DiamondStrategy {
        @Override
        public Card getNextMove(Hand hand, Card bidOn) {
            return hand.removeTop();
        }
}
