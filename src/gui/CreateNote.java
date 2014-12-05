package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateNote extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	private JLabel CreateNote;
	private JButton back;
	private JButton newNote;
	
	public CreateNote(){
	
		setBackground(new Color(199, 21, 133));
		setLayout(null);
		
		CreateNote = new JLabel("Let's make some new notes!");
		CreateNote.setBounds(34, 23, 381, 25);
		CreateNote.setForeground(new Color(255, 192, 203));
		CreateNote.setFont(new Font("Tahoma", Font.BOLD, 25));
		add(CreateNote);
		
		back = new JButton ("Back to calendar");
		back.setBounds(149, 229, 152, 29);
		back.setForeground(new Color(255, 192, 203));
		back.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(back);
		
		newNote = new JButton("Create new note");
		newNote.setForeground(new Color(255, 192, 203));
		newNote.setBounds(149, 83, 152, 29);
		newNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(newNote);
		
	}
		/*		
	
	
	viewCalendar = new JButton("View Calendar");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
		viewCalendar.setBounds(162, 83, 123, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);
	*/
		
	}

