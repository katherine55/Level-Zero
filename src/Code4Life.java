import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {


	public static void main(String[] args) {
		
		
		String hours = JOptionPane.showInputDialog("How many hours a week do you spend coding?");
		int time = Integer.parseInt(hours);
		if(time >= 3 && time <= 5){
			JOptionPane.showMessageDialog(null, "You're a coding ninja!");
		}
		else if(time <= 2){
			JOptionPane.showMessageDialog(null, "Stop taking this quiz and go code!");
		}
		else if (time > 5){
		playBatmanTheme();
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
