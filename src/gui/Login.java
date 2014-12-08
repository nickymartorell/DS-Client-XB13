package gui;

//import af komponenter til at bygge vinduer
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;



public class Login extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	//der oprettes instansvariable til de forskellige elementer, fx knapper, tekstfelter og overskrifter
	public static void main(String[] args){
	
	}
	private final JLabel lblWelcome;
	private final JLabel lblLogInHere;
	private  final JLabel lblUsername;
	private final JLabel lblPassword;
	private final JButton btnLogIn;
	private final JPasswordField enterPassword;
	private final JTextField enterUsername;
	
	//her bliver udseende tilfoejet til de forskellige variable, bliver gjort via konstruktorer
	
	public Login (){
		setForeground(new Color(0, 0, 255));
		setBackground(new Color(199, 21, 133)); //staerk pink farve
		setLayout(null);

		
		lblWelcome = new JLabel("Welcome to CBS calendar");
		lblWelcome.setForeground(new Color(255, 192, 203)); // baby lyseroedfarve
		lblWelcome.setBounds(149, 51, 277, 29);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));

		add(lblWelcome);
		
		lblLogInHere = new JLabel ("Please log in here");
		lblLogInHere.setForeground(new Color(255, 192, 203));
		lblLogInHere.setBounds(207, 115, 148, 29);
		lblLogInHere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblLogInHere);
		
		lblUsername = new JLabel("Enter username here:");
		lblUsername.setForeground(new Color(255, 192, 203));
		lblUsername.setBounds(222, 177, 133, 14);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsername);
		
		lblPassword = new JLabel("Enter your password here:");
		lblPassword.setForeground(new Color(255, 192, 203));
		lblPassword.setBounds(204, 242, 165, 23);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblPassword);
	
		
		enterPassword = new JPasswordField("");
		enterPassword.setBackground(new Color(255, 240, 245));
		enterPassword.setBounds(207, 276, 148, 29);
		add(enterPassword);
		
		enterUsername = new JTextField();
		enterUsername.setBackground(new Color(255, 240, 245));
		enterUsername.setBounds(207, 202, 148, 29);
		add(enterUsername);
		
		btnLogIn = new JButton("Login");
	
		btnLogIn.setForeground(new Color(255, 192, 203));
		btnLogIn.setBounds(246, 316, 83, 29);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogIn.setBackground(new Color(255, 0, 255));
		add(btnLogIn);
	
}
	
	
	

	//der skal tilføjes actionlisteners for at der sker noget ved tryk paa knapper
	public void addActionListener (ActionListener l){
		btnLogIn.addActionListener(l);
	}
	
	//textfield skal nulstilles efter brug
	public void emptyTextfield(){
		enterPassword.setText("");
		
	}
	
	
	//faar fat paa username naar brugeren har indtastet username
	public String getenterUsername(){
		return enterUsername.getText();
	}
	
	//get password
	public String getenterPassword(){
		return enterPassword.getText();
	}
	
	
	//getters and setters 
	public JLabel getLblWelcome() {
		return lblWelcome;
	}

	

	public JLabel getLblLogInHere() {
		return lblLogInHere;
	}

	
	public JLabel getLblUsername() {
		return lblUsername;
	}



	public JLabel getLblPassword() {
		return lblPassword;
	}

	

	public JButton getBtnLogIn() {
		return btnLogIn;
	}


	public JPasswordField getEnterPassword() {
		return enterPassword;
	}

	public JTextField getEnterUsername() {
		return enterUsername;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	


}
