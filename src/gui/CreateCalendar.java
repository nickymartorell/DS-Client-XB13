package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateCalendar extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private JLabel CreateCalendar;
	private JButton back;
	private JButton newCalendar;
	private JButton shareCalendar;
	
	
	public CreateCalendar(){
	
		setBackground(new Color(199, 21, 133));
		setLayout(null);
		
		CreateCalendar = new JLabel("Let's make a new calendar!");
		CreateCalendar.setBounds(48, 23, 354, 25);
		CreateCalendar.setForeground(new Color(255, 192, 203));
		CreateCalendar.setFont(new Font("Dialog", Font.BOLD, 25));
		add(CreateCalendar);
		
		back = new JButton ("Back to menu");
		back.setBounds(149, 229, 152, 29);
		back.setForeground(new Color(255, 192, 203));
		back.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(back);
		
		newCalendar = new JButton("Create new note");
		newCalendar.setForeground(new Color(255, 192, 203));
		newCalendar.setBounds(149, 83, 152, 29);
		newCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(shareCalendar);
		
		shareCalendar = new JButton("Share this calendar with another user");
		shareCalendar.setForeground(new Color(255, 192, 203));
		shareCalendar.setBounds(92, 83, 266, 29);
		shareCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(shareCalendar);
		
	}


}
