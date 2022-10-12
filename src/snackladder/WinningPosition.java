package snackladder;

//Repeat till the Player
 //       reaches the winning
  //      position 100. - Note In case the player position moves
 //       below 0, then the player restarts from

public class WinningPosition {
    public static void main(String [] args){
        System.out.println("WELCOME TO PLAY SNACK LADDER GAME:");
        int playerposition=0;
        int diceroll=0;

        for (playerposition=0;playerposition<=100;playerposition++)
        {
            double randomnumber = Math.floor(Math.random() * 10) % 6;
            diceroll = (int) randomnumber;
            playerposition = playerposition + diceroll;
            System.out.println("Number of diceroll=" + diceroll);
            System.out.println("Playerposition =" + playerposition);
            if(playerposition >100)
            {
                playerposition=playerposition-diceroll;
                System.out.println("You are limit up to 100.");
            }
            if (playerposition == 100)
                System.out.println("Congratulation....! you win");
            }
        }
    }







