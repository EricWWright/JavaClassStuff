package ch13examples;
import javax.swing.*;

public class Example1 {

	public static void main(String[] args) {
		
		String Result = JOptionPane.showInputDialog(null, "What's your favorite color?","color picker", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Your favorite color is " + Result, "color picker", JOptionPane.INFORMATION_MESSAGE);

	}

}
