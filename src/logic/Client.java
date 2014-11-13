package logic;
import shared.*;
import java.util.Scanner;


public class Client {
	public static void main (String[]args){
		
		Scanner input = new Scanner (System.in);
		UserAuth userObj = new UserAuth();
		ObjectTranslator objTrans = new ObjectTranslator();
		
		System.out.println("Client Running"); //hvis dette kommer frem, så kører programmet 
		boolean userAuthenticated = false;
		System.out.println("Hello dear user, please login");
		
		while(!userAuthenticated){
			System.out.println("User Email:");
			
			userObj.setAuthUserEmail(input.next());
			System.out.println("User password");
			userObj.setAuthUserPassword(input.next());
			
			objTrans.sendObject(userObj);
			userObj = objTrans.receiveUserAuth();
			
			userObj.setAuthenticated(true);
			
			if(userObj.isAuthenticated()==true){
				userAuthenticated = true;
				System.out.println("Welcome to the server");	
			}else{
				System.out.println("Something went wrong - try again");
			}
			
		}
	System.out.println("You've exited the loop");
	}
	

}
