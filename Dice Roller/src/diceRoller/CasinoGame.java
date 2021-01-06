package diceRoller;

import java.util.Scanner;

public class CasinoGame {
	private int playerMoney;
	private String playerGuess;
	diceRoller casinoDice;
	public int numberTimesPlayed;
	
	
	public CasinoGame() {
		playerMoney = 100; 
		
	GUI.textPopUp("Welcome to the Casino! The goal of the game is to correctly guess the sum of two die!" +
	" Each roll costs $20, but if you guess correctly you'll win $40! Good Luck!", "Welcome!");
		
		casinoDice = new diceRoller();
		
		while(playerMoney > 0) {
			String playerGuess = GUI.userInput("Insert your guess! Remember, you're trying to guess the sum of two dice!", "What's your guess?");
			while(!isInteger(playerGuess, 10)) {
			 playerGuess = GUI.userInput("Your guess must be a number! Try again.", "What's your guess?");
			}

			numberTimesPlayed++;
			playerMoney = playerMoney - 20;
			casinoDice.roll();	
			if(casinoDice.getTotal() == Integer.valueOf(playerGuess)) {
				GUI.textPopUp("Congrats! You Won!" + " Your guess was " + playerGuess + ", and the roll was " + casinoDice.getTotal() + ". You now have: " +
					playerMoney + " dollars."	, "You Won!");
				playerMoney = playerMoney + 40;
			}
			
			
			else {
				GUI.textPopUp("Sorry! You lost." + " Your guess was " + playerGuess + ", and the roll was " + casinoDice.getTotal() + ". You now have " +
						playerMoney + " dollars."	, "Oh no!");
				
			}
			
		
			
			
		}
		
		GUI.textPopUp("Oh no! You've spent all of your money! You played this game " + numberTimesPlayed + " times.", "Oh no!");
	}
	
	
	
	
	
	
	/** 
	 * Method to determine if user input is an integer. 
	 * @param s
	 * @param radix
	 * @return
	 */
	public static boolean isInteger(String s, int radix) {
		Scanner sc = new Scanner(s.trim());
	    if(!sc.hasNextInt(radix)) return false;
	    sc.nextInt(radix);
	    return !sc.hasNext();
		
	}
	
	
	

}
