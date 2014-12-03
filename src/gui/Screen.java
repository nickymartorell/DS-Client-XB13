package gui;
// her samles det hele 

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Logic.ActionController;

import java.awt.CardLayout;

public class Screen extends JFrame {
	private static final long serialVersionUID = 1L;
	
	
	//nedenfor kaldes de tilsvarende paneler, derfor gives de numre
	
	public static final String LOGIN = "login";
	public static final String WEATHER = "weatherforecast";
	public static final String MAINMENU = "mainmenu";
	public static final String CALENDARDAY = "calendarDay";
	public static final String CALENDARMONTH = "calendarMonth";
	public static final String CALENDARWEEK ="CalendarWeek";
	

	
	private ActionController actionController;
	private JPanel contentPane;
	private Login Login;
	private MainMenu mainMenu;
	private Weather weather;
	private JPanel panel;
	private static CardLayout cl;
	private CalendarDay calendarDay;
	private CalendarMonth calendarMonth;
	private CalendarWeek calendarWeek;
	

	public Screen(){
		setTitle("Calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//dette lukker programmet, naar brugeren lukker vinduet ned
		setBounds(100, 100, 460, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		cl = (CardLayout) getContentPane().getLayout();
		
		actionController = new ActionController(this);
		setSize(WIDTH, HEIGHT);
		
		calendarDay = new CalendarDay(actionController);
		calendarWeek = new CalendarWeek(actionController);
		calendarMonth = new CalendarMonth(actionController);
		Login = new Login(actionController);
		mainMenu = new MainMenu(actionController);
		
		
		
		
		
		

		
	/*	calendarWeek = new CalendarWeek(actionController);
		login = new Login(actionController);
		calendarDay = new CalendarDay(actionController);
		
	
		contentPane.add(login, LOGIN);
		contentPane.add(calendarWeek, CALENDARWEEK);
		contentPane.add(calendarDay, CALENDARDAY);
		*/
		
		
		
	Login = new Login();
	contentPane.add(Login, LOGIN);
	
	mainMenu = new MainMenu();
	contentPane.add(mainMenu, MAINMENU);
	
	weather = new Weather();
	contentPane.add(weather, WEATHER);
	
	cl = (CardLayout) getContentPane().getLayout();
	}
	
	
	//nedenfor findes den metode som skal koere for at der kan skiftes mellem de forskellige sider i cardlayout
	
	public static void show(String card){
		cl.show(getContentPane(), card);
	}


	public Login getLogin() {
		return Login;
	}


	public void setLogin(Login login) {
		Login = login;
	}


	public MainMenu getMainMenu() {
		return mainMenu;
	}


	public Weather getWeather() {
		return weather;
	}


	public CalendarDay getCalendarDay() {
		return calendarDay;
	}


	public CalendarMonth getCalendarMonth() {
		return calendarMonth;
	}


	public CalendarWeek getCalendarWeek() {
		return calendarWeek;
	}
	
	
	
	
	
	


	}
	
	

