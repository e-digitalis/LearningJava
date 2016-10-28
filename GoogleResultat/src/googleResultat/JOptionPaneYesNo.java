package googleResultat;

import javax.swing.JOptionPane;

public class JOptionPaneYesNo {

	public static void main(String[] args) {

		int result = JOptionPane.showConfirmDialog(null, 
				   "Do you want to press yes or no?",null, JOptionPane.YES_NO_OPTION);
		System.out.println(result);
				if(result == JOptionPane.YES_OPTION) {
				    System.exit(0);
				} 

	}

}
