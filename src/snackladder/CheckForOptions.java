package snakeandladder;
//The Player then checks for
//a Option. They are No Play,
//Ladder or Snake. - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same
//position
//- In Case of Ladder the player moves ahead by the
//number of position received in the die
//
//- In Case of Snake the player moves behind

import java.util.Random;

public class CheckForOptions {
    public static void main(String [] args){

        int start_position =0;
        int Player_Position =0;
        Random random = new Random();
        System.out.println("Starting Position of Player is : " +start_position+ "\n");

        int dice_rolls =(random.nextInt(6)+1);
        System.out.println("The Player  rolls the die and gets a number:" +dice_rolls+ "\n");

        int option = (int) Math.floor(Math.random()*3 %3);
        Player_Position=Player_Position+dice_rolls;
        switch (option) {
            case 0:
                System.out.println("No play condition,player at same position \n");
                break;
            case 1:
                Player_Position = Player_Position - dice_rolls;
                System.out.println("It is Snack " + dice_rolls);
                System.out.println("Player current position is :" + Player_Position);
            case 2:
                Player_Position = Player_Position + dice_rolls;
                System.out.println("It is Ladder " + dice_rolls);
                System.out.println("Player current position is :" + Player_Position);
                break;
            }
        }
    }

