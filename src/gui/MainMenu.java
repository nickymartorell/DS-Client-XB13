package gui;


import java.awt.Font;

import javax.swing.*;

import logic.ActionController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JPanel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblWelcome;
	private JButton viewCalendar;
	private JButton logOut;
	private JButton QOTD;
	private JButton weather;
	private JTextArea Quote;

	

	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(192, 23, 65, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("View Calendar");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(162, 83, 123, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);

	QOTD = new JButton ("Get your qoute of the day!");
	QOTD.setBackground(new Color(255, 240, 245));
	QOTD.setBounds(121, 165, 208, 29);
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(new Color(255, 240, 245));
	weather.setBounds(149, 124, 152, 29);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	logOut = new JButton("Log out");
	logOut.setBackground(new Color(255, 240, 245));
	logOut.setBounds(177, 251, 92, 29);
	logOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(logOut);
	
	
	Quote = new JTextArea();
	Quote.setBounds(131, 206, 198, 16);
	Quote.setLineWrap(true);
	Quote.setWrapStyleWord(true);	
	add(Quote);
	
	
	}
	
	public MainMenu(ActionController actionController) {
		// TODO Auto-generated constructor stub
	}

	public void addActionListener(ActionListener l){
		viewCalendar.addActionListener(l);
		viewCalendar.setActionCommand("CalendarView");
		QOTD.addActionListener(l);
		QOTD.setActionCommand("quote");
		weather.addActionListener(l);
		weather.setActionCommand("btnWeather");
		logOut.addActionListener(l);
		logOut.setActionCommand("btnLogout");
		
		
	}
}
