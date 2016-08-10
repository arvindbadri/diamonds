package com.paypal;


public interface Strategy {
    public Card getNextMove(Hand hand);
}
