package mediator;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import command.AccessCommand;
import command.IscrizioneCommand;


public class AccediMediator implements Mediator {
	
	//Frame in caso di errore
	private JFrame frameError = new JFrame();
	
	//JButtons
	private JButton subscribe;
	private JButton access;
	
	//JTextFields
	private JTextField name, surname, email, password;

	//Errori
	private String[] errors = {"Campo nome vuoto","Campo cognome vuoto","Campo email vuoto","Campo password vuoto","Campo email non valido"};

	
	public void setBottoneAccedi(JButton access) {
		this.access = access;

	}
	
	public void setBottoneIscriviti(JButton subscribe) {
		this.subscribe = subscribe;

	}
	
	public void setDatiAccesso(JTextField email, JPasswordField password) {
		this.email = email;
		this.password = password;
	}
	
	public void setDatiIscrizione(JTextField name, JTextField surname, JTextField email, JPasswordField password) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}

	@Override
	public void notify(JComponent component) {		
		if(component == subscribe) {
			int error = controllaCorrettezza();
			if (error == 0) {
				IscrizioneCommand subscribe = new IscrizioneCommand();
				subscribe.setDati(name.getText(), surname.getText(), email.getText(), password.getText());
				subscribe.actionPerformed(null);
			}
			else {
				displayErrors(error);
			}
		}
		if(component == access) {
			int error = controllaCorrettezzaAccess();
			if (error == 0) {
				AccessCommand accessCommand = new AccessCommand();
				accessCommand.setDati(email.getText(), password.getText());
				accessCommand.actionPerformed(null);
			}
			else {
				displayErrors(error);
			}
		}
	}
	

	private int controllaCorrettezza() {
		int error = 0;
		
		if(name.getText().length() == 0) {
			error = 1;
		}
		else if(surname.getText().length() == 0) {
			error = 2;
		}
		else if(email.getText().length() == 0) {
			error = 3;
		}
		else if(password.getText().length() == 0) {
			error = 4;
		}
		else if (!checkEmailValidator(email.getText())) {
			error = 5;
		}
		
		return error;
	}

	private int controllaCorrettezzaAccess() {
		int error = 0;
		
		if(email.getText().length() == 0) {
			error = 3;
		}
		else if(password.getText().length() == 0) {
			error = 4;
		}
		else if (!checkEmailValidator(email.getText())) {
			error = 5;
		}
		
		return error;
	}
	
	private boolean checkEmailValidator(String input) {
	    String emailPattern = "^\\s*(.+)@(.+)\\.(.+)\\s*$";
	    return input.matches(emailPattern); 
	}
	
	private void displayErrors(int error) {
		frameError = new JFrame("Errore");
		frameError.setVisible(true);
		frameError.setLocationRelativeTo(null);
		frameError.setSize(new Dimension(400,50));
		frameError.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel message = new JLabel(errors[error-1]);
		
		frameError.add(message);
	}
}
