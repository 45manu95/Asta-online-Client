package command;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;
import astaOnlineProto.AstaOnLine.Utente;
import gui.FinestraHome;
import gui.FinestraLogin;
import gui.News;
import singleton.ServerIstance;
import singleton.UserIstance;
import utils.Utils;

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
	                gestisciNotifiche();
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
	
	private void chiudiFinestreAperte() {
		Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame && window.isVisible()) {
                ((JFrame) window).dispose();
                break; // Uscita dal ciclo dopo aver chiuso il frame desiderato
            }
        }
	}

	private void gestisciNotifiche() {
	    Thread notificationThread = new Thread(() -> {
	        Articolo articolo = Articolo.newBuilder().setId(articolo_id).build(); 
	        while(true) {
		        MessaggioGenerico messaggio = ServerIstance.getBlockingStub().riceviNotifiche(articolo);
		        new News(messaggio.getMessaggio()).setVisible(true);
	        }
	    });
	    notificationThread.start();
	}
}
