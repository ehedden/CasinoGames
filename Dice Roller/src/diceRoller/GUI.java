package diceRoller;
import javax.swing.JOptionPane;

public class GUI {
	
	public static void textPopUp(String infoMessage, String titleBar) {
		
		JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static String userInput(String message, String titleBar) {
		String userInput = JOptionPane.showInputDialog(null, message, titleBar, JOptionPane.PLAIN_MESSAGE);
		return userInput;
	}
	
	

}
