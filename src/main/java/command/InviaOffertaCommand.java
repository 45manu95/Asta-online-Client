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

import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.ArticoloNotifica;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;
import astaOnlineProto.AstaOnLine.Utente;
import gui.FinestraHome;
import singleton.NewsMessage;
import singleton.*;

/**
 * DESIGN PATTERN COMMAND
 * Questa classe rappresenta nella struttura generale il ConcreteCommand, la quale
 * va ad implementare l'interfaccia che nella struttura generale si riferisce al
 * Command (ActionListener). L'invoker in questo caso risulta rappresentato 
 * dal Mediator corrispondente.
 */
public class InviaOffertaCommand implements ActionListener {

	private String offer;
	
	private int articolo_id;
	
	private Utente user;
	
	private JFrame frameMessage;
	
	public void setDati(String offer, int articolo_id) {
		this.offer = offer;
		this.articolo_id = articolo_id;
		this.user = UserIstance.getIstance();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Offerta offerta = Offerta.newBuilder().setArticoloId(articolo_id).setEmailUser(user.getEmail()).setValoreOfferta(Float.parseFloat(offer)).build();
		MessaggioGenerico messagge = ServerIstance.getBlockingStub().inviaOfferta(offerta);

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
                    frameMessage.dispose();
	                chiudiFinestreAperte();
	                gestisciNotifiche(articolo_id);
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
	
	/**
	 * Chiudiamo tutti i frame che non sono necessari una volta che il server 
	 * risponde con un messaggio di "SUCCESSO"
	 */
	private void chiudiFinestreAperte() {
		Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame && window.isVisible()) {
            	((JFrame) window).dispose();
            }
        }
        new FinestraHome().setVisible(true);
	}

	/**
	 * SISTEMA PER LA GESTIONE NOTIFICHE
	 * Ogni volta che viene inviata un offerta, il client per far si che non rimanga
	 * in attesa di notifica bloccante crea un nuovo Thread che va a interfacciarsi
	 * con il server e richiedere la notifica all'index k-esimo. Significa che
	 * all'invio di una prima offerta (quando il cliente si registra a ricevere notifiche
	 * su un determinato prodotto) si chiede al server di inviare il messaggio
	 * di quel determinato prodotto alla posizione k=0, se esiste un messaggio da 
	 * inviare, altrimenti aspetta. Una volta che il messaggio arriva allora si
	 * reitera aspettando per il messaggio alla posizione k=1 ecc.
	 * Viene creato un solo Thread per ogni articolo di cui si è interessati
	 * @param articolo_id
	 */
	private void gestisciNotifiche(int articolo_id) {
		if(NewsMessage.getIndex(articolo_id) == 0) {
			Thread notificationThread = new Thread(() -> {
		        while(true) {
					int k = NewsMessage.getIndex(articolo_id);
		        	ArticoloNotifica articoloNotifica = ArticoloNotifica.newBuilder().setIndexNotifica(k).setArticolo(Articolo.newBuilder().setId(articolo_id)).build();
			        MessaggioGenerico messaggio = ServerIstance.getBlockingStub().riceviNotifiche(articoloNotifica);
			        NewsMessage.aggiungiMessaggio(messaggio.getMessaggio());
			        k=k+1;
			        NewsMessage.setIndex(articolo_id, k);
		        }
		    });
		    notificationThread.start();	
		}
	}
}
