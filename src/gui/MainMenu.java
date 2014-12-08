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
	private JTextArea textAuthor;
	private String author;
	private JTextArea topic;
	private String qTopic;

	


	public MainMenu(){
		
	setBackground(new Color(199, 21, 133));
	setLayout(null);
		
	lblWelcome = new JLabel("MENU");
	lblWelcome.setBounds(314, 89, 111, 25);
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 25));
	add(lblWelcome);
	
	textArea = new JTextArea("");
	textArea.setBounds(235, 246, 356, 120);
	textArea.setBackground(new Color(199, 21, 133));
	textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	add(textArea);
	
	textAuthor = new JTextArea("");
	textAuthor.setBounds(233, 389, 247, 47);
	textAuthor.setBackground(new Color(199, 21, 133));
	textAuthor.setFont(new Font("Tahoma", Font.PLAIN, 12));
	textAuthor.setLineWrap(true);
	textAuthor.setWrapStyleWord(true);
	add(textAuthor);
	
	topic = new JTextArea("");
	topic.setBounds(257, 196, 247, 47);
	topic.setFont(new Font("Tahoma", Font.PLAIN, 12));
	topic.setLineWrap(true);
	topic.setWrapStyleWord(true);
	topic.setBackground(new Color(199, 21, 133));
	add(topic);

	QOTD = new JButton ("Quote");
	QOTD.setBounds(10, 392, 208, 29);
	QOTD.setBackground(new Color(255, 240, 245));
	QOTD.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(QOTD);
	
	weather = new JButton("Weatherforecast");
	weather.setBounds(10, 352, 208, 29);
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(new Color(255, 240, 245));
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	logOut = new JButton("Log out");
	logOut.setBounds(482, 23, 92, 29);
	logOut.setBackground(new Color(255, 240, 245));
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
	public void settopic(JTextArea topic){
		this.topic = topic;
	}
	
	public String getqTopic(){
		return Quote;
	}
	public void setqtopic(String qTopic){
		this.setqTopic(qTopic);
	}


	public void setqTopic(String qTopic) {
		this.qTopic = qTopic;
	}
		
	}


	


