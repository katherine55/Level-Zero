import javax.swing.JOptionPane;
public class YearAlive {
public static void main(String[] args) {
	int year = 2015;
	String name = 
			JOptionPane.showInputDialog("What is your name?");
	String answer = 
			JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null, name + " is " + answer + " years old!\nHappy " + answer + "th birthday!");
System.out.println("You were alive in 2015");
int number = Integer.parseInt(answer);
	for(int i = 0; i < number; i++){
		
	year -= 1;
	System.out.println("You were alive in " + year);
}

}}
