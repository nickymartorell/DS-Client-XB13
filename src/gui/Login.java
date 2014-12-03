package gui;



//import af komponenter til at bygge vinduer

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import logic.ActionController;

import java.awt.event.ActionEvent;



public class Login extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	//der oprettes instansvariable til de forskellige elementer, fx knapper, tekstfelter og overskrifter
	
	private JLabel lblWelcome;
	private JLabel lblLogInHere;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblWrongPass;
	private JButton btnLogIn;
	private JPasswordField enterPassword;
	private JTextField enterUsername;
	
	//her bliver udseende tilfoejet til de forskellige variable, bliver gjort via konstruktorer
	
	public Login (){
		setForeground(new Color(0, 0, 255));
		setBackground(new Color(199, 21, 133)); //staerk pink farve
		setLayout(null);
		
		lblWelcome = new JLabel("Welcome to CBS calendar");
		lblWelcome.setForeground(new Color(255, 192, 203)); // baby lyseroedfarve
		lblWelcome.setBounds(86, 23, 277, 29);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		add(lblWelcome);
		
		lblLogInHere = new JLabel ("Please log in here");
		lblLogInHere.setForeground(new Color(255, 192, 203));
		lblLogInHere.setBounds(151, 64, 148, 29);
		lblLogInHere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblLogInHere);
		
		lblUsername = new JLabel("Enter username here:");
		lblUsername.setForeground(new Color(255, 192, 203));
		lblUsername.setBounds(158, 113, 133, 14);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsername);
		
		lblPassword = new JLabel("Enter your password here:");
		lblPassword.setForeground(new Color(255, 192, 203));
		lblPassword.setBounds(142, 180, 165, 23);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblPassword);
		
		lblWrongPass = new JLabel("You have entered a wrong password or username. Please try again");
		lblWrongPass.setBounds(75, 315, 165, 14);
		lblWrongPass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWrongPass.setForeground(Color.PINK);
		lblWrongPass.setVisible(false);
		add(lblWrongPass);
	
		
		enterPassword = new JPasswordField("");
		enterPassword.setBackground(new Color(255, 240, 245));
		enterPassword.setBounds(151, 204, 148, 29);
		add(enterPassword);
		
		enterUsername = new JTextField();
		enterUsername.setBackground(new Color(255, 240, 245));
		enterUsername.setBounds(151, 139, 148, 29);
		add(enterUsername);
		
		btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setForeground(new Color(255, 192, 203));
		btnLogIn.setBounds(180, 238, 83, 29);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogIn.setBackground(new Color(255, 0, 255));
		add(btnLogIn);
	
}
	
	public Login(ActionController actionController) {
		// TODO Auto-generated constructor stub
	}

	//der skal tilføjes actionlisteners for at der sker noget ved tryk paa knapper
	public void addActionListener (ActionListener l){
		btnLogIn.addActionListener(l);
		btnLogIn.setActionCommand("LogInBtn");
	}
	
	//textfield skal nulstilles efter brug
	public void emptyTextfield(){
		enterPassword.setText("");
		
	}
	
	//viser, hvis password er forkert
	public void WrongPass(){
		lblWrongPass.setVisible(true);
	}
	
	//faar fat paa username naar brugeren har indtastet username
	public String getenterUsername(){
		return enterUsername.getText();
	}
	
	//get password
	public char[]  getenterPassword(){
		return enterPassword.getPassword();
	}
	
	
	//getters and setters 
	public JLabel getLblWelcome() {
		return lblWelcome;
	}

	public void setLblWelcome(JLabel lblWelcome) {
		this.lblWelcome = lblWelcome;
	}

	public JLabel getLblLogInHere() {
		return lblLogInHere;
	}

	public void setLblLogInHere(JLabel lblLogInHere) {
		this.lblLogInHere = lblLogInHere;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}

	public JLabel getLblPassword() {
		return lblPassword;
	}

	public void setLblPassword(JLabel lblPassword) {
		this.lblPassword = lblPassword;
	}

	public JLabel getLblWrongPass() {
		return lblWrongPass;
	}

	public void setLblWrongPass(JLabel lblWrongPass) {
		this.lblWrongPass = lblWrongPass;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public void setBtnLogIn(JButton btnLogIn) {
		this.btnLogIn = btnLogIn;
	}

	public JPasswordField getEnterPassword() {
		return enterPassword;
	}

	public void setEnterPassword(JPasswordField enterPassword) {
		this.enterPassword = enterPassword;
	}

	public JTextField getEnterUsername() {
		return enterUsername;
	}

	public void setEnterUsername(JTextField enterUsername) {
		this.enterUsername = enterUsername;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	


}
