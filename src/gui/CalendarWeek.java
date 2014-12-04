package gui;

import javax.management.StringValueExp;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import logic.ActionController;

import java.awt.FlowLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalendarWeek extends JPanel {

	public static String MONTHDAYSEPARATOR = " ";
	public static final String BACK = "back";
	public static final String NEXT = "next";
	public static final String SELECTED = "go to selected week";
	public static final String DAY = "day";

private static String days[] = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY",
			"SUNDAY" };
	private static int WEEK_START;
	private static int YEAR_START;
	

	private JPanel PanelQuote;
	private JLabel lblQOTD;
	private JPanel Panelheader;
	private JPanel calendarPanel;
	private JPanel activePanel;
	private JButton[] btnDate = new JButton[7];
	private JButton btnPrevious;
	private JButton btnForward;
	private JButton btnSelected;
	private JLabel lblWeek;
	private JTextField weekTextField;
	private JPanel bottom;


	private Calendar calendar = new GregorianCalendar();
	private ActionController actionController;
	private JLabel lblYear;
	private JTextField yearTextField;
	

	public CalendarWeek(ActionController actionController) {
	this.actionController = actionController;
	setSize(Screen.WIDTH, Screen.HEIGHT);
	setLayout(new BorderLayout());

	WEEK_START = calendar.get(GregorianCalendar.WEEK_OF_YEAR);
	YEAR_START = calendar.get(GregorianCalendar.YEAR);

	
	Panelheader = new JPanel(new GridLayout(0, 7));
	Panelheader.setPreferredSize(new Dimension(10, 35));
	Panelheader.setBackground(Color.GRAY);
	Panelheader.setVisible(true);
	add(Panelheader, BorderLayout.NORTH);

	for (String day : days) {
		JLabel weekColumn = new JLabel(("" + day), SwingConstants.CENTER);
		Panelheader.add(weekColumn, new GridLayout(2, 7));
	
	
	}
	
	
			calendarPanel = new JPanel(new GridLayout(0, 7));
			add(calendarPanel, BorderLayout.CENTER);
			
			for (int b = 0; b < btnDate.length; b++) {
				btnDate[b] = new JButton();
				// btnDate[e].addActionListener(actionController);
				// btnDate[e].setActionCommand("button" + e);
				calendarPanel.add(btnDate[b], new GridLayout(2, 7));
			}

			insertdate(WEEK_START, YEAR_START); //der skal laves metode

			bottom = new JPanel();
			bottom.setLayout(new BorderLayout());
			add(bottom, BorderLayout.SOUTH);
			
			activePanel = new JPanel(new GridLayout(1,5));
			activePanel.setVisible(true);
			activePanel.setPreferredSize(new Dimension(0, 35));
			bottom.add(activePanel, BorderLayout.SOUTH);
			
			btnPrevious = new JButton("Previous");
			btnPrevious.addActionListener(actionController);
			btnPrevious.setActionCommand(BACK);
			activePanel.add(btnPrevious);
			
			btnForward = new JButton("Forward");
			btnForward.addActionListener(actionController);
			btnForward.setActionCommand(NEXT);
			activePanel.add(btnForward);
			
			btnSelected = new JButton ("Go to selected week");
			btnSelected.addActionListener(actionController);
			btnSelected.setActionCommand(SELECTED);
			activePanel.add(btnSelected);
			
			lblWeek = new JLabel("Week:");
			lblWeek.setHorizontalAlignment(SwingConstants.CENTER);
			lblWeek.setPreferredSize(new Dimension(10,10));
			activePanel.add(lblWeek);
			
			weekTextField = new JTextField(""+ WEEK_START);
			activePanel.add(weekTextField);
			
			lblYear = new JLabel ("Year:");
			lblYear.setHorizontalAlignment(SwingConstants.CENTER);
			lblYear.setPreferredSize(new Dimension(10, 10));
			activePanel.add(lblYear);
			
			yearTextField = new JTextField("" + YEAR_START);
			activePanel.add(yearTextField);
			
			PanelQuote = new JPanel();
			PanelQuote.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLUE));
			bottom.add(PanelQuote, BorderLayout.NORTH);
			
			lblQOTD = new JLabel("");
			lblQOTD.setHorizontalAlignment(SwingConstants.CENTER);
			lblQOTD.setPreferredSize(new Dimension(0,20));
			PanelQuote.add(lblQOTD);
	}

	private void insertdate(int week, int year){
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.YEAR, year);
		
		int thisMonth, thisDay;
		
		for (int i =0; i<btnDate.length; i++){
			thisMonth = calendar.get(Calendar.MONTH);
			thisDay = calendar.get(Calendar.DAY_OF_MONTH);
			
			switch(thisMonth){
			case 0: 
				btnDate[i].setText("January" + MONTHDAYSEPARATOR + (thisDay));
				break;
			
			case 1:
				btnDate[i].setText("February" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 2:
				btnDate[i].setText("March" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 3:
				btnDate[i].setText("April" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 4:
				btnDate[i].setText("May" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 5:
				btnDate[i].setText("June" + MONTHDAYSEPARATOR + (thisDay));
				break;
			
			case 6:
				btnDate[i].setText("July" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 7:
				btnDate[i].setText("August" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 8:
				btnDate[i].setText("September" + MONTHDAYSEPARATOR + (thisDay));
				break;
			
			case 9:
				btnDate[i].setText("October" + MONTHDAYSEPARATOR + (thisDay));
				break;
			
			case 10:
				btnDate[i].setText("November" + MONTHDAYSEPARATOR + (thisDay));
				break;
				
			case 11:
				btnDate[i].setText("December" + MONTHDAYSEPARATOR + (thisDay));
				break;
			}
			
			calendar.add(Calendar.DATE, 1);
			btnDate[i].addActionListener(actionController);
			
		}
	}
	
	public void updateDates(int nextWeek){
		
		WEEK_START += nextWeek;
		
		if(WEEK_START>52){
			WEEK_START =1;
			YEAR_START++;
			insertdate(WEEK_START, YEAR_START);
			
		}
		
		String stringWeek = String.valueOf(WEEK_START);
		String stringYear = String.valueOf(YEAR_START);
		weekTextField.setText(stringWeek);
		yearTextField.setText(stringYear);
	}
	
	public void goWeek(int weeknumber, int year){
		System.out.println("here" +weeknumber + year);
		
		System.out.println(year);
		insertdate(weeknumber, year);
	}
	
	public static int getYEAR_START(){
		return YEAR_START;
			
	}
	
	public JPanel getCalendarPanel(){
		return calendarPanel;
	}
	
	public void setCalendarPanel(JPanel calendarPanel){
		this.calendarPanel = calendarPanel;
		
	}
	
	public JPanel getActivePanel(){
		return activePanel;
		}
	
	public void setActivePanel(JPanel activePanel){
		this.activePanel = activePanel;
	}
	
	public JLabel getlblWeek(){
		return lblWeek;
	}
	
	public void setlblWeek(JLabel lblWeek){
		this.lblWeek = lblWeek;
	}

	
	public JTextField getWeekTextField(){
		return weekTextField;
	}
	
	public void setWeekTextField(JTextField weekTextField){
		this.weekTextField = weekTextField;
	}
	
	public JButton[] getbtnDate(){
		return btnDate;
	}
	

	public JLabel lblQOTD(){
		return lblQOTD;
	}
	
	public void setlblQOTD(JLabel lblQOTD){
		this.lblQOTD = lblQOTD;
	}

	public JTextField getyearTextField(){
		return yearTextField;
	}



}
	

		
		
	

