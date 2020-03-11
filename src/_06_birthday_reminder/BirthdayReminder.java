
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String mumsBirthday = "January 5th";
		String dadsBirthday = "June 9th";
		String friendsBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String q1 = JOptionPane.showInputDialog("Which birthday are we celebrating? Mum's, Dad's or a friend's?");
		// 3. Print out what the user typed
		System.out.println(q1);
		// 4. if user asked for "mum"
			//print mum's birthday
		if (q1.equals("mum")) {
			System.out.println(mumsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (q1.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (q1.equals("friend")) {
			System.out.println(friendsBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, I don't remember their birthday!");
		}
	} 
}
