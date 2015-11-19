import org.teachingextensions.logo.Tortoise;

public class SquareOfFame {

	public static void main(String[] args) {
drawstars();
	}
	public static void drawstars() {
		for(int i = 0; i<5; i++){
		Tortoise.move(55);
		Tortoise.turn(144);
		}
		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(180);
		Tortoise.move(10);
		Tortoise.penDown();
		drawstars();
	}
}
