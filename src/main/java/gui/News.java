package gui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class News extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JLabel messageLabel;
	
	public News(String message) {
		messageLabel = new JLabel(message);
		add(messageLabel, BorderLayout.CENTER);
		setModal(true);
	}
}
