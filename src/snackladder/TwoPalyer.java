package snakeandladder;
//Play the game with 2
//Player. In this case if a
//Player gets a Ladder
//then plays again.
//Finally report which
//UC 7 Player won the game

import java.util.Random;

public class TwoPalyer {
    public static void main(String[] args) {
        int position1 = 0;
        int position2 = 0;
        int i=0;
        Random rand = new Random();
        while (position1 != 100 && position2 != 100) {
            i++;
            int diceroll1 = rand.nextInt(1, 7);
            int diceroll2 = rand.nextInt(1, 7);
            int snackladder1 = rand.nextInt(1, 3);
            int snackladder2 = rand.nextInt(1, 3);
            switch (snackladder1) {
                case 1:
                    position1 = position1 + diceroll1;
                    System.out.println("\n It is ladder... " + diceroll1);
                    System.out.println("current position of player1 : " + diceroll1);
                case 2:
                    System.out.println("\n It is snack.... " + diceroll1);
                    position1 = position1 + diceroll1;
                    if (position1 < 0) {
                        position1 = 0;
                        System.out.println("\n It is snack... " + diceroll1);
                        System.out.println("\nPlayer restart from position: " + position1);
                    }
                    System.out.println("\n It is snack.." + diceroll1);
                    System.out.println("the Present position of Player1 is " + position1);
                    break;
                default:
                    position1 = position1 + 0;
                    System.out.println("Player position is " + position1);
                    break;
            }
            switch (snackladder2) {
                case 1:
                    System.out.println("\n It is snack... " + diceroll2);
                    position2 = position2 + diceroll2;
                    System.out.println("The present position of Player2 : " + position2);
                    break;
                case 2:
                    System.out.println("\n It is snack.." + diceroll2);
                    position2 = position2 + diceroll2;
                    if (position2 < 0) {
                        position2 = 0;
                        System.out.println("\n It is snack.." + diceroll1);
                        System.out.println("\n Player has restart from position : " + position1);
                    }
                    System.out.println("Player1 moves down to  :" + diceroll1);
                    System.out.println("The present position of Player 1 is " + position1);
                    System.out.println("The present position of Player 2 is " + position2);
                    break;
                default:
                    position2 = 0;
                    System.out.println("Player position is:" + position1);
            }
            System.out.println("\nThe position of Player1 is " + position1);
            System.out.println("\nThe position of Player2 is " + position2);
        }
        if (position1 == 100) {
            System.out.println("\n Congratulation..Player1 is the  Winner");
        } else {
            System.out.println("\n Congratulation...Player2 is the  Winner");
        }
    }
}
