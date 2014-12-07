package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import gui.Screen;	
@SuppressWarnings("unused")
	
	
public class ActionController  {
			private Screen screen;
			private boolean u;
			private boolean full = false;
			
			
			public ActionController(){
				screen = new Screen();
				
				screen.getLogin().addActionListener(new LoginActionListener());
				screen.getMainMenu().addActionListener(new MainMenuActionListener());
				screen.getWeather().addActionListener(new WeatherActionListener());
				screen.getCalendarDay().addActionListener(new CalendarDayActionListener());
				
			}
		
			public void run(){
				screen.show(Screen.LOGIN);
				screen.setVisible(true);
			}
			
			private class LoginActionListener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					screen.show(Screen.MAINMENU);
				}
			}
			private class MainMenuActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == screen.getMainMenu().getViewCalendar()){
					screen.show(Screen.CALENDARDAY);
				}
				if (e.getSource() == screen.getMainMenu().getWeather()){
					screen.show(Screen.WEATHER);
			}
				if (e.getSource() == screen.getMainMenu().getLogOut()){
					screen.show(Screen.LOGIN);
			}
				if (e.getSource() == screen.getMainMenu().getBtnCalendarWeekView()){
					screen.show(Screen.CALENDARWEEK);
			}
			}
			}
			private class WeatherActionListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {
				if (e.getSource() == screen.getWeather().getBtnMenu()){
					screen.show(Screen.MAINMENU);
				}
			}
			}
			private class CalendarDayActionListener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == screen.getCalendarDay().getBtnMainMenu()){
						screen.show(Screen.MAINMENU);
					}
				}
				
			}
}
		


