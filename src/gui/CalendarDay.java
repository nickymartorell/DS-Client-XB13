package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CalendarDay extends JFrame {

<<<<<<< Updated upstream

private static final long serialVersionUID = 1L;
static JButton btnNext, btnPrev;
static int currYear, currDOM, currentMonth;
private JTable tabel;
private JButton btnAddNote;
private JButton btnAddEvent;
private JButton btnBackToMenu; 
private JButton btnViewWeek; 




public CalendarDay() {
    this.setSize(800,600);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setVisible(true);
    this.setTitle("Calendar");
  


    JPanel borderPanel = new JPanel();
    borderPanel.setLayout(new BorderLayout());
    getContentPane().add(borderPanel);
    borderPanel.setBackground((new Color(199, 21, 133)));
    

    // Initialize GregorianCalendar
    GregorianCalendar cal = new GregorianCalendar();
    int currYear = cal.get(GregorianCalendar.YEAR);
    int currDOM = cal.get(GregorianCalendar.DAY_OF_MONTH);
    int currMnth = cal.get(GregorianCalendar.MONTH);
    currentMonth = currMnth;
    String StringMnth = "";
        switch(currMnth) {
        
        case 0: StringMnth = ""; break;
        case 1: StringMnth = "January"; break;
        case 2: StringMnth = "February"; break;
        case 3: StringMnth = "March"; break;
        case 4: StringMnth = "April"; break;
        case 5: StringMnth = "May"; break;
        case 6: StringMnth = "June"; break;
        case 7: StringMnth = "July"; break;
        case 8: StringMnth = "August"; break;
        case 9: StringMnth = "September"; break;
        case 10: StringMnth = "October"; break;
        case 11: StringMnth = "November"; break;
        case 12: StringMnth = "December"; break;
    }
    int nod, som;
    cal.set(GregorianCalendar.DATE, 1);
    nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH); //Number of Days
    som = (cal.get(GregorianCalendar.DAY_OF_WEEK) - GregorianCalendar.SUNDAY + 7)%7; // Start of the Month

    // Button Layout
    final int ROWS = 6;
    final int COLS = 7;
    JButton[][] days;
    
    //HER !! 
    
    String[] columnNames = {"Time"};
   	Object[] JTable;
	Object[][] data = {
=======
private static final long serialVersionUID = 1L;
public static final String viewWeek = "viewweek";
public static final String viewNote = "viewnote";
public static final String newNote = "newnote";
public static final String CreateEvent = "createEvent";
public static final String DeleteEvent ="deleteEvent";
public static final String DeleteNote ="deleteNote";
public static final String Back ="Backtomenu";

private JLabel dayView;
private JPanel event;
//private JTable eventTable;
//private JScrollPane eventScroll;
private JButton createEvent;
private JButton deleteEvent;
private JButton backToMenu;
private JButton createNote;
private JButton deleteNote;
private JButton BTNviewWeek;
private JButton viewNotes;
private JTextField textField;
private JTable tabel;
//private JLabel forecast; //her skal vejrudsigten ind
//private JLabel note; //her skal noten indsættes


public CalendarDay(){
	setBackground(new Color(199, 21, 133));
	getContentPane().setLayout(null);
	
	dayView = new JLabel("This is your calendar");
	dayView.setBounds(113, 33, 275, 25);
	dayView.setForeground(new Color(255, 192, 203));
	dayView.setFont(new Font("Dialog", Font.BOLD, 25));
	getContentPane().add(dayView);
	
	event = new JPanel();
	getContentPane().add(event, BorderLayout.CENTER);
	event.setLayout(new BorderLayout(0, 0));
	setBackground(new Color(199, 21, 133));
	
	createEvent = new JButton("Create event");
	createEvent.setBounds(327, 180, 152, 29);
	createEvent.setForeground(new Color(255, 192, 203));
	createEvent.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(createEvent);
	
	deleteEvent = new JButton ("Delete event");
	deleteEvent.setBounds(327, 208, 152, 29);
	deleteEvent.setForeground(new Color(255, 192, 203));
	deleteEvent.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(deleteEvent);
	
	backToMenu = new JButton ("Back to menu");
	backToMenu.setBounds(327, 237, 152, 29);
	backToMenu.setForeground(new Color(255, 192, 203));
	backToMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(backToMenu);
	
	createNote = new JButton("Create note");
	createNote.setBounds(327, 123, 152, 29);
	createNote.setForeground(new Color(255, 192, 203));
	createNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(createNote);
	
	deleteNote = new JButton("Delete note");
	deleteNote.setBounds(327, 152, 152, 29);
	deleteNote.setForeground(new Color(255, 192, 203));
	deleteNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(deleteNote);
	
	BTNviewWeek = new JButton("View week");
	BTNviewWeek.setBounds(327, 70, 152, 29);
	BTNviewWeek.setForeground(new Color(255, 192, 203));
	BTNviewWeek.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(BTNviewWeek);
	
	viewNotes = new JButton("View notes");
	viewNotes.setBounds(327, 97, 152, 29);
	viewNotes.setForeground(new Color(255, 192, 203));
	viewNotes.setFont(new Font("Tahoma", Font.PLAIN, 14));
	getContentPane().add(viewNotes);
	
	textField = new JTextField();
	textField.setBounds(50, 70, 208, 285);
	getContentPane().add(textField);
	textField.setColumns(10);
	textField.add(tabel);
	
	/* String[] columnNames = {"Time"};
   	Object[][] data = {
>>>>>>> Stashed changes
   		//	{"Time", "Mon " + MonDay, 
   		//		"Tue " + TueDay, "Wed " + WedDay, 
   		//		"Thu" + ThuDay, "Fri " + FriDay, "Sat " + SatDay, "Sun " + SunDay},
			
			{"00.00", null, null, null, null, null, null, null},
			{"01.00", null, null, null, null, null, null, null},
			{"02.00", null, null, null, null, null, null, null},
			{"03.00", null, null, null, null, null, null, null},
			{"04.00", null, null, null, null, null, null, null},
			{"05.00", null, null, null, null, null, null, null},
   			{"06.00", null, null, null, null, null, null, null},
   			{"07.00", null, null, null, null, null, null, null},
   			{"08.00", null, null, null, null, null, null, null},
   			{"09.00", null, null, null, null, null, null, null},
   			{"10.00", null, null, null, null, null, null, null},
   			{"11.00", null, null, null, null, null, null, null},
   			{"12.00", null, null, null, null, null, null, null},
   			{"13.00", null, null, null, null, null, null, null},
   			{"14.00", null, null, null, null, null, null, null},
   			{"15.00", null, null, null, null, null, null, null},
   			{"16.00", null, null, null, null, null, null, null},
   			{"17.00", null, null, null, null, null, null, null},
   			{"18.00", null, null, null, null, null, null, null},
   			{"19.00", null, null, null, null, null, null, null},
   			{"20.00", null, null, null, null, null, null, null},
   			{"21.00", null, null, null, null, null, null, null},
   			{"22.00", null, null, null, null, null, null, null},
   			{"23.00", null, null, null, null, null, null, null},
   			{"24.00", null, null, null, null, null, null, null},
	};
    
   	tabel = new JTable(data, columnNames);		
   	tabel.setRowHeight(20);
   	tabel.setBounds(0, 6, 313, 494);
   	tabel.setFillsViewportHeight(true);
   	tabel.setColumnSelectionAllowed(true);
   	tabel.setCellSelectionEnabled(true);
    tabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
	tabel.setSurrendersFocusOnKeystroke(true);
	tabel.setShowGrid(true);
<<<<<<< Updated upstream
	tabel.setBackground(Color.PINK);
	// skal rettes til at man ikke skal kunne skrive i tabellen!! 

    JPanel calendar = new JPanel();
    calendar.setLayout(null);
    calendar.add(tabel);
    calendar.setBackground((new Color(199, 21, 133)));
    days = new JButton[ROWS][COLS];
    for(int row = 0; row < ROWS; row++) {
        for(int col = 0; col < COLS; col++) {
            days[row][col] = new JButton("");
            calendar.add(days[row][col]);
        }
    }


    int[] tableMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    int startDay = som;
    int daysInMonth = tableMonth[currMnth];
    for(int i = 0; i < daysInMonth; i++){
        days[(startDay + i)/7][(startDay + i) % 7].setText("" + (i + 1));
    }
    borderPanel.add(calendar, BorderLayout.CENTER);

 
    btnNext = new JButton("View tomorrow");
    btnPrev = new JButton("View yesterday");
    JPanel month = new JPanel();    
    
    btnAddNote = new JButton("Add note");
    month.add(btnAddNote);
    
    btnAddEvent = new JButton("Add event");
    month.add(btnAddEvent);
    month.add(btnPrev);
    month.add(new JLabel(StringMnth));
    month.add(btnNext);
    borderPanel.add(month, BorderLayout.NORTH);
    month.setBackground((new Color(199, 21, 133)));
=======
	tabel.setBackground(Color.PINK); */
	
	
	
	
	/**
	 * 
	 */
	/*
	
	
	public CalendarDay () {
		setSize(Screen.WIDTH,Screen.HEIGHT);
		setLayout(new BorderLayout());
		setBackground(new Color(199, 21, 133));
	
		
		lblDayView = new JLabel("Day view");
		lblDayView.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDayView, BorderLayout.NORTH);
		
		
		eventPanel = new JPanel();
		add(eventPanel, BorderLayout.CENTER);
		eventPanel.setLayout(new BorderLayout(0, 0));
		setBackground(new Color(199, 21, 133));
	
		
		notePanel = new JPanel();
		notePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(199, 21, 133), SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight));
//		panel.setBorder(new EmptyBorder(30, 30, 30, 30));
		notePanel.setMaximumSize(new Dimension(1000, 100));
		notePanel.setPreferredSize(new Dimension(300, 100));
		notePanel.setMinimumSize(new Dimension(1, 100));
		notePanel.setVisible(false);
		eventPanel.add(notePanel, BorderLayout.EAST);
		setBackground(new Color(199, 21, 133));
		
		
		noteTxt = new JTextArea("");
		noteTxt.setBackground(SystemColor.control);
		noteTxt.setEditable(false);
		noteTxt.setWrapStyleWord(true);
	    noteTxt.setLineWrap(true);
	    noteTxt.setVisible(false);
		notePanel.add(noteTxt);
		
		
		bottomPanel = new JPanel();
		add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		setBackground(new Color(199, 21, 133));
		
		
		activePanel = new JPanel();
		bottomPanel.add(activePanel, BorderLayout.SOUTH);
		setBackground(new Color(199, 21, 133));
		
		
		btnCreate = new JButton("Add event");
		btnCreate.setActionCommand(CREATEEVE);
		activePanel.add(btnCreate);
		
		btnDelete = new JButton("Delete event");
		btnDelete.setActionCommand(DELETEEVE);
		activePanel.add(btnDelete);
		
		btnBack = new JButton("Week View");
		btnBack.setActionCommand(WEEK);
		activePanel.add(btnBack);
		
		btnNote = new JButton("View note");
		btnNote.setActionCommand(NOTE);
		activePanel.add(btnNote);
		
		infoPanel = new JPanel();
		bottomPanel.add(infoPanel, BorderLayout.NORTH);
		infoPanel.setLayout(new GridLayout(0, 4, 0, 0));
		setBackground(new Color(199, 21, 133));
		
		
		forecastTxt = new JTextArea("");
		forecastTxt.setEditable(false);
		forecastTxt.setWrapStyleWord(true);
		forecastTxt.setLineWrap(true);
		forecastTxt.setBackground(SystemColor.control);
		infoPanel.add(forecastTxt);
		
		btnSet = new JButton("Add note");
		infoPanel.add(btnSet);
		btnSet.setVisible(false);
		btnSet.setActionCommand(SET);
		
		btnDelNote = new JButton("Delete Note");
		btnDelNote.setVisible(false);
		btnDelNote.setActionCommand(DELNOTE);
		infoPanel.add(btnDelNote);
		
	
		
	}
>>>>>>> Stashed changes

	

<<<<<<< Updated upstream
    // Current Date
    JPanel year = new JPanel();
    year.setBackground((new Color(199, 21, 133)));
    
    btnViewWeek = new JButton("View week");
    year.add(btnViewWeek);
    
    btnBackToMenu = new JButton("Back to menu");
    year.add(btnBackToMenu);
    ;
    
    year.add(btnBackToMenu);
    borderPanel.add(year, BorderLayout.SOUTH);

    // South Panel - Current Year
    JPanel today = new JPanel();
    today.add(new JLabel("Today's date is:"  )); // her skal dagen sættes ind
    borderPanel.add(today, BorderLayout.WEST);
    today.setBackground((new Color(199, 21, 133)));

}
public void addActionListener(ActionListener X) {
	btnNext.addActionListener(X);
	btnPrev.addActionListener(X);
	btnAddNote.addActionListener(X);
	btnAddEvent.addActionListener(X);
	btnBackToMenu.addActionListener(X);
	btnViewWeek.addActionListener(X);

	
	
}
/*
public void customPrint (long inputToPrint){
	SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
	Date now = new Date(inputToPrint);
	String strDate = sdfDate.format(now);
	System.out.println("[" + strDate + "]" + inputToPrint);
	*/
=======
	public void updateEvents(Object[][] data,String[] header) {
		
		if(eventTable != null){
			eventPanel.remove(eventTable);
			eventPanel.remove(eventScroll);
		}
		eventTable = new JTable(data,header);
		eventTable.setPreferredScrollableViewportSize(new Dimension(800,70));
		eventTable.setFillsViewportHeight(true);
		
		eventScroll = new JScrollPane(eventTable);
		eventScroll.setBounds(26,30,930,280);
		eventPanel.add(eventScroll);
		
	}
	
	public void removeTable() {
		eventPanel.remove(eventTable);
		eventPanel.remove(eventScroll);
	}
	
	public JLabel getLblDayView() {
		return lblDayView;
	}

	public void setLblDayView(JLabel lblDayView) {
		this.lblDayView = lblDayView;
	}

	public JPanel getEventPanel() {
		return eventPanel;
	}

	public void setEventPanel(JPanel eventPanel) {
		this.eventPanel = eventPanel;
	}

	public JPanel getActivePanel() {
		return activePanel;
	}
	public JTextArea getForecastTxt() {
		return forecastTxt;
	}
>>>>>>> Stashed changes

	public void setForecastTxt(JTextArea forecastTxt) {
		this.forecastTxt = forecastTxt;
	}

<<<<<<< Updated upstream


public static JButton getBtnNext() {
	return btnNext;
}




public static void setBtnNext(JButton btnNext) {
	CalendarDay.btnNext = btnNext;
}




public static JButton getBtnPrev() {
	return btnPrev;
}




public static void setBtnPrev(JButton btnPrev) {
	CalendarDay.btnPrev = btnPrev;
}




public static int getCurrYear() {
	return currYear;
}




public static void setCurrYear(int currYear) {
	CalendarDay.currYear = currYear;
}




public static int getCurrDOM() {
	return currDOM;
}




public static void setCurrDOM(int currDOM) {
	CalendarDay.currDOM = currDOM;
}




public static int getCurrentMonth() {
	return currentMonth;
}




public static void setCurrentMonth(int currentMonth) {
	CalendarDay.currentMonth = currentMonth;
}




public JTable getTabel() {
	return tabel;
}




public void setTabel(JTable tabel) {
	this.tabel = tabel;
}




public JButton getBtnAddNote() {
	return btnAddNote;
}




public void setBtnAddNote(JButton btnAddNote) {
	this.btnAddNote = btnAddNote;
}




public JButton getBtnAddEvent() {
	return btnAddEvent;
}




public void setBtnAddEvent(JButton btnAddEvent) {
	this.btnAddEvent = btnAddEvent;
}




public JButton getBtnBackToMenu() {
	return btnBackToMenu;
}




public void setBtnBackToMenu(JButton btnBackToMenu) {
	this.btnBackToMenu = btnBackToMenu;
}




public JButton getBtnViewWeek() {
	return btnViewWeek;
}




public void setBtnViewWeek(JButton btnViewWeek) {
	this.btnViewWeek = btnViewWeek;
}




public static long getSerialversionuid() {
	return serialVersionUID;
}


/* public void customPrint(String inputToPrint){
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date now = new Date();
    String strDate = sdfDate.format(now);
    System.out.println("[" + strDate + "] " + inputToPrint);
=======
	public void setActivePanel(JPanel activePanel) {
		this.activePanel = activePanel;
	}

	public JTextArea getNoteLbl() {
		return noteTxt;
	}

	public void setNoteTxt(JTextArea noteTxt) {
		this.noteTxt = noteTxt;
	}

	public JButton getBtnSet() {
		return btnSet;
	}

	public void setBtnSet(JButton btnSet) {
		this.btnSet = btnSet;
	}

	



	public JPanel getNotePanel() {
		return notePanel;
	}



	public void setNotePanel(JPanel notePanel) {
		this.notePanel = notePanel;
	}



	public JButton getBtnDelNote() {
		return btnDelNote;
	}



	public void setBtnDelNote(JButton btnDelNote) {
		this.btnDelNote = btnDelNote;
	}
*/
}
>>>>>>> Stashed changes
}
    */


