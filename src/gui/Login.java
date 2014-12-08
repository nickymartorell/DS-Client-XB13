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
		setBackground(SystemColor.textHighlightText); //staerk pink farve
		setLayout(null);

		
		lblWelcome = new JLabel("Welcome to QMPE");
		lblWelcome.setForeground(SystemColor.textHighlight); // baby lyseroedfarve
		lblWelcome.setBounds(259, 21, 277, 29);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));

		add(lblWelcome);
		
		lblLogInHere = new JLabel ("Login");
		lblLogInHere.setForeground(SystemColor.textHighlight);
		lblLogInHere.setBounds(285, 137, 148, 29);
		lblLogInHere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblLogInHere);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setForeground(SystemColor.textHighlight);
		lblUsername.setBounds(285, 177, 133, 14);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(SystemColor.textHighlight);
		lblPassword.setBounds(281, 242, 165, 23);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblPassword);
	
		
		enterPassword = new JPasswordField("");
		enterPassword.setBackground(SystemColor.menu);
		enterPassword.setBounds(285, 276, 148, 29);
		add(enterPassword);
		
		enterUsername = new JTextField();
		enterUsername.setBackground(SystemColor.menu);
		enterUsername.setBounds(285, 202, 148, 29);
		add(enterUsername);
		
		btnLogIn = new JButton("Login");
	
		btnLogIn.setForeground(SystemColor.textHighlight);
		btnLogIn.setBounds(315, 316, 83, 29);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogIn.setBackground(SystemColor.menu);
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
