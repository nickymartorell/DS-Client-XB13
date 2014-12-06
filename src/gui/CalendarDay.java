import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

import java.awt.SystemColor;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.multi.MultiLabelUI;

import java.awt.Color;

public class CalendarDay extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public static final String WEEK = "week";
	public static final String NOTE = "note";
	public static final String SET = "set";
	public static final String CREATEEVE = "createeve";
	public static final String DELETEEVE = "deleteeve";
	public static final String DELNOTE = "delnote";
	
	private JLabel lblDayView;
//	private JScrollPane eventScroll;
	private JButton btnCreate;
	private JButton btnDelete;
	private JButton btnBack;
	private JButton btnNote;
	private JButton btnnewNote;
	private JButton btnDelNote;
	//private JTextArea forecastTxt;
	//private JTextArea noteTxt;;
	
	public CalendarDay(){
		
		setBackground(new Color(199, 21, 133));
		setLayout(null);
		
		lblDayView = new JLabel("Hello, here's your calendar!");
		lblDayView.setBounds(48, 23, 354, 25);
		lblDayView.setForeground(new Color(255, 192, 203));
		lblDayView.setFont(new Font("Tahoma", Font.BOLD, 25));
		add(lblDayView);
		
		btnBack = new JButton ("Back to menu");
		btnBack.setBounds(149, 229, 152, 29);
		btnBack.setForeground(new Color(255, 192, 203));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnBack);
		
		btnCreate = new JButton("Create new event");
		btnCreate.setForeground(new Color(255, 192, 203));
		btnCreate.setBounds(149, 206, 152, 29);
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnCreate);
		
		btnDelete = new JButton("Delete event");
		btnDelete.setForeground(new Color(255, 192, 203));
		btnDelete.setBounds(252, 176, 106, 29);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnDelete);
		
		btnNote = new JButton("View note");
		btnNote.setForeground(new Color(255, 192, 203));
		btnNote.setBounds(252, 146, 106, 29);
		btnNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnNote);
		
		btnnewNote = new JButton("Create new note");
		btnnewNote.setForeground(new Color(255, 192, 203));
		btnnewNote.setBounds(252, 124, 106, 29);
		btnnewNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnnewNote);
		
		btnDelNote = new JButton("Delete note");
		btnDelNote.setForeground(new Color(255, 192, 203));
		btnDelNote.setBounds(222, 72, 136, 29);
		btnDelNote.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnDelNote);
	}
}