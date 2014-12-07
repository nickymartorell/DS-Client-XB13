package gui;


import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

import logic.ActionController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;


public class CalendarWeek extends JPanel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean DEBUG = false;
	private JLabel lblWelcome;
	private JButton viewCalendar;
	private JButton weather;
	private JButton btnCalendarWeekView;
	private JButton btnMainMenu;
	public static JFrame frame;
	public String urObjctInCell;


	

	public CalendarWeek(){
		
	setBackground(Color.MAGENTA);
		setLayout(null);
		
	lblWelcome = new JLabel("Week view");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(268, 23, 177, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("AddNote");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(495, 105, 130, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);
	
	weather = new JButton("Delete event");
	weather.setForeground(new Color(0, 0, 0));
	weather.setBackground(new Color(255, 240, 245));
	weather.setBounds(495, 225, 130, 29);
	weather.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(weather);
	
	

	btnCalendarWeekView = new JButton("Delete Note");
	btnCalendarWeekView.setForeground(Color.BLACK);
	btnCalendarWeekView.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnCalendarWeekView.setBackground(new Color(255, 240, 245));
	btnCalendarWeekView.setBounds(495, 185, 130, 29);
	add(btnCalendarWeekView);
	
	btnMainMenu = new JButton("Main menu");
	btnMainMenu.setForeground(Color.BLACK);
	btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnMainMenu.setBackground(new Color(255, 240, 245));
	btnMainMenu.setBounds(495, 265, 130, 29);
	add(btnMainMenu);
	String[] columnNames = {"Type", "description", "Location", "Start", "End"};

	Object[][] data = new Object[300][300];

	final JTable table = new JTable(data, columnNames);
	table.setSurrendersFocusOnKeystroke(true);
	table.setPreferredScrollableViewportSize(new Dimension(100, 100));
	table.setFillsViewportHeight(true);
	table.setRowSelectionAllowed(true);
	table.addMouseListener(new MouseAdapter() {
	public void mouseClicked(final MouseEvent e) {
		final JTable target = (JTable)e.getSource();
	    int row = target.getSelectedRow();
	    //column sat til 0 for altid at bruge id
	     urObjctInCell = (String)target.getValueAt(row, 0);
	     System.out.println(urObjctInCell);                         
	}
	}); 
	
	if (DEBUG) {
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                printDebugData(table);
            }
        });
    }
	

	JScrollPane scrollPane = new JScrollPane(table);
	scrollPane.setBorder(new CompoundBorder(new BevelBorder(
			BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255,
					255), new Color(0, 0, 205), new Color(255, 255, 255)),
			new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
	scrollPane.setViewportBorder(new CompoundBorder(new BevelBorder(
			BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255,
					255), new Color(0, 0, 205), new Color(255, 255, 255)),
			null));
	scrollPane.setBounds(10, 94, 474, 259);

	// Add the scroll pane to this panel.
	add(scrollPane);
	
	JButton btnShowNote = new JButton("Show Note");
	btnShowNote.setForeground(Color.BLACK);
	btnShowNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnShowNote.setBackground(new Color(255, 240, 245));
	btnShowNote.setBounds(495, 145, 130, 29);
	add(btnShowNote);
	
	JButton btnNextWeek = new JButton("Next week");
	btnNextWeek.setForeground(Color.BLACK);
	btnNextWeek.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnNextWeek.setBackground(new Color(255, 240, 245));
	btnNextWeek.setBounds(315, 364, 130, 29);
	add(btnNextWeek);
	
	JButton btnPreviusWeek = new JButton("Previous week");
	btnPreviusWeek.setForeground(Color.BLACK);
	btnPreviusWeek.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnPreviusWeek.setBackground(new Color(255, 240, 245));
	btnPreviusWeek.setBounds(82, 364, 130, 29);
	add(btnPreviusWeek);
	}
	

	private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
	public JButton getViewCalendar() {
		return viewCalendar;
	}
	public void setViewCalendar(JButton viewCalendar) {
		this.viewCalendar = viewCalendar;
	}
	public JButton getWeather() {
		return weather;
	}
	public void setWeather(JButton weather) {
		this.weather = weather;
	}
	public JButton getBtnCalendarWeekView() {
		return btnCalendarWeekView;
	}
	public void setBtnCalendarWeekView(JButton btnCalendarWeekView) {
		this.btnCalendarWeekView = btnCalendarWeekView;
	}
	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}
	public void setBtnMainMenu(JButton btnMainMenu) {
		this.btnMainMenu = btnMainMenu;
	}
}
	