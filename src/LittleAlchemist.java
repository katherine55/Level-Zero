import java.awt.Color;

import javax.swing.*;

public class LittleAlchemist {
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	public static void main(String[] args) {
		LittleAlchemist alchemist = new LittleAlchemist();
		alchemist.elements();
	}
	private void elements() {
		JOptionPane.showMessageDialog(null, "Welcome to Normal Alchemist");
		myFrame.setVisible(true);
		myFrame.setSize(500, 500);
		myFrame.setLocation(710, 290);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myPanel.setBackground(Color.LIGHT_GRAY);
		myFrame.add(myPanel);
			
		
	}

}
