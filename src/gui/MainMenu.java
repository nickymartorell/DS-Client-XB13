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
	private JButton logOut;
	private JButton QOTD;
	private JButton weather;
	private JTextArea textArea;
	private String Quote;

	

	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(257, 89, 65, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	textArea = new JTextArea("");
	textArea.setBackground(new Color(199, 21, 133));
	textArea.setBounds(241, 345, 356, 127);
	textArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	add(textArea);
	

	QOTD = new JButton ("Quote");
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
	
	
	}
	

	public void addActionListener(ActionListener l){
		QOTD.addActionListener(l);
		QOTD.setActionCommand("QOTD");
		

		weather.addActionListener(l);
		logOut.addActionListener(l);
		logOut.setActionCommand("Logout");

		
	}
	

	
	public String getQuote(){
		return Quote;
	}
	
	public void setQuote (String quote){
		textArea.setText(quote);
	}

	public JLabel getLblWelcome() {
		return lblWelcome;
	}


	public void setLblWelcome(JLabel lblWelcome) {
		this.lblWelcome = lblWelcome;
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


	public JTextArea getlabelQuote() {
		return textArea;
	}


	public void labelQuote(JTextArea quote) {
		textArea = quote;
	}
}
