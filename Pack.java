package com.paypal;

import java.util.ArrayList;
import java.util.List;

import com.paypal.Card.Face;
import com.paypal.Card.Suit;

public class Pack {
	
	public static List<Card> getAllOfSuit(Suit s) {
		List<Card> list = new ArrayList<Card>();
		for(Face f : Face.values()) {
			list.add(new Card(s,f.ordinal()));
		}
		return list;
	}
}