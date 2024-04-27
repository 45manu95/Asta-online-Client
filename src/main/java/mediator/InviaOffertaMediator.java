package mediator;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import command.InviaOffertaCommand;

public class InviaOffertaMediator implements Mediator {
	//Frame in caso di errore
			private JFrame frameError = new JFrame();
			
			private int article_id;
			
			//JButtons
			private JButton send;
			
			//JTextFields
			private JTextField offer;

			//Errori
			private String[] errors = {"Campo offerta vuoto", "Il contenuto non risulta un valore numerico"};
			
			public void setDati(JTextField offer, JButton send, int article_id) {
				this.offer = offer;
				this.send = send;
				this.article_id = article_id;
			}

			@Override
			public void notify(JComponent component) {		
				if(component == send) {
					int error = controllaCorrettezza();
					if (error == 0) {
						InviaOffertaCommand subscribe = new InviaOffertaCommand();
						subscribe.setDati(offer.getText(), article_id);
						subscribe.actionPerformed(null);
					}
					else {
						displayErrors(error);
					}
				}
			}

			private int controllaCorrettezza() {
				int error = 0;
				
				if(offer.getText().length() == 0) {
					error = 1;
				}
				else if(!isPrezzo(offer.getText())) {
					error = 2;
				}
				
				return error;
			}
			
			private boolean isPrezzo(String input) {
				String currencyPattern = "[0-9]+([.][0-9]{1,2})?";
				return input.matches(currencyPattern);
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
