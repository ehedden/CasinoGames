package diceRoller;


public class CasinoGame {
	private int playerMoney;
	private String playerGuess;
	diceRoller casinoDice;
	public int numberTimesPlayed;
	
	
	public CasinoGame() {
		playerMoney = 1000; 
		
	GUI.textPopUp("Welcome to the Casino! The goal of the game is to correctly guess the sum of two die!" +
	" Each roll costs $20, but if you guess correctly you'll win $40! Good Luck!", "Welcome!");
	
	
	
	
		
		casinoDice = new diceRoller();
		
		while(playerMoney > 0) {
			String playerGuess = GUI.userInput("Insert your guess! Remember, your number can only be between 1 and 12.", "What's your guess?");
			//TODO: currently breaks if input is not an int, implement checks to ensure number is an int
			numberTimesPlayed++;
			playerMoney = playerMoney - 20;
			casinoDice.roll();	
			if(casinoDice.getTotal() == Integer.valueOf(playerGuess)) {
				playerMoney = playerMoney + 40;
				System.out.println("Congrats! You Won!");
				System.out.println("Your guess was: " + playerGuess + "and the roll was: " + casinoDice.getTotal());
				System.out.println("You now have: " + playerMoney + " dollars");
				System.out.println("-------------------------------------------------------------");
				
			}
			
			
			else {
				System.out.println("Sorry! You lost!");
				System.out.println("Your guess was: " + playerGuess + "and the roll was: " + casinoDice.getTotal());
				System.out.println("You now have: " + playerMoney + " dollars");
				System.out.println("--------------------------------------------------------------");
				
			}
			
		
			
			
		}
		
		System.out.println("Oh no! You lost all of your money! You played this game " + numberTimesPlayed + " times." );
	}
	
	
	

}
