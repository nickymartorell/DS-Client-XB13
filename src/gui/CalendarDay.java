package gui;


import javax.swing.JPanel;

import logic.ActionController;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

import java.awt.SystemColor;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.multi.MultiLabelUI;

import java.awt.Color;

public class CalendarDay extends JPanel{
	
}
	/*
	*//**
	 * 
<<<<<<< Updated upstream
	 
=======
	 *//*
>>>>>>> Stashed changes
	private static final long serialVersionUID = 1L;
	public static final String WEEK = "week";
	public static final String NOTE = "note";
	public static final String CREATENOTE = "createNote";
	public static final String CREATEEVENT = "createEvent";
	public static final String DELETEEVENT = "DeleteEvent";
	public static final String DELETENOTE = "DeleteNote";
	
	private JLabel lblViewDay;
	private JPanel event;
	private JPanel activePanel;
	private JTable TableEvent;
	private JScrollPane ScrollEvent;
	private JButton create;
	private JButton delete;
	private JButton backToWeek;
	private JButton note;
	private JButton createNote;
	private JButton deleteNote;
	private JTextArea WeatherText;
	private JTextArea noteText;
	private JTextField setTextField;
	private JPanel panelBottom;
	private JPanel info;
	private JPanel notes;
	


public CalendarDay (){
	setSize(Screen.WIDTH, Screen.HEIGHT);
	setLayout(new BorderLayout());
	
	lblViewDay = new JLabel("Day view");
	lblViewDay.setHorizontalAlignment(SwingConstants.CENTER);
	add(lblViewDay, BorderLayout.NORTH);
	
	event = new JPanel();
	add(event, BorderLayout.CENTER);
	event.setLayout(new BorderLayout(0,0));
	
	notes = new JPanel();
	notes.setMaximumSize(new Dimension(1000,100));
	notes.setPreferredSize(new Dimension(300, 100));
	notes.setMinimumSize(new Dimension(1, 100));
	notes.setVisible(true);
	event.add(notes, BorderLayout.EAST);
	
	
	noteText = new JTextArea("");
	noteText.setBackground(SystemColor.control);
	noteText.setEditable(false);
	noteText.setWrapStyleWord(true);
	noteText.setVisible(true);
	noteText.setLineWrap(true);
	note.add(noteText);
	
	panelBottom = new JPanel();
	add(panelBottom, BorderLayout.SOUTH);
	panelBottom.setLayout(new BorderLayout(0,0));
	
	activePanel = new JPanel();
	panelBottom.add(activePanel, BorderLayout.SOUTH);
	
	create = new JButton("Create new event");
	activePanel.add(create);
	
	delete = new JButton ("Delete event");
	activePanel.add(delete);
	
	backToWeek = new JButton ("back to week view");
	activePanel.add(backToWeek);
	
	note = new JButton("View note");
	activePanel.add(note);
	
	info = new JPanel();
	info.setLayout(new GridLayout(0, 4, 0, 0));
	panelBottom.add(info, BorderLayout.NORTH);
	
	
	WeatherText = new JTextArea("");
	WeatherText.setEditable(false);
	WeatherText.setWrapStyleWord(true);
	WeatherText.setLineWrap(true);
	WeatherText.setBackground(SystemColor.control);
	info.add(WeatherText);
	
	createNote = new JButton("Create new note");
	createNote.setVisible(true);
	info.add(createNote);
	
	deleteNote = new JButton("Delete note");
	deleteNote.setVisible(true);
	info.add(deleteNote);
	
	setTextField = new JTextField();
	setTextField.setText("add new note");
	setTextField.setVisible(true);
	info.add(setTextField);
	
}

public void updateEvents(object [][] data, String[] header){
	if(TableEvent != null){
		event.remove(TableEvent);
		event.remove(ScrollEvent);
	}
	TableEvent = new JTable(data, header);
	TableEvent.setPreferredScrollableViewportSize(new Dimension(800,70));
	TableEvent.setFillsViewportHeight(true);
	
	ScrollEvent = new JScrollPane(TableEvent);
	ScrollEvent.setBounds(26, 30, 930, 280);
	event.add(ScrollEvent);
	
	}

	public void removeTable(){
		event.remove(TableEvent);
		event.remove(ScrollEvent);
	}

	public JLabel getlblViewDay(){
		return lblViewDay;
	}
	
	public void setlblViewDay(JLabel lblViewDay){
		this.lblViewDay = lblViewDay;
	}

	public JPanel getevent(){
		return event;
	}
	
	public void setevent(JPanel event){
		this.event = event;
	}
	
	public JPanel activePanel(){
		return activePanel;
	}
	
	public void setactivePanel(){
		this.activePanel = activePanel;
	}
	
	public JTextArea getWeatherText(){
		return WeatherText;
	}
	
	public void setWeatherText(JTextArea WeatherText){
		this.WeatherText = WeatherText;
	}
	
	public JTextArea getnoteText(){
		return noteText;
	}
	
	public void setNoteText(JTextArea noteText){
		this.noteText  = noteText;
	}
	
	public JButton getcreateNote(){
		return createNote;
	}
	
	public void setcreateNote(JButton createNote){
		this.createNote = createNote;
	}
	
	public JTextField getTextField(){
		return setTextField;
	}
	public void setSetTextField(JTextField setTextField){
		this.setTextField = setTextField;
	}
	
	public JPanel getnotes(){
		return notes;
	}
	
	public void setnotes(JPanel notes){
		this.notes = notes;
	}
	
	public JButton getdeleteNote(){
		return deleteNote;
	}
	
	public void setdeleteNote(JButton deleteNote){
		this.deleteNote = deleteNote;
	}
	
	*/
	
/*	

	
}

	


	/*import java.awt.EventQueue;


	import javax.swing.JFrame;
import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.ActionController;
import java.awt.Font;

	public class CalendarDay {

		JFrame frame;

		*//**
		 * Launch the application.
		 *//*
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

		*//**
		 * Create the application.
		 *//*
		public CalendarDay() {
			initialize();
		}

		public CalendarDay(ActionController actionController) {
			// TODO Auto-generated constructor stub
		}

		*//**
		 * Initialize the contents of the frame.
		 *//*
		private void initialize() {
			frame = new JFrame("Calendar");
			frame.getContentPane().setBackground(new Color(199, 21, 133));
			frame.setBounds(150, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton btnViewMonth = new JButton("Month");
			btnViewMonth.setBounds(24, 18, 65, 29);
			frame.getContentPane().add(btnViewMonth);
			
			JButton btnViewWeek = new JButton("Week");
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
*/

