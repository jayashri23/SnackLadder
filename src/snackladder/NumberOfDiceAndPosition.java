package snakeandladder;

//Report the number of
//times the dice was
//played to win the game
//and also the position
//after every die role

import java.util.Random;

public class NumberOfDiceAndPosition {
    public static void main(String[] args) {
        int playerposition = 0;
        int i = 0;
        Random rand = new Random();
        while (playerposition != 100) {
            i++;
            int diceroll = rand.nextInt(1, 7);
            int snackladder = (int) Math.floor(Math.random() * 3 % 3);
            switch (snackladder) {
                case 1:
                    System.out.println("\n Great...! player moved by :" + diceroll);
                    playerposition = playerposition + diceroll;
                    System.out.println("Player position is :" + playerposition);
                    break;
                case 2:
                    playerposition = playerposition + diceroll;
                    if (playerposition < 0) {
                        playerposition = 0;
                        System.out.println("\n  ooh...! Player moves down" + diceroll);
                        System.out.println("Player position restart from position" + playerposition);
                    }
                    System.out.println("Player move down to " + diceroll);
                    System.out.println("Player position is " + playerposition);
                    break;
                default:
                    playerposition = playerposition + diceroll;
                    System.out.println("Player position is" + playerposition);
                    break;
            }
        }
        System.out.println("Congratulation Player1 wins and reaches to winning position:" + playerposition);
        System.out.println("Number of times dice roll =" + "" +  i);
    }
}