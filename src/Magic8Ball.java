// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int randomNumber = new Random().nextInt(4);

		// JOptionPane.showMessageDialog(null, randomNumber);

		String Question = JOptionPane.showInputDialog(null,
				"I know all... Now ask me a question!!");

		if (Question.contains("why")) {
			JOptionPane.showMessageDialog(null,
					"I don't know!!!!!!!!! >w< Figure it out yourself!");
		} else if (Question.contains("+")) {
			JOptionPane.showMessageDialog(null, "42");
		}

		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Sure, whatever!");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "I'm guessing no??");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "I'm too tired... Zzzzz");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "No idea, don't ask again.");
		}

	}
}
// 2. Make a variable that will hold a random number and put a random number
// into this variable using "new Random().nextInt(4)"

// 3. Print out this variable

// 4. Get the user to enter a question for the 8 ball

// 5. If the random number is 0

// -- tell the user "Yes"

// 6. If the random number is 1

// -- tell the user "No"

// 7. If the random number is 2

// -- tell the user "Maybe?"

// 8. If the random number is 3

// -- write your own answer

