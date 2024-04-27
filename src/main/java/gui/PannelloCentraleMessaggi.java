package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PannelloCentraleMessaggi extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel title = new JLabel("MESSAGGI");

	public PannelloCentraleMessaggi() {
		setLayout(new GridBagLayout()); 
	    GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Aggiunge spaziatura
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER; // Allinea al centro
		add(title);
	}
}
