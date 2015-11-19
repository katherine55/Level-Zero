import java.net.URI;

import javax.swing.JOptionPane;

public class HappyUnBirthday {

	public static void main(String[] args) {
	int birthday = JOptionPane.showConfirmDialog(null, "Is it your birthday?");
if(birthday == 1){
	playVideo("https://www.youtube.com/watch?v=RdsZT7WKjW8");
}
else if(birthday == 0){
	JOptionPane.showMessageDialog(null, "fine");
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
