public Class Pack {
	
	public static List<Card> getAllOfSuit(Suit s) {
		List<Card> list = new ArrayList<Card>();
		for(Face f : Face.values()) {
			list.add(new Card(s,f));
		}
	}
	return list;
}