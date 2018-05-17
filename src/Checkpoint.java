import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
String color = JOptionPane.showInputDialog("What is your favorite color");
JOptionPane.showMessageDialog(null, color + " is my favorite too.");
Robot Bot = new Robot();
if (color.equals("Green")) {
	Robot.setpencolor);
}
Bot.penDown();
Bot.move(120);
Bot.turn(120);
Bot.move(120);
Bot.turn(120);
Bot.move(120);
Bot.penUp();
Bot.move(90);


}
}
