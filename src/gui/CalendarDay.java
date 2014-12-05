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
import javax.swing.JTable;


public class CalendarDay extends JFrame {

static JButton btnNext, btnPrev;
static int currYear, currDOM, currentMonth;
private JTable tabel;

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
    
   	JTable tabel = new JTable(data, columnNames);		
   	tabel.setRowHeight(20);
   	tabel.setBounds(0, 6, 313, 494);
   	tabel.setFillsViewportHeight(true);
   	tabel.setColumnSelectionAllowed(true);
   	tabel.setCellSelectionEnabled(true);
    tabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
	tabel.setSurrendersFocusOnKeystroke(true);
	tabel.setShowGrid(true);
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
    
    JButton btnAddNote = new JButton("Add note");
    month.add(btnAddNote);
    
    JButton btnAddEvent = new JButton("Add event");
    month.add(btnAddEvent);
    month.add(btnPrev);
    month.add(new JLabel(StringMnth));
    month.add(btnNext);
    borderPanel.add(month, BorderLayout.NORTH);
    month.setBackground((new Color(199, 21, 133)));

    

    // Current Date
    JPanel year = new JPanel();
    year.setBackground((new Color(199, 21, 133)));
    
    JButton btnViewWeek = new JButton("View week");
    year.add(btnViewWeek);
    
    JButton btnBackToMenu = new JButton("Back to menu");
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
/*
public void customPrint (long inputToPrint){
	SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
	Date now = new Date(inputToPrint);
	String strDate = sdfDate.format(now);
	System.out.println("[" + strDate + "]" + inputToPrint);
	*/


/* public void customPrint(String inputToPrint){
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date now = new Date();
    String strDate = sdfDate.format(now);
    System.out.println("[" + strDate + "] " + inputToPrint);
}
    */

public static void main(String[] args) {
    new CalendarDay();
}
}