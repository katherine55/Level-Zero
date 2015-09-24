import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class StarShowRecipe {
	int randomNumber = new Random().nextInt(5);
	Robot robot = new Robot("batman");
//	void makeStars() {
//
//		// 5. delete this line. you will draw the star again in
//		// step 8.
//		robot.setSpeed(10);
//		// 13. Set the speed to 8
//
//	int x = 10;
//
//		// 7. Make a variable to hold the Y position of the Robot and set it to
//		// 950
//		int y = 950;
//		int starSize = 25;
//		// 8. Make a variable to hold the star size and set it to 25
//
//		// 12. Repeat the steps #19 to #18, 30 times
//
//		// 19. Set the pen width to i
//		robot.setX(x);
//		// 10. Set the X position of the robot to your X variable
//		robot.setY(y);
//		// 11. Set the Y position of the robot to your Y variable
//		// 9. Call the drawStar() method with your star size variable
//		robot.setX(x + starSize);
//		// 14. Increase the X position by star size. See Figure 2.
//		robot.setY(y - starSize);
//		// 15. decrease the Y position by star size. See Figure 3.
//		starSize += 20;
//		// 16. Increase the star size by 20
//		robot.turn(12);
//
//		drawStar(starSize);
//		// 17. Turn the robot 12 degrees
//		//int randomNumber = new Random().nextInt(5);
//		// 18. Make each star a different random color like in Figure 4.
//
//	}

	

	public static void main(String[] args) {
		new StarShowRecipe().drawStar(0);
	}
	
	private void drawStar(int starSize) {
		for(int hehe = 0; hehe < 6; hehe++){
			robot.setX(20);
			robot.setY(20);
		robot.setPenWidth(2);
		robot.turn(144);
		robot.penDown();
		//robot.setPenColor(Color.getHSBColor(i + 100, i + 50, i + 25));
		robot.move(starSize);
		}
	

}
}
