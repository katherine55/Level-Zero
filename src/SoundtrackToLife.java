import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "So how do u feel about that?", "Potato", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Potatos", "Lazy", "Uni-corny", "Ducks" }, null);
		if(userMood== 1){
			playVideo("https://www.youtube.com/watch?v=61vai1vARGA");
		}
		
		else if(userMood==5){
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		
		else if(userMood == 0){
			playVideo("https://www.youtube.com/watch?v=xxlWvE2U0nw");
		}
		
		else if(userMood == 4){
			playVideo("https://www.youtube.com/watch?v=4mdQgvGrhwU");
		}
		
		else if(userMood==3){
			playVideo("https://www.youtube.com/watch?v=yycb-MTri3g");
		}
		else if(userMood == 2){
			playVideo("https://www.youtube.com/watch?v=q7uyKYeGPdE#");
		}
		// 2. Their answer is stored in the userMood variable. Print it out.

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

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


