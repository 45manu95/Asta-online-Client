package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FinestraHome extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PannelloOvest p1=null;
	private PannelloCentrale p2=null;

	
	//TextFields
    JTextField email = new JTextField();
    JPasswordField password = new JPasswordField();

    //Labels
    JLabel titleMenu = new JLabel("MENU");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel subscribe = new JLabel("altrimenti");
    JLabel welcome = new JLabel("INGEGNERIA DEL SOFTWARE");
    JLabel projectName = new JLabel("<html><center>Progetto Asta on-line<br>Power by<br>Manuel Ganino<br>matricola 219928<center></html>");
    
    //componenti multimediali
    JLabel imgLabel = new JLabel(new ImageIcon("src/main/resources/images/user.png"));
    
    //bottoni
    JButton purchasedArticles = new JButton("ARTICOLI ACQUISTATI");
    JButton interestedArticles = new JButton("ARTICOLI INTERESSATI");
    JButton messagesArticles = new JButton("MESSAGGI");

    
    //ritocchi grafici	
	public FinestraHome() {
		setTitle("Asta Online");
		setSize(1100,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	      setLayout(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.fill = GridBagConstraints.BOTH;

	        p1 = new PannelloOvest();
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.weightx = 0.2; // Imposta il peso della colonna per il PannelloOvest
	        gbc.weighty = 1.0;
	        add(p1, gbc);

	        p2 = new PannelloCentrale();
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        gbc.weightx = 0.8; // Imposta il peso della colonna per il PannelloCentrale
	        gbc.weighty = 1.0;
	        add(p2, gbc);		
	    setBackground(Color.WHITE);
		setResizable(false);

	}
	
	private class PannelloOvest extends JPanel{

		private static final long serialVersionUID = 1L;		
		
		public PannelloOvest() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
			setBackground(Color.ORANGE);
			titleMenu.setFont(new Font(titleMenu.getFont().getName(), titleMenu.getFont().getStyle(), 25));
			
			titleMenu.setAlignmentX(CENTER_ALIGNMENT);
			purchasedArticles.setAlignmentX(CENTER_ALIGNMENT);
			interestedArticles.setAlignmentX(CENTER_ALIGNMENT);
			messagesArticles.setAlignmentX(CENTER_ALIGNMENT);

		     add(Box.createVerticalGlue()); // Spazio vuoto sopra i bottoni
		        add(titleMenu);
		        add(Box.createVerticalGlue()); // Spazio vuoto tra il titolo e i bottoni
		        add(purchasedArticles);
		        add(interestedArticles);
		        add(messagesArticles);
		        add(Box.createVerticalGlue());
			
		}
		
	}
	
	private class PannelloCentrale extends JPanel{

		private static final long serialVersionUID = 1L;
		
		public PannelloCentrale() {
			
		}
		
	}

}
