import javax.swing.JOptionPane;

public class Riddler {
public static void main(String[] args) {
	int score = 0;
String guess =	JOptionPane.showInputDialog("What has four eyes but can't see?");
	if (guess.equals("Mississippi")) { 
	JOptionPane.showMessageDialog(null, "Correct!");
	score ++;
	JOptionPane.showMessageDialog(null, "You have " + score + " point.");
	}
	else {
	JOptionPane.showMessageDialog(null, "Wrong!");	
	}
	String second =	JOptionPane.showInputDialog("What belongs to you, but is used by everyone else?");
	if(second.equals("Your name.")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score ++;
	JOptionPane.showMessageDialog(null, "You have " + score + " point.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong!");
	}
	}
	}

		
	
	

