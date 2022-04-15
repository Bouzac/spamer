import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame implements ActionListener{
	JTextField textField = new JTextField("1");
	JFrame frame = new JFrame("Spamer");
	JButton spamButton = new JButton("Spamer !");
	JTextField textField2 = new JTextField("Type de spam :");
	JPanel panel = new JPanel();
	JCheckBox[] checkBox = new JCheckBox[7];
	
	public Frame() {
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		
		panel.setBounds(270, 100, 100, 200);
		
		textField.setBounds(30, 50, 200, 50);
		textField.setFont(new Font("BOLD",1, 30));
		
		textField2.setBounds(270, 50, 100, 25);
		textField2.setFocusable(false);
		textField2.setEditable(false);
		
		spamButton.addActionListener(this);
		spamButton.setFocusable(false);
		spamButton.setFont(new Font("BOLD",1, 30));
		spamButton.setBounds(30, 200, 200, 100);
		
		checkBox[0] = new JCheckBox("@everyone     ");
		checkBox[1] = new JCheckBox("@here              ");
		checkBox[2] = new JCheckBox("@Bouzac        ");
		checkBox[3] = new JCheckBox("@hyme URSS");
		checkBox[4] = new JCheckBox("A                       ");
		checkBox[5] = new JCheckBox("B                       ");
		checkBox[6] = new JCheckBox("C                       ");
		
		for(int i = 0; i < checkBox.length; i++) {
			checkBox[i].addActionListener(this);
			panel.add(checkBox[i]);
			
		}
		
		frame.add(panel);
		frame.add(textField2);
		frame.add(textField);
		frame.add(spamButton);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == spamButton) {
			int time = Integer.parseInt(textField.getText());
			
			if(checkBox[0].isSelected() == true) {
				try {
					main.everyoneSpam(time);
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(checkBox[1].isSelected() == true) {
				try {
					main.hereSpam(time);
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(checkBox[2].isSelected() == true) {
				try {
					main.bouzacSpam(time);
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(checkBox[3].isSelected() == true) {
				try {
					main.urssSpam(time);
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		
		for(int i = 0; i < checkBox.length; i++) {
			if(e.getSource() == checkBox[i]) {
				for(int j = 0; j < checkBox.length; j++) {
					checkBox[j].setSelected(false);
					
				}
				checkBox[i].setSelected(true);
			}			
		}
		
	}
	
}