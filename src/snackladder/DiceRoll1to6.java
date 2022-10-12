package snackladder;



//The Player rolls the die
//to get a number
//between 1 to 6. - Use ((RANDOM)) to get the number between
//import java.util.Random 1 to 6

public class DiceRoll1to6 {
    public static void main(String [] args){
        System.out.println("WELCOME TO PLAY SNACK LADDER GAME:");
        int diceroll;
        int playerposition=0;
        diceroll=(int) (Math.random()*6)+1;
        playerposition=playerposition+diceroll;
        System.out.println("Number of Diceroll=" +diceroll);
        System.out.println("Playerpostion=" +playerposition);
    }
}
