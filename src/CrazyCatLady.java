import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String catnum = JOptionPane
				.showInputDialog("How many cats do you have?");
		int numcat = Integer.parseInt(catnum);
		if (numcat > 3) {
			JOptionPane.showMessageDialog(null, "You're a crazy cat lady");
		}
		else if (numcat <= 3 && numcat != 0) {
			playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
		}
		else if (numcat == 0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}