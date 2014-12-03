package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Screen;


public class ClientAS {
	
	
	
	
	private class WeatherActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();

			if(cmd.equals("MenuBtn")) {
				Screen.show(Screen.MAINMENU);
	

}
		}
		
