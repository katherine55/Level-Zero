import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obedientTortoise {
	public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What color would you like to draw in?\nBlack Blue Purple Green Yellow Orange Red\n            Or MAGENTA");
	
if(answer.equalsIgnoreCase("black")){
	Tortoise.setPenColor(Color.black);
}
if(answer.equalsIgnoreCase("blue")){
	Tortoise.setPenColor(Color.blue);
}
if(answer.equalsIgnoreCase("purple")){
	Tortoise.setPenColor(Color.white);
	JOptionPane.showMessageDialog(null, "HAHAHAHA");
}
if(answer.equalsIgnoreCase("green")){
	Tortoise.setPenColor(Color.green);
}
if(answer.equalsIgnoreCase("yellow")){
	Tortoise.setPenColor(Color.yellow);
}
if(answer.equalsIgnoreCase("orange")){
	Tortoise.setPenColor(Color.orange);
}
if(answer.equalsIgnoreCase("red")){
	Tortoise.setPenColor(Color.red);
}
if(answer.equalsIgnoreCase("magenta")){
	Tortoise.setPenColor(Color.magenta);
}
String shape = JOptionPane.showInputDialog("What shape do you want Tortoise to draw?\nSquare Triangle Circle");

	if(shape.equalsIgnoreCase("square")){
		drawsquare();
	}
	if(shape.equalsIgnoreCase("triangle")){
		drawtriangle();
	}
	if(shape.equalsIgnoreCase("circle")){
		drawcircle();
	}
	}

	// 1. Make a new class, create a main method, and show the tortoise.
	public static void drawsquare() {
		Tortoise.move(55);
		Tortoise.turn(90);
		Tortoise.move(55);
		Tortoise.turn(90);
		Tortoise.move(55);
		Tortoise.turn(90);
		Tortoise.move(55);
	}

	public static void drawtriangle() {
		Tortoise.move(55);
		Tortoise.turn(120);
		Tortoise.move(55);
		Tortoise.turn(120);
		Tortoise.move(55);
	}

	public static void drawcircle() {
		for (int i = 0; i < 720; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(.5);
			Tortoise.turn(.5);
		}
	}
	// 8. Ask the user which shape they want. Draw the appropriate shape
	// depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on
	// their answer.
}