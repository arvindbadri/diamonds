package com.paypal;

public class Player {
    Hand hand;
    double points;
    Card bid;
    Strategy strategy;
    String name;
    public Player(Hand hand, Strategy strategy, String name) {
        this.hand = hand;
        this.points = 0D;
        this.bid = null;
        this.strategy = strategy;
        this.name = name;
    }

    public void placeBid(Card card) {
        bid = card;
    }

    public void awardPoints(double points) {
        this.points += points;
    }

    private Card getCardToBid() {
        return strategy.getNextMove(hand);
    }

    public Card getBid() {
        return bid;
    }

    public Boolean equals(Player player) {
        return name.equals(player.name);
    }
}
