package command;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Utente;
import gui.FinestraHome;
import singleton.ServerIstance;
import utils.Utils;

public class AccessCommand implements ActionListener {

	private String email, password;
	
	private JFrame frameMessage;
	
	public void setDati(String email, String password) {
		this.email = email;
		this.password = Utils.crittografia(password);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		Utente user = Utente.newBuilder().setEmail(email).setPassword(password).build();
		
		MessaggioGenerico messagge = ServerIstance.getBlockingStub().accediUtente(user);

        displayMessage(messagge.getMessaggio());
	}
	
	private void displayMessage(String message) {
		frameMessage = new JFrame("Messaggio");
		frameMessage.setVisible(true);
		frameMessage.setLocationRelativeTo(null);
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel messageLabel = new JLabel(message);
		JButton button;
		
		String firstWord[] = message.split(" ", 2);
		
		if(firstWord[0].equals("SUCCESSO")) {
			button = new JButton("Avanti");
			button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new FinestraHome().setVisible(true);
                    frameMessage.dispose();
	            }
	        });
		}
		else {
			button = new JButton("Torna indietro");
			button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                frameMessage.dispose();
	            }
	        });
		}
		
		JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		textPanel.add(messageLabel);
		buttonPanel.add(button);
		
		
		panel.add(textPanel);
		panel.add(buttonPanel);

		frameMessage.add(panel);
		frameMessage.pack(); 
	}

}