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
		btnMenu.setBounds(124, 242, 208, 29);
		btnMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent x){
			}
			
		});
		add(btnMenu);
		
		weather = new JLabel("Weatherforecast");
		weather.setForeground(new Color(255, 192, 203));
		weather.setBounds(138, 23, 174, 25);
		weather.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(weather);
		
		scroll = new JScrollPane();
		scroll.setBounds(19, 60, 425, 170);
		add(scroll);
		
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
		btnMenu.setActionCommand("MenuBtn");
		
	}
		
	
	
	
	
	
	
	
	

}
