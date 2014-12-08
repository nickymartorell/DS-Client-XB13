package logic;


import gui.Screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;

import shared.ServerConnection;
import JsonClasses.AuthUser;
import JsonClasses.Quote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@SuppressWarnings("unused")
	
	
public class ActionController  {
			private Screen screen;
			private boolean u;
			private boolean full = false;
			private ServerConnection sc;
			private String email;
			private String password; 
			private Gson gson;
			private Quote quote;
			private Quote author;
			

			
			
			
			
			public ActionController(){
				screen = new Screen();
				sc = new ServerConnection();
				gson = new GsonBuilder().create();	
				quote = new Quote();
				
				
				
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
					Gson gson = new GsonBuilder().create();	
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
				String cmd = e.getActionCommand();
				
				if(cmd.equals("Logout"))
				{
					screen.show(Screen.LOGIN);
				}

				else if(cmd.equals("QOTD"))
				{			
					
//					String currentQuote = "";
//					String stringToBeReturned ="";
					String gsonString = gson.toJson(quote);	
					
					String currentQuote = null;
					try
					{		
					currentQuote = sc.sendMessage(gsonString);
					quote = gson.fromJson(currentQuote, Quote.class);
					
				//	stringToBeReturned = "Quote: "+qotd.getQuote()+"Author: "+qotd.getAuthor()+"Topic: "+ qotd.getTopic()+".";
					screen.getMainMenu().setQuote(quote.getQuote());
			
					
					
				//	author = gson.fromJson(currentQuote, Quote.class);
				//	screen.getMainMenu().setAuthor(author.getAuthor());
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					try{
						currentQuote = sc.sendMessage(gsonString);
						author = gson.fromJson(currentQuote, Quote.class);
						screen.getMainMenu().setAuthor(author.getAuthor());
						
					}
					catch (Exception e1){
						e1.printStackTrace();
					}
						
					
				}
			}
			}

}


					
				
				
			
			

//public String getQuote()
//{	
//	
//	String currentQuote = "";
//	String stringToBeReturned ="";
//	Gson gson = new GsonBuilder().create();	
//	Quote quote = new Quote();
//	String gsonString = gson.toJson(quote);		
//	try
//	{		
//	currentQuote = sc.sendMessage(gsonString);
//	}catch(Exception e)
//	{
//		e.printStackTrace();
//	}
//	Quote qotd = gson.fromJson(currentQuote, Quote.class);
//	stringToBeReturned = "Quote: "+qotd.getQuote()+"Author: "+qotd.getAuthor()+"Topic: "+ qotd.getTopic()+".";		
//	return stringToBeReturned;	
//}



			
		/*	public class Model{
				private View view;
				public Model(View view){
					this.view = view;
				}
				public void changeText(){
					view.getlabelQuote().setText(Topic);
				}*/
			
			

				
	


