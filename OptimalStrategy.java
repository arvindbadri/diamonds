import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class OptimalStrategy extends DiamondStrategy{
    private static List<List<Double>> probablities = new ArrayList<>();

    private static void populateProbabilities() {
        try {
            Scanner sc = new Scanner(new FileReader("C:\\Users\\abadrinath\\Desktop\\probs.txt"));
            while(sc.hasNextLine()) {
                List<Double> probabilityList = new ArrayList<>();
                String line = sc.nextLine();
                String[] values = line.split(",");
                for (String value : values) {
                    probabilityList.add(Double.parseDouble(value));
                }
                probablities.add(probabilityList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Card getNextMove(Hand hand, Card bidOn) {
        if (diamondsPlayed.size() == 0) {
            double randomNumber = getRandom();
            List<Double> probabilityForCard = probablities.get(bidOn.getFaceValue() - 2);
            for (double d : probabilityForCard) {
                if (d <= randomNumber) {
                    return new Card(Card.Suit.SPADES, probabilityForCard.indexOf(d) + 2);
                }
            }
        }
        else {
            //return random card.
        }
    }

    private double getRandom() {
        return Math.random();
    }

    private int getRandomIntBefore(int k) {
        return new java.util.Random().nextInt() % k;
    }

}
