import java.net.URI;

import javax.swing.JOptionPane;

public class BirthDAYYAYAYA {

	public static void main(String[] args) {
		String today = "11/18/15";
	String birthday = JOptionPane.showInputDialog(null, "When is your birthday? \n(mm/dd/yy)");

	if(today.equalsIgnoreCase(birthday)){
		JOptionPane.showMessageDialog(null, "good job!");
		}
	else{
		playVideo("https://www.youtube.com/watch?v=RdsZT7WKjW8");
	}
	}
	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
