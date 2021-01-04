package javax.swing;
import javax.swing.JOptionPane;

public class GUI {
	
	public static void welcomeGUI(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "Info Box:" + titleBar, JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
	}

}
