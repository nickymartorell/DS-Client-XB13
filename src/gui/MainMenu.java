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
	private JTextArea Quote;
	private JButton btnCalendarWeekView;

	

	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(297, 169, 65, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("Calendar day view");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(217, 205, 208, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);

	QOTD = new JButton ("Quote:");
	QOTD.setBackground(new Color(255, 240, 245));
	QOTD.setBounds(10, 419, 208, 29);
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(new Color(255, 240, 245));
	weather.setBounds(217, 285, 208, 29);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	logOut = new JButton("Log out");
	logOut.setBackground(new Color(255, 240, 245));
	logOut.setBounds(548, 11, 92, 29);
	logOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(logOut);
	
	
	Quote = new JTextArea();
	Quote.setBounds(227, 423, 198, 25);
	Quote.setLineWrap(true);
	Quote.setWrapStyleWord(true);	
	add(Quote);
	
	btnCalendarWeekView = new JButton("Calendar week view");
	btnCalendarWeekView.setForeground(Color.BLACK);
	btnCalendarWeekView.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnCalendarWeekView.setBackground(new Color(255, 240, 245));
	btnCalendarWeekView.setBounds(217, 245, 208, 29);
	add(btnCalendarWeekView);
	
	
	}
	

	public void addActionListener(ActionListener l){
		viewCalendar.addActionListener(l);
		QOTD.addActionListener(l);
		weather.addActionListener(l);
		logOut.addActionListener(l);
		btnCalendarWeekView.addActionListener(l);
		
		
		
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


	public JTextArea getQuote() {
		return Quote;
	}


	public void setQuote(JTextArea quote) {
		Quote = quote;
	}


	public JButton getBtnCalendarWeekView() {
		return btnCalendarWeekView;
	}


	public void setBtnCalendarWeekView(JButton btnCalendarWeekView) {
		this.btnCalendarWeekView = btnCalendarWeekView;
	}
		
	
}
