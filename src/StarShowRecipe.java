import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShowRecipe {

	Robot robot = new Robot("batman");

	void makeStars() {

		drawStar(150); // 5. delete this line. you will draw the star again in
						// step 8.
		// 13. Set the speed to 8

		int x = 10;

		// 7. Make a variable to hold the Y position of the Robot and set it to
		// 950
		int y = 950;
		int starSize = 25;
		// 8. Make a variable to hold the star size and set it to 25

		// 12. Repeat the steps #19 to #18, 30 times

		// 19. Set the pen width to i
robot.setX(x);
		// 10. Set the X position of the robot to your X variable
robot.setY(y);
		// 11. Set the Y position of the robot to your Y variable
drawStar(starSize);
		// 9. Call the drawStar() method with your star size variable
robot.setX(x + starSize);
		// 14. Increase the X position by star size. See Figure 2.
robot.setY(y - starSize);
		// 15. decrease the Y position by star size. See Figure 3.
starSize += 20;
		// 16. Increase the star size by 20
robot.turn(12);
		// 17. Turn the robot 12 degrees
//int randomNumber = new Random().nextInt(5);
		// 18. Make each star a different random color like in Figure 4.

	}

	private void drawStar(int starSize) {
		for (int i = 0; i < 5; i++) {
			robot.setPenWidth(i);
			robot.turn(144);
			robot.penDown();
			//robot.setPenColor();
			robot.move(starSize);

		}

	}

	public static void main(String[] args) {
		new StarShowRecipe().makeStars();
	}
}
