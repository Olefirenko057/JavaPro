package Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while(true) {
            System.out.println("Enter players quantity");
            if(sc.hasNextInt()) {
                data.numberOfPlayers = sc.nextInt();
                if(data.cardsForPlayer * data.numberOfPlayers <= data.numberOfCards) {
                    break;
                } else {
                    if (data.numberOfPlayers == 0) {
                        System.out.println("The game has been terminated");
                        break;
                    } else if (data.numberOfPlayers < 0) {
                        System.out.println("Wrong number!");
                    } else {
                        System.out.println("Too many players");
                    }
                }
            } else {
                System.out.println("You haven't entered a digit");
            }
        }


        Suits jj = Suits.CLUBS;
        int ar = jj.method();

        Suits kk = Suits.DIAMONDS;
        int ar2 = kk.method();


        Suits ll = Suits.HEARTS;
        int ar3 = ll.method();

        Suits ii = Suits.SPADES;
        int ar4 = ii.method();




        for (int j = 0; j < ar; j++) {
            data.deck[j] = "Clubs " + jj.deck[j];
        }
        System.out.println();

        for (int k = 13; k < ar + ar2; k++) {
            data.deck[k] = "Diamonds " + kk.deck[k-13];
        }

        for (int l = 26 ; l < ar + ar2 + ar3 ; l++) {
            data.deck[l] = "Hearts " + ll.deck[l-26];
        }

        for(int i = 39; i < ar + ar2 + ar3 + ar4; i++) {
            data.deck[i] = "Spades " + ii.deck[i-39];
        }


//        System.out.print(Arrays.toString(data.deck));

        String reshuffledCards =  data.methodLoop();

        data.cardsDeal();





    }
}
