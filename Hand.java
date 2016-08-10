package com.paypal;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
    List<Card> cardList;

    public Hand(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public Card removeCard(Card card) {
        if (cardList.remove(card)) {
            return card;
        }
        return null;
    }
}
