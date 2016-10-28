package googleResultat;

import javax.swing.JOptionPane;

public class JOptionPaneWith4Options {

	public static void main(String[] args) {
	    String[] options = new String[] {"Addition", "Subtraction", "Multiplication", "Division"};
	    int response = JOptionPane.showOptionDialog(null, "Which method would you like to choose?", "Method choice",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
	        null, options, options[0]);

	    System.out.println(response);
	    
	    // Where response == 0 for Addition, 1 for Subtraction, 2 for Multiplication and -1 or 3 for Division.
	}
	
}
