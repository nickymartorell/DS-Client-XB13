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
	private JButton btnQOTD;
	private JButton weather;
	private JTextArea Quote;

	

	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(257, 89, 65, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("Calendar day view");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(181, 146, 208, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);

	btnQOTD = new JButton ("Quote:");
	btnQOTD.setBackground(new Color(255, 240, 245));
	btnQOTD.setBounds(10, 392, 208, 29);
	btnQOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(btnQOTD);
	
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
	
	
	Quote = new JTextArea();
	Quote.setBounds(226, 392, 198, 25);
	Quote.setLineWrap(true);
	Quote.setWrapStyleWord(true);	
	add(Quote);
	
	JButton btnCalendarWeekView = new JButton("Calendar week view");
	btnCalendarWeekView.setForeground(Color.BLACK);
	btnCalendarWeekView.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnCalendarWeekView.setBackground(new Color(255, 240, 245));
	btnCalendarWeekView.setBounds(181, 186, 208, 29);
	add(btnCalendarWeekView);
	
	
	}
	

	public void addActionListener(ActionListener l){
		viewCalendar.addActionListener(l);
		btnQOTD.addActionListener(l);
		weather.addActionListener(l);
		logOut.addActionListener(l);
		
		
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
		return btnQOTD;
	}


	public void setQOTD(JButton qOTD) {
		btnQOTD = qOTD;
	}


	public JButton getWeather() {
		return weather;
	}


	public void setWeather(JButton weather) {
		this.weather = weather;
	}


	public JTextArea getQuote() {
		return Quote;
	}


	public void setQuote(JTextArea quote) {
		Quote = quote;
	}
}
