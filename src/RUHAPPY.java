import javax.swing.JOptionPane;

public class RUHAPPY {

	public static void main(String[] args) {
		questions();
	}

	public static void questions() {
		int question1 = JOptionPane.showConfirmDialog(null, "Are you happy?",
				null, JOptionPane.YES_NO_OPTION);
		if(question1 == 0){
			JOptionPane.showMessageDialog(null,  "Keep doing whatever you're doing");
		}
		else {
			int question2 = JOptionPane.showConfirmDialog(null,
					"Do you want to be happy?", null, JOptionPane.YES_NO_OPTION);
			if(question2 == 1){
				JOptionPane.showMessageDialog(null,  "Keep doing whatever you're doing");
			}
			else{
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
	}
}