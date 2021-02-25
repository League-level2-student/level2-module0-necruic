package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] names = new Robot[5];

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < names.length; i++) {
			names[i] = new Robot();
			names[i].moveTo(i * 100 + 300, 500);
			names[i].setSpeed(50);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random r = new Random();
		boolean raceStillRunning = true;
		while (raceStillRunning == true) {
			for (int i = 0; i < names.length; i++) {
				
				int move = r.nextInt(50);
				names[i].move(move);
				if(names[i].getY()<0) {
					raceStillRunning = false;
					JOptionPane.showMessageDialog(null, "Robot #" + i +" is the winner!");
					break;
				}

			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}