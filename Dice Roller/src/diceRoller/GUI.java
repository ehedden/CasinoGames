package diceRoller;
import javax.swing.JOptionPane;

public class GUI {
	
	public static void welcomeBox(String infoMessage, String titleBar) {
		
		JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
	
	

}
