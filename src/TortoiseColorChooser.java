import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		String[] options = {"Green", "Red", "Blue", "Black"};
	
		int answer = 
				JOptionPane.showOptionDialog(null, "What color would you like the\ntortoise to draw with?", null, 0,0, null, options, null);
	if(answer == 0){
		Tortoise.setPenColor(Colors.Greens.Green);
	}

	
//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(1);
	//1. make the tortoise draw a shape (this will take more than one line of code)
	for(int i = 0;  i < 999999999; i++){
		Tortoise.setSpeed(10);
		Tortoise.turn(100);
		Tortoise.move(i+5);
		
	}}}
