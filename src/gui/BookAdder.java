package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JPanel {
	WindowFrame frame;
	
	public BookAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ",  JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ",  JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelCode = new JLabel("Code : ",  JLabel.TRAILING);
		JTextField fieldCode = new JTextField(10);
		labelCode.setLabelFor(fieldCode);
		panel.add(labelCode);
		panel.add(fieldCode);
		
		JLabel labelInfo = new JLabel("Info : ",  JLabel.TRAILING);
		JTextField fieldInfo = new JTextField(10);
		labelInfo.setLabelFor(fieldInfo);
		panel.add(labelInfo);
		panel.add(fieldInfo);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}
