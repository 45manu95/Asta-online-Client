package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import singleton.NewsMessage;

public class PannelloCentraleMessaggi extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel title = new JLabel("MESSAGGI");
	
	private JTextArea messageArea;
	private JScrollPane scrollPane;

	public PannelloCentraleMessaggi() {
		setLayout(new GridBagLayout()); 
	    GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER; 
		add(title);
		
        messageArea = new JTextArea(10, 20); 
        messageArea.setEditable(false); 

        scrollPane = new JScrollPane(messageArea);
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH; 
        add(scrollPane, gbc);
        
    	messageArea.setText("");
        for(String messaggio : NewsMessage.getIstance()) {
            messageArea.append(messaggio+"\n");
            messageArea.setCaretPosition(messageArea.getDocument().getLength());
        }
    }
}
