package Homework2;

import java.util.Arrays;
import java.util.Random;

public class Data {

    public int cardsForPlayer = 5;
    public int numberOfPlayers;
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public int numberOfCards = 52;
    String[] deck = new String[numberOfCards];


    public String methodLoop() {
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i));
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
        return Arrays.toString(deck);
    }

    public void cardsDeal() {
    for(int i = 0; i < numberOfPlayers * cardsForPlayer; i++) {
        System.out.println(deck[i]);

        if (i % cardsForPlayer == cardsForPlayer - 1) {
            System.out.println();
        }
    }
    }


}


