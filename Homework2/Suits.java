package Homework2;

import java.util.Arrays;

public enum Suits {
    CLUBS ,
    DIAMONDS,
    HEARTS,
    SPADES;




    String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    String[] deck = new String[13];
    public int method() {
        for (int i = 0; i < ranks.length; i++) {
            deck[i] = ranks[i];
        }
        return deck.length;
    }





}
