package logic;

import shared.*;
import shared.ServerConnection;

<<<<<<< HEAD:src/logic/Calendar.java
public class Calendar {
//hej
=======
public class Calender {
>>>>>>> FETCH_HEAD:src/logic/Calender.java
	public static void main (String[]args){
		loginObj hehe = new loginObj();
		
		
		String tester = "mor";
		String TEST = hehe.getUser();
		
		hehe.setUser(tester);
		
		System.out.println(TEST);
		
		String TEST2 = hehe.getUser();
		System.out.println(TEST2);
	}
	
public Calendar() {
	// TODO Auto-generated constructor stub
}


	
	
	public CalendarObject NEJ () {
		calOb = new CalendarObject();
		calOb = ServerConnection.getCalendarObject();
		return calOb;
	}
}
