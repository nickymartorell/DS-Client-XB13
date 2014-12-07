package logic;


import shared.ServerConnection;
import shared.getQOTD;
import gui.Screen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.UnknownHostException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@SuppressWarnings("unused")
	
	
public class ActionController  {
			private Screen screen;
			private boolean u;
			private boolean full = false;
			private getQOTD qOTD;
			private Gson gson;
			private ServerConnection serverConnection;

			
			
			public ActionController(){
				screen = new Screen();
				serverConnection = new ServerConnection();
				gson = new GsonBuilder().create();
				qOTD = new getQOTD();
				
				screen.getLogin().addActionListener(new LoginActionListener());
				screen.getMainMenu().addActionListener(new MainMenuActionListener());
				//screen.getWeather().addActionListener(new WeatherActionListener());
				
			}
		
			public void run(){
				screen.show(Screen.LOGIN);
				screen.setVisible(true);
			}
			
			private class LoginActionListener implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					screen.show(Screen.MAINMENU);
					String cmd = e.getActionCommand();
				}
			}
			private class MainMenuActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String cmd = e.getActionCommand();
				
				if(cmd.equals("btnQotd")){
					String gsonString = gson.toJson(qOTD);
					String qoute = null;
					try {
						qoute = serverConnection.getFromServer(gsonString);
						qOTD = gson.fromJson(qoute, getQOTD.class);
						screen.getMainMenu().setQuote(qOTD.getQuote());
					}
					catch (UnknownHostException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}

				}
				
				
				
				else if (e.getSource() == screen.getMainMenu().getViewCalendar()){
					screen.show(Screen.CALENDARDAY);
				}
				if (e.getSource() == screen.getMainMenu().getWeather()){
					screen.show(Screen.WEATHER);
			}
				if (e.getSource() == screen.getMainMenu().getLogOut()){
					screen.show(Screen.LOGIN);
			}
			}
			}
			

}

/**			
private class WeatherActionListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Screen.getWeather().getBtnMenu()){
					Screen.show(Screen.MAINMENU);
				}
			}
			*/
			

		


