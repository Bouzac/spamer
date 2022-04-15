package spammer;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame implements ActionListener{
	JTextField textField = new JTextField();
	JFrame frame = new JFrame("Spamer");
	JButton spamButton = new JButton("Spamer !");
	
	public Frame() {
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		
		textField.setBounds(100, 50, 200, 50);
		textField.setFont(new Font("BOLD",1, 30));
		
		spamButton.addActionListener(this);
		spamButton.setFocusable(false);
		spamButton.setFont(new Font("BOLD",1, 30));
		spamButton.setBounds(100, 200, 200, 100);
		
		frame.add(textField);
		frame.add(spamButton);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == spamButton) {
			int time = Integer.parseInt(textField.getText());
			try {
				main.everyoneSpam(time);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	
}
