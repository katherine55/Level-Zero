import javax.swing.JOptionPane;

public class WorldDomination
{
	public static void main(String[] args)
	{
		String answer = JOptionPane.showInputDialog("Do you know how to write code?");
		// 1. Ask the user if they know how to write code.
		if (answer.contains("yes"))
		{
			JOptionPane.showMessageDialog(null, "World domination... Here you come! >w<");
		} else if (answer.contains("no"))
		{
			JOptionPane
					.showMessageDialog(null,
							"That's too bad, but you can join the League of Amazing Programmers \nand rule the world! Don't worry! There's still hope for you!");
			;

		}

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
