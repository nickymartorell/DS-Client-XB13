package logic;


import shared.ServerConnection;
import gui.Screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.IOException;
import java.net.UnknownHostException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import JsonClasses.*;
@SuppressWarnings("unused")
	
	
public class ActionController  {
			private Screen screen;
			private boolean u;
			private boolean full = false;
			private Gson gson;
			private ServerConnection sc;
			private String email;
			private String password; 
			;
			
			
			
			public ActionController(){
				screen = new Screen();
				sc = new ServerConnection();
				gson = new GsonBuilder().create();
				
				
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
					if (e.getSource() == screen.getLogin().getBtnLogIn()){
						String username = null;
						String password = null;
						
						username = screen.getLogin().getEnterUsername().getText();
						password = screen.getLogin().getEnterPassword().getText();
						System.out.println(username);
						System.out.println(password);
						String ret = userLogin(username,password);
						if(ret.equals("1")){
							screen.show(Screen.MAINMENU);
						}
						else 
						{
							System.out.println("Please type correct");
						}
					}


			}
				public String userLogin (String username, String password)
				{
					String userExists ="";
					AuthUser AU = new AuthUser();
					AU.setAuthUserEmail(username);
					AU.setAuthUserPassword(password);
					String gsonString = gson.toJson(AU);
					try {
						userExists = sc.sendMessage(gsonString);
					} catch (Exception e) {
						e.printStackTrace();
					}
					return userExists;
				}
			}

			
			private class MainMenuActionListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == screen.getMainMenu().getQOTD()){
				}
			
			
					String quote = null;
					String author = null;
					String topic = null;
					
					Quote GQ = new Quote();
//					GQ.setQuote(quote);
					String gsonString = gson.toJson(GQ);
					try {
						gsonString = sc.sendMessage(gsonString);
						GQ = (Quote)gson.fromJson(gsonString, Quote.class);
						
						quote = GQ.getQuote();
//						author = GQ.getAuthor();
//						topic = sc.sendMessage(gsonString);
					}
					catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					/**
					finally {
						System.out.println(quote);
						System.out.println(author);
						System.out.println(topic);
						}
						*/

				}
			}
}
				
			/**
				
				if (e.getSource() == screen.getMainMenu().getViewCalendar()){
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
			*/

			
			


			



/**			
private class WeatherActionListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Screen.getWeather().getBtnMenu()){
					Screen.show(Screen.MAINMENU);
				}
			}
			*/
			

		


