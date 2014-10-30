package logic;

import shared.*;
import shared.ServerConnection;

public class Calender {
//hej
	public static void main (String[]args){
		loginObj hehe = new loginObj();
		
		
		String tester = "mor";
		String TEST = hehe.getUser();
		
		String TEST2 = hehe.setUser(tester);
		System.out.println(TEST);
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
