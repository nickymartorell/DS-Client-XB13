package gui;


import java.awt.Font;

import javax.swing.*;

import logic.ActionController;

import java.awt.Color;
import java.awt.event.ActionListener;


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
	private JLabel labelQuote;
	private String Quote;

	

	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(257, 89, 65, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	labelQuote = new JLabel("prutfis");
	labelQuote.setBackground(new Color(199, 21, 133));
	labelQuote.setFont(new Font("Tahoma", Font.PLAIN, 10));
	labelQuote.setBounds(241, 345, 356, 127);
	add(labelQuote);
	
	
	
	
	viewCalendar = new JButton("Calendar day view");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(181, 146, 208, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);

	QOTD = new JButton ("Quote:");
	QOTD.setBackground(new Color(255, 240, 245));
	QOTD.setBounds(10, 392, 208, 29);
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(new Color(255, 240, 245));
	weather.setBounds(181, 226, 208, 29);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	logOut = new JButton("Log out");
	logOut.setBackground(new Color(255, 240, 245));
	logOut.setBounds(482, 23, 92, 29);
	logOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(logOut);
	
	JButton btnCalendarWeekView = new JButton("Calendar week view");
	btnCalendarWeekView.setForeground(Color.BLACK);
	btnCalendarWeekView.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnCalendarWeekView.setBackground(new Color(255, 240, 245));
	btnCalendarWeekView.setBounds(181, 186, 208, 29);
	add(btnCalendarWeekView);
	
	
	}
	

	public void addActionListener(ActionListener l){
		viewCalendar.addActionListener(l);
		QOTD.addActionListener(l);
		weather.addActionListener(l);
		logOut.addActionListener(l);
		
		
	}

	public String getQuote(){
		return Quote;
	}
	
	public void setQuote (String Quote){
		this.Quote = Quote;
	}

	public JLabel getLblWelcome() {
		return lblWelcome;
	}


	public void setLblWelcome(JLabel lblWelcome) {
		this.lblWelcome = lblWelcome;
	}


	public JButton getViewCalendar() {
		return viewCalendar;
	}


	public void setViewCalendar(JButton viewCalendar) {
		this.viewCalendar = viewCalendar;
	}


	public JButton getLogOut() {
		return logOut;
	}


	public void setLogOut(JButton logOut) {
		this.logOut = logOut;
	}


	public JButton getQOTD() {
		return QOTD;
	}


	public void setQOTD(JButton qOTD) {
		QOTD = qOTD;
	}


	public JButton getWeather() {
		return weather;
	}


	public void setWeather(JButton weather) {
		this.weather = weather;
	}


	public JLabel getlabelQuote() {
		return labelQuote;
	}


	public void labelQuote(JLabel quote) {
		labelQuote = quote;
	}
}
