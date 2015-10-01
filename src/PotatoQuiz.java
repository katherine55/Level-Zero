import javax.swing.JOptionPane;

public class PotatoQuiz {

	public static void main(String[] args) {
		String potato = JOptionPane.showInputDialog("Do you like potatoes?");
		if (potato.contains("no")) {
			JOptionPane.showMessageDialog(null, "no. bad, no\nno");
			System.exit(0);
		}

		else {

			String hobby = JOptionPane
					.showInputDialog("What's your favorite hobby?");
			JOptionPane
					.showMessageDialog(
							null,
							hobby
									+ " is much better if you are a potato.\nYou are, aren't you?");
		}
	}
}