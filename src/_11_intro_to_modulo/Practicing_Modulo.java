package _11_intro_to_modulo;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practicing_Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int number = new Random().nextInt(100);
		    if (number % 2 == 0) {
		        System.out.println("number is even");
		    }
		    else {
		        System.out.println("number is odd");
		    }	
		
		    for (int i=1; i<=1000; i++) {
		     JOptionPane.showMessageDialog(null, "You own " + i + " pencils.");
		        if (i % 20 == 0){
		            System.out.println("20 more repeats completed");
		        }
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
