package gui;

	import java.awt.EventQueue;


	import javax.swing.JFrame;
import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.ActionController;
import java.awt.Font;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logic.ActionController;

public class CalendarWeek {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarDay window = new CalendarDay();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public CalendarWeek() {
		initialize();
	}

	public CalendarWeek(ActionController actionController) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calendar");
		frame.getContentPane().setBackground(new Color(199, 21, 133));
		frame.setBounds(150, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnViewMonth = new JButton("Month");
		btnViewMonth.setBounds(24, 18, 65, 29);
		frame.getContentPane().add(btnViewMonth);
		
		JButton btnViewWeek = new JButton("Day");
		btnViewWeek.setBounds(85, 18, 65, 29);
		frame.getContentPane().add(btnViewWeek);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(164, 243, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 105, 180));
		panel.setBounds(34, 59, 377, 172);
		frame.getContentPane().add(panel);
		
		JButton btnNewNote = new JButton("New note");
		btnNewNote.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewNote.setBounds(144, 18, 76, 29);
		frame.getContentPane().add(btnNewNote);
		
		JButton btnDeleteCalendar = new JButton("Delete calendar");
		btnDeleteCalendar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnDeleteCalendar.setBounds(214, 18, 104, 29);
		frame.getContentPane().add(btnDeleteCalendar);
		
		JButton btnCreateCalendar = new JButton("Create calendar");
		btnCreateCalendar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnCreateCalendar.setBounds(315, 18, 104, 29);
		frame.getContentPane().add(btnCreateCalendar);
		
		
		
		
	}
}
