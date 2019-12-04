import java.util.Scanner;  // Import the Scanner class
import java.util.Random; 
import java.util.Arrays;
public class Game
{
    /*
     * Rock crushes Scissors
     * Paper covers Rock
     * Scissors cuts Paper
     */

    final String [] characters = {"Rock", "Paper", "Scissors"};
    final String [] menuChar = {"R", "P", "S", "Q"};
    String playerName;    
    /**
     * Constructor for objects of class PlayRPS
     */
    public Game()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Get player name");         
        playerName = userInput.nextLine();  
    }

    private String getComputerChoice() {
        Random random = new Random(); 
        return menuChar[random.nextInt(3)]; 
    }
    /**
     * Returns the player choice
     * To make it even easier get the player to enter a number 
     * instead of a letter
     * So rock = 0, P = 1, S = 2 & Q = 3.
     */
    private String getPlayerChoice() {
         Scanner userInput = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter choice:\nr = rock\np = paper\ns = scissors\nq = quit");
         return userInput.nextLine().toUpperCase();  
    }
    
    /**
     * Main game loop
     */
    public void playGame()
    {
        Boolean finished = false;
        while (!finished) {
            String selection = getPlayerChoice();
            // You need to work out how to turn int's into strings
            //So for instance i player chooses R & comp chooses 2
            //Player wins as rock beats scissors
            //If they choose the same it's a draw!
            String compChoice = getComputerChoice();
            if (compChoice.equals(selection)) {
                System.out.println("You both selected " + selection + " it's a draw!");
            } else {
                switch(selection) {
                    case "R": // rock
                        if (compChoice.equals("S"))
                            System.out.println("Rock smashes scissors! You win");
                        else
                            System.out.println("Rock covers paper! Comp wins");
                        break;
                    case "P": //Paper
                        if (compChoice.equals("R"))
                            System.out.println("Paper covers rock! You win");
                        else
                            System.out.println("Scissors cuts paper! Comp wins");
                        // code block
                        break;
                    case "S":
                        // code block
                         if (compChoice.equals("P"))
                            System.out.println("Scissors cuts paper! You win");
                        else
                            System.out.println("Rock smashes scissors! Comp wins");
                        break;                    
                    case "Q":
                        finished= true;
                        break;
                    default:
                        // code block
                }
            }
        }        
    }
}