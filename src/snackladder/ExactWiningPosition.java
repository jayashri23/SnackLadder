package snakeandladder;
//Ensure the player gets
//to exact winning
//position 100. - Note in case the player position go above
//100, the player stays in the same previous
//position till the player gets the exact
//Number that adds to 100.

import java.util.Random;

public class ExactWiningPosition {

    public static void main(String[] args){
        int playerposition=0;
        int i=0;
        Random random=new Random();
        while (playerposition!=100)
        {
            i++;
            int diceroll = random.nextInt(1 , 7);
            int snackladder = (int) Math.floor(Math.random()*3  %3);
            switch (snackladder)
            {
                case 1:
                    System.out.println("\n It is Snack.." + diceroll);
                    playerposition = playerposition + diceroll;
                    System.out.println("Player position is :" + playerposition);
                    break;
                case 2:
                    playerposition = playerposition + diceroll;
                    if (playerposition < 0) {
                        playerposition = 0;
                        System.out.println("\n It is Ladder.." + diceroll);
                        System.out.println("Player current position" + playerposition);
                    }
                    System.out.println("Player move down to " + diceroll);
                    System.out.println("Player position is " + playerposition);
                    break;
                default:
                    playerposition = playerposition + diceroll;
                    System.out.println("Congratulation...! Player wins and reaches wining position:" + playerposition);
                }
            }
        }
    }

