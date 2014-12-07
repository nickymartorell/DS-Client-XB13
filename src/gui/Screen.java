package gui;
// her samles det hele 


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;


public class Screen extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final String LOGIN = "LOGIN";
	public static final String MAINMENU = "MAINMENU";
	public static final String CALENDARDAY = "CALENDARDAY";
	public static final String WEATHER = "WEATHER";
	public static final String CALENDARWEEK = "CALENDARWEEK";
	
	
	
	
	private JPanel contentPane;
	public Login login;
	private MainMenu mainMenu;
	private CalendarDay calendarDay;
	private Weather weather;
	private CalendarWeek calendarWeek;
	
	
	CardLayout c;
	
	public Screen(){
		setTitle("CBS Calendar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		login = new Login();
		contentPane.add(login, LOGIN);
		
		mainMenu = new MainMenu();
		contentPane.add(mainMenu, MAINMENU);
		
		calendarDay = new CalendarDay();
		contentPane.add(calendarDay, CALENDARDAY);
		
		weather = new Weather();
		contentPane.add(weather, WEATHER);
		
		calendarWeek = new CalendarWeek();
		contentPane.add(calendarWeek, CALENDARWEEK);
		
		
		
		c = (CardLayout) getContentPane().getLayout();

		
	}
	
	public Login getLogin(){
		return login;
	}
	public MainMenu getMainMenu() {
	return mainMenu;
	}

	public void show(String card) {
		c.show(getContentPane(),  card);
	}
	public CalendarDay getCalendarDay(){
		return calendarDay;
	}
	public Weather getWeather() {
	return weather;
	}
	public CalendarWeek getCalendarWeek() {
	return calendarWeek;
	}

}
