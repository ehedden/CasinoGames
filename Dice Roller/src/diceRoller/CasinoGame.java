package diceRoller;


public class CasinoGame {
	public int playerMoney;
	public int playerGuess;
	diceRoller casinoDice;
	public int numberTimesPlayed;
	
	
	public CasinoGame() {
		playerMoney = 1000; 
		
	GUI.welcomeBox("Welcome to the Casino! The goal of the game is to correctly guess the sum of two die!" +
	" Each roll costs $20, but if you guess correctly you'll win $40! Good Luck!", "Welcome!");
		
		casinoDice = new diceRoller();
		
		while(playerMoney > 0) {
			numberTimesPlayed++;
			playerMoney = playerMoney - 20;
			casinoDice.roll();
			playerGuess = (int)(Math.random()*12) + 1;
			
			if(casinoDice.getTotal() == playerGuess) {
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
