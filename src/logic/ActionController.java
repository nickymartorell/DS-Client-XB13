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

	
			

}
