import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "August 2nd";
		String dadsBirthday = "July 31st";
		String myBirthday = "February 14th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String answer = JOptionPane
				.showInputDialog("Whose birthday would you like to know? Moms, Dads, or Katherines?");
		String answer2 = JOptionPane.showInputDialog("Just to be sure, you wanted to know " + answer + "'s birthday?");
		if(answer2.equalsIgnoreCase("no")){
			answer = JOptionPane.showInputDialog("So, whose birthday would you like to know? Moms, Dads, or Katherines?");
		}
		// 3. Print out what the user typed
		if(answer.equalsIgnoreCase("moms")){
			JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday);
		}
		// 4. if user asked for "mom"
		// print mom's birthday
		else if(answer.equalsIgnoreCase("dads")){
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if(answer.equalsIgnoreCase("katherines")){
			JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
