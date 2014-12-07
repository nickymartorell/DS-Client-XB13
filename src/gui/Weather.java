package gui;



import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Vector;

import logic.ActionController;




public class Weather extends JPanel{

	/**
	 * 
	 */
	Vector<Object> navne = new Vector<Object>();
	
	private static final long serialVersionUID = 1L;
	private JButton btnMenu;
	private JScrollPane scroll;
	private JLabel weather;
	private JTable table;
	
	
	
	
	public Weather(){
		setBackground(new Color(199, 21, 133));
		setLayout(null);
		
		btnMenu = new JButton ("Back to menu");
		btnMenu.setBounds(239, 312, 208, 29);
		add(btnMenu);
		
		weather = new JLabel("Weatherforecast");
		weather.setForeground(new Color(255, 192, 203));
		weather.setBounds(239, 73, 174, 25);
		weather.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(weather);
		
		scroll = new JScrollPane();
		scroll.setBounds(124, 109, 425, 170);
		add(scroll);
		
	}
	
	public Weather(ActionController actionController) {
		// TODO Auto-generated constructor stub
	}

	public void NewTable(){
		
		navne = new Vector<Object>();
		navne.add("Day");
		navne.add("Temperature");
		navne.add("Description");
		table = new JTable(data, navne);
			scroll.setViewportView(table);
			
	}
	
	
	public void addActionListener(ActionListener z){
		btnMenu.addActionListener(z);
		
	}

	public Vector<Object> getNavne() {
		return navne;
	}

	public void setNavne(Vector<Object> navne) {
		this.navne = navne;
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}

	public void setBtnMenu(JButton btnMenu) {
		this.btnMenu = btnMenu;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JLabel getWeather() {
		return weather;
	}

	public void setWeather(JLabel weather) {
		this.weather = weather;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
		
	
	
	
	
	
	
	
	

}
