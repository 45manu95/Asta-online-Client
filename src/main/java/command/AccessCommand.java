package command;

import java.awt.FlowLayout;
import java.awt.Window;
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
import gui.FinestraLogin;
import singleton.ServerIstance;
import singleton.UserIstance;
import utils.Utils;

/**
 * DESIGN PATTERN COMMAND
 * Questa classe rappresenta nella struttura generale il ConcreteCommand, la quale
 * va ad implementare l'interfaccia che nella struttura generale si riferisce al
 * Command (ActionListener). L'invoker in questo caso risulta rappresentato 
 * dal Mediator corrispondente.
 */
public class AccessCommand implements ActionListener {

	private String email, password;
	
	private JFrame frameMessage;
	
	/**
	 * Riempimento dei dati per poi procedere con l'invio. La password nel database
	 * viene memorizzata criptata per questioni di sicurezza.
	 * @param email
	 * @param password
	 */
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
	
	/**
	 * Con il seguente metodo facciamo comparire un frame che visualizza il messaggio
	 * di risposta dal server. Per capire se risulta un messaggio di successo o no, il
	 * server manda sempre come prima parola "SUCCESSO" oppure "ERRORE". In base a
	 * questo si capisce se si deve proseguire oppure rimanere tornare indietro.
	 * @param message
	 */
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
	                chiudiFinestreAperte();
	                UserIstance.setDati(email, password);
	            }
	        });
		}
		else {
			button = new JButton("Torna indietro");
			button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                frameMessage.dispose();
	                chiudiFinestreAperte();
	                new FinestraLogin().setVisible(true);
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
	
	/**
	 * Chiudiamo tutti i frame che non sono necessari una volta che il server 
	 * risponde con un messaggio di "SUCCESSO"
	 */
	private void chiudiFinestreAperte() {
		Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame && window.isVisible()) {
                ((JFrame) window).dispose();
                break; // Uscita dal ciclo dopo aver chiuso il frame desiderato
            }
        }
	}

}
