package myProject;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddingNumber extends JPanel implements ActionListener {
	JButton button;
	JTextField text;
	JTextField result;
	JPanel panel;
	JLabel label;
	int number;

	
	public void prepareGUI() {
		JFrame frame = new JFrame();
		panel = new JPanel();
		label = new JLabel("Enter the number");
		text = new JTextField(10);
		button = new JButton ("Convert");
		button.addActionListener(this);
		result = new JTextField(20);
		panel.add(label);
		panel.add(text);
		panel.add(button);
		panel.add(result);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,200);
		frame.setVisible(true);	
	}
	public void actionPerformed(ActionEvent event) {
		String a = text.getText();
		number = Integer.parseInt(a);
		increaseEachDigit();
	}
	
	void increaseEachDigit() {	
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int x = 0;
		while (number != 0) {
			digits.add(number % 10);
			number = number / 10; 
			}
		int i = digits.size() - 1;
		while (i >= 0) {
			x = x*10 + digits.get(i)+1;
			i--;
		}
		String s = String.valueOf(x);
		result.setText(s);
	}
		

	public static void main(String[] args) {
		new AddingNumber().prepareGUI();
		
	}
}
