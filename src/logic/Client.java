package logic;
import gui.Screen;
import logic.ActionController;



public class Client {
	public Screen screen;
	public ActionController ac;
	
	public static void main (String[]args) throws Exception {
	
		ActionController ac = new ActionController();
		ac.run();
		
		
	}
}
