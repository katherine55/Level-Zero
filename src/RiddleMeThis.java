import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {
		int score = 0;
		JOptionPane.showMessageDialog(null, "Now for some riddles!");
		JOptionPane.showMessageDialog(null, "Riddle 1 \nScore = " + score);
		String answer = JOptionPane.showInputDialog(null,
				"What is black, white, and red all over?");
		if (answer.contains("paper")) {
			JOptionPane.showMessageDialog(null,
					"Correct! Your score has gone up!");
			score++;
		} else {
			JOptionPane
					.showMessageDialog(null,
							"Sorry! The answer was the newspaper! Better luck next time!");
		}
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		JOptionPane.showMessageDialog(null, "Riddle 2 \nScore = " + score);
		String answer2 = JOptionPane
				.showInputDialog(
						null,
						"What comes once in a minute, twice in a moment, but never in a thousand years?");
		if (answer2.equals("m")) {
			JOptionPane.showMessageDialog(null,
					"Correct! Your score has gone up!");
			score++;
		} else {
			JOptionPane
					.showMessageDialog(null,
							"Sorry! The answer was the letter M! Better luck next time!");
		}
		// 6. Add some more riddles
		JOptionPane.showMessageDialog(null, "Riddle 3\nScore = " + score);
		String answer3 = JOptionPane.showInputDialog(null,
				"Which word in the dictionary is spelled incorrectly?");
		if (answer3.equals("incorrectly")) {
			JOptionPane.showMessageDialog(null,
					"Correct! Your score has gone up!");
			score++;
		} else {
			JOptionPane
					.showMessageDialog(null,
							"Sorry! The answer was the word, incorrectly!\nHaha! Better luck next time!");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,
				"Riddle 4: This is the last one! Make it count!\nScore = "
						+ score);
		String answer4 = JOptionPane
				.showInputDialog(null,
						"Give me food and I will live. \nGive me water and I will die.\nWhat am I?");
		if (answer4.equals("fire")) {
			JOptionPane.showMessageDialog(null,
					"Correct! Your score has gone up!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null,
					"Sorry! The answer was fire! That was the last question!");
		}
		JOptionPane.showMessageDialog(null, "Final Score =" + score);
		if (score == 4)
			;
		{
			JOptionPane.showMessageDialog(null, "You did great! 100%");
		}
		if (score == 3)
			;
		{
			JOptionPane.showMessageDialog(null,
					"Good Job! You only missed one riddle!");
		}
		if (score == 2)
			;
		{
			JOptionPane.showMessageDialog(null,
					"Eh. I wouldn't choose a career in riddle-solving.");
		}
		if (score == 1);{
			JOptionPane.showMessageDialog(null, "Ay, Caramba!!");
		}
		if (score == 0); {
			JOptionPane.showMessageDialog(null, "...");
		}
	}
}