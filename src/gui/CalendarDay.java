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


public class CalendarDay extends JPanel{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean DEBUG = false;
	private JLabel lblWelcome;
	private JButton viewCalendar;
	private JButton DeleteEvent;
	private JButton DeleteNote;
	private JButton btnMainMenu;
	public static JFrame frame;
	public String urObjctInCell;


	

	public CalendarDay(){
		
	setBackground(new Color(199, 21, 133));
		setLayout(null);
		
	lblWelcome = new JLabel("Day view");
	lblWelcome.setForeground(new Color(255, 192, 203));
	lblWelcome.setBounds(268, 23, 106, 25);
	lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(lblWelcome);
	
	viewCalendar = new JButton("AddNote");
	viewCalendar.setForeground(new Color(0, 0, 0));
	viewCalendar.setBackground(new Color(255, 240, 245));
	
	viewCalendar.setBounds(495, 68, 130, 29);
	viewCalendar.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(viewCalendar);
	
	DeleteEvent = new JButton("Delete event");
	DeleteEvent.setForeground(new Color(0, 0, 0));
	DeleteEvent.setBackground(new Color(255, 240, 245));
	DeleteEvent.setBounds(495, 148, 130, 29);
	DeleteEvent.setFont(new Font("Tahoma", Font.PLAIN, 14));
	add(DeleteEvent);
	
	

	DeleteNote = new JButton("Delete Note");
	DeleteNote.setForeground(Color.BLACK);
	DeleteNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
	DeleteNote.setBackground(new Color(255, 240, 245));
	DeleteNote.setBounds(495, 108, 130, 29);
	add(DeleteNote);
	
	btnMainMenu = new JButton("Main menu");
	btnMainMenu.setForeground(Color.BLACK);
	btnMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnMainMenu.setBackground(new Color(255, 240, 245));
	btnMainMenu.setBounds(495, 188, 130, 29);
	add(btnMainMenu);
	String[] columnNames = { "id","Type", "Location", "Start", "End", "description", "aktiv" };

	Object[][] data = new Object[300][300];

	final JTable table = new JTable(data, columnNames);
	table.setSurrendersFocusOnKeystroke(true);
	table.setPreferredScrollableViewportSize(new Dimension(500, 100));
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
	scrollPane.setBounds(10, 59, 474, 361);

	// Add the scroll pane to this panel.
	add(scrollPane);
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
	public void addActionListener(ActionListener l){
		viewCalendar.addActionListener(l);
		btnMainMenu.addActionListener(l);
		DeleteEvent.addActionListener(l);
		
	}
	public JButton getViewCalendar() {
		return viewCalendar;
	}
	public void setViewCalendar(JButton viewCalendar) {
		this.viewCalendar = viewCalendar;
	}
	public JButton getWeather() {
		return DeleteEvent;
	}
	public void setWeather(JButton weather) {
		this.DeleteEvent = weather;
	}
	public JButton getBtnCalendarWeekView() {
		return DeleteNote;
	}
	public void setBtnCalendarWeekView(JButton btnCalendarWeekView) {
		this.DeleteNote = btnCalendarWeekView;
	}
	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}
	public void setBtnMainMenu(JButton btnMainMenu) {
		this.btnMainMenu = btnMainMenu;
	}
	
}
	