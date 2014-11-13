package logic;

import shared.*;
import shared.ServerConnection;

public class Calender {
	public static void main (String[]args){
		loginObj hehe = new loginObj();
		
		
		String tester = "mor";
		String TEST = hehe.getUser();
		
		hehe.setUser(tester);
		
		System.out.println(TEST);
		
		String TEST2 = hehe.getUser();
		System.out.println(TEST2);
	}
	
public Calender() {
	// TODO Auto-generated constructor stub
}


	
	
	public CalendarObject NEJ () {
		calOb = new CalendarObject();
		calOb = ServerConnection.getCalendarObject();
		return calOb;
	}
}
