package gui;


import java.awt.Font;




import javax.swing.*;

import logic.ActionController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.SystemColor;


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
	private JTextArea textAuthor;
	private String author;
	private String qTopic;

	


	public MainMenu(){
		
	setBackground(SystemColor.menu);
	setLayout(null);
		
	lblWelcome = new JLabel("QuoteMaster Pro Edition");
	lblWelcome.setBounds(203, 89, 329, 25);
	lblWelcome.setForeground(SystemColor.textHighlight);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 25));
	add(lblWelcome);
	
	textArea = new JTextArea("");
	textArea.setBounds(233, 199, 356, 120);
	textArea.setBackground(SystemColor.textHighlightText);
	textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	add(textArea);
	
	textAuthor = new JTextArea("");
	textAuthor.setBounds(233, 330, 247, 47);
	textAuthor.setBackground(SystemColor.textHighlightText);
	textAuthor.setFont(new Font("Tahoma", Font.PLAIN, 12));
	textAuthor.setLineWrap(true);
	textAuthor.setWrapStyleWord(true);
	add(textAuthor);

	QOTD = new JButton ("Quote");
	QOTD.setBounds(10, 392, 208, 29);
	QOTD.setBackground(SystemColor.textHighlight);
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setBounds(473, 392, 208, 29);
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(SystemColor.textHighlight);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	logOut = new JButton("Log out");
	logOut.setBounds(289, 392, 92, 29);
	logOut.setBackground(new Color(255, 240, 245));
	logOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(logOut);
	
	JLabel lblQuote = new JLabel("Quote:");
	lblQuote.setForeground(SystemColor.textHighlight);
	lblQuote.setFont(new Font("Tahoma", Font.PLAIN, 17));
	lblQuote.setBounds(164, 202, 59, 29);
	add(lblQuote);
	
	JLabel lblAuthor = new JLabel("Author");
	lblAuthor.setForeground(SystemColor.textHighlight);
	lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 17));
	lblAuthor.setBounds(164, 330, 59, 29);
	add(lblAuthor);
	
	
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

	public JTextArea gettextAuthor(){
		return textAuthor;
	}
	
	public void textAuthor(JTextArea textAuthor){
		this.textAuthor = textAuthor;
	}
	/*public void setTextAuthor(String author){
		textAuthor.setText(author);
	} */

	public String getAuthor(){
		return Quote;
	}
	
	public void setAuthor (String author){
		textAuthor.setText(author);
	}

	public JTextArea gettopic(){
		return topic;
	}
	public void setqtopic(String qTopic){
		this.setqTopic(qTopic);
	}


	public void setqTopic(String qTopic) {
		this.qTopic = qTopic;
	}
	}


	


