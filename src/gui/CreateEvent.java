package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateEvent extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private JLabel CreateEvent;
	private JButton back;
	private JButton newEvent;
	
	public CreateEvent(){
	
		setBackground(new Color(199, 21, 133));
		setLayout(null);
		
		CreateEvent = new JLabel("Let's make some new events!");
		CreateEvent.setBounds(34, 23, 381, 25);
		CreateEvent.setForeground(new Color(255, 192, 203));
		CreateEvent.setFont(new Font("Dialog", Font.BOLD, 25));
		add(CreateEvent);
		
		back = new JButton ("Back to calendar");
		back.setBounds(149, 229, 152, 29);
		back.setForeground(new Color(255, 192, 203));
		back.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(back);
		
		newEvent = new JButton("Create new event");
		newEvent.setForeground(new Color(255, 192, 203));
		newEvent.setBounds(149, 85, 152, 29);
		newEvent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(newEvent);
		
	}
}