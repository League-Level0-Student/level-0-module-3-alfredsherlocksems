//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
String colour = JOptionPane.showInputDialog("What pen color would you prefer? Yellow or Orange? If niether, choose something else and the colour will be random.");
		//5. Use an if/else statiement to set the pen color that the user requeste
if (colour == ("Yellow")) {
bob.setPenColor(Color.yellow);
}
	if (colour == ("Orange")) {
		bob.setPenColor(Color.orange);
	}
	
	//6. If the user doesn’t enter anything, choose a random color
	else {
		bob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
bob.penDown();
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);

	
	
	
	
	
	}
}
