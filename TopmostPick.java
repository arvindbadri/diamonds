
public class TopmostPick extends DiamondStrategy {
        @Override
        public Card getNextMove(Hand hand) {
            return hand.removeTop();
        }
}
