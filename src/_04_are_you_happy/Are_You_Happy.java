package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String q1 = JOptionPane.showInputDialog("Are you happy? Yes or no?");
	
	if (q1.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
	}
	if (q1.equals("no")) {
		String q2 = JOptionPane.showInputDialog("Do you want to be happy?Yes or no?");
	
		if (q2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change Something.");
		}
			if (q2.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
