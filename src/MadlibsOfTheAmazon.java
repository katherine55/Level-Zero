import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		JOptionPane
				.showMessageDialog(
						null,
						"If you find yourself having to cross a piranha-infested river, here's how to do it...");

		String adjective = JOptionPane.showInputDialog("Enter an adjective");

		String liquid = JOptionPane.showInputDialog("Enter a liquid");

		String bodyPart = JOptionPane.showInputDialog("Enter a body part");

		String verb = JOptionPane.showInputDialog("Enter a verb");

		String place = JOptionPane.showInputDialog("Enter a place");

		JOptionPane
				.showMessageDialog(
						null,
						"Piranhas are more "
								+ adjective
								+ " during the day, \nso cross the river at night. "
								+ "Piranhas are attracted to fresh "
								+ liquid
								+ " and will most likely take a bite out of your "
								+ bodyPart
								+ " if you "
								+ verb
								+ ". \nWhatever "
								+ "you do, if you have an open wound, try to find another way to get back to the "
								+ place + "! Good luck!");
	}
}