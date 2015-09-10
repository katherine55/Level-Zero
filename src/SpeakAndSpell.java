import javax.swing.JOptionPane;

public class SpeakAndSpell {
	public static void main(String[] args) throws InterruptedException {
		start();
	}

	static void start() throws InterruptedException {
		Thread.sleep(1000);
		speak("mandelbrot");
		String mandelbrot = JOptionPane.showInputDialog("Spell the word:");
		if (mandelbrot.equalsIgnoreCase("mandelbrot")) {
			speak("Correct!");
		} else {
			speak("False!");
			int n = JOptionPane.showOptionDialog(null,
					"Would you like to play again?", "Play Again?",
					JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, null,
					null, null);
			if (n == 0) {
				start();
			}

	Thread.sleep(1000);
	speak("ersatz");
	String ersatz = JOptionPane.showInputDialog("Spell the word:");
	if (ersatz.equalsIgnoreCase("ersatz")) {
				speak("Correct!");
				} else {
				speak("False!");
				int x = JOptionPane.showOptionDialog(null,
						"Would you like to play again?", "Play Again?",
						JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
						null, null, null);
				if (x == 0) {
					start();
				}
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
