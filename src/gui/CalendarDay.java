package gui;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.ActionController;

	public class CalendarDay {

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
		 */
		public CalendarDay() {
			initialize();
		}

		public CalendarDay(ActionController actionController) {
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
			
			JButton btnViewMonth = new JButton("View month");
			btnViewMonth.setBounds(24, 18, 117, 29);
			frame.getContentPane().add(btnViewMonth);
			
			JButton btnViewWeek = new JButton("View week");
			btnViewWeek.setBounds(294, 18, 117, 29);
			frame.getContentPane().add(btnViewWeek);
			
			JButton btnBack = new JButton("Back");
			btnBack.setBounds(164, 243, 117, 29);
			frame.getContentPane().add(btnBack);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 105, 180));
			panel.setBounds(34, 59, 377, 172);
			frame.getContentPane().add(panel);
			
			
			
			
		}
	}


