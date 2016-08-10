import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pack {
	
	public static List<Card> getAllOfSuit(Card.Suit s) {
		List<Card> list = new ArrayList<>();
		for(int i = 2; i <= 14; i++) {
			list.add(new Card(s,i));
		}
		Collections.shuffle(list);
		return list;
	}
}