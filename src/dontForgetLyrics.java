import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class dontForgetLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to
	 * guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under
	 * "src".
	 */

	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null,
				"This a game. Type what lyrics come next. ;)");
		// 5. Use the playSound method to play your song.
		playSound("potato.wav");
		// 6. Make a pop-up for the player to type their answer.
		String answer1 = JOptionPane.showInputDialog("What comes next?");
		if (answer1.contains("san francisco") && answer1.contains("heart"))
		{
			JOptionPane.showMessageDialog(null, "wow  ");
		}
		else{
			JOptionPane.showMessageDialog(null, "WRONG!");
			playMore("heart.wav");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 7. If they answered correctly, tell them that they were right.

		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final
		// score.
	}
	public static void playMore(String fileMore) {
		AudioClip audioClip = JApplet.newAudioClip(new dontForgetLyrics()
				.getClass().getResource(fileMore));
		audioClip.play();}
	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new dontForgetLyrics()
				.getClass().getResource(fileName));
		audioClip.play();
	}
}
