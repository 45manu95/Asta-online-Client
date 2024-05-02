package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Visualizza la Home del Client, per default impostata a prodotto con asta in corso
 */
public class FinestraHome extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PannelloOvest p1=null;
	private PannelloCentraleVendita p2=null;
	private PannelloCentraleVenduti p3=null;
	private PannelloCentraleInteressati p4=null;
	private PannelloCentraleMessaggi p5=null;
	
	private String ultimoPannello="PannelloCentraleVendita";

    //Labels
	private JLabel titleMenu = new JLabel("MENU");
    
    //bottoni
	private JButton purchaseArticles = new JButton("ARTICOLI IN VENDITA");
	private JButton purchasedArticles = new JButton("ARTICOLI ACQUISTATI");
	private JButton interestedArticles = new JButton("ARTICOLI INTERESSATI");
	private JButton messagesArticles = new JButton("MESSAGGI");
    
	private GridBagConstraints gbc = new GridBagConstraints();
    
    
    //ritocchi grafici	
	public FinestraHome() {
		setTitle("Asta Online CLIENT");
		setSize(1100,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	    setBackground(Color.WHITE);
		setResizable(false);
	    setLayout(new GridBagLayout());
	    
	    gbc.fill = GridBagConstraints.BOTH;

	    p1 = new PannelloOvest();
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.weightx = 0.2; // Imposta il peso della colonna per il PannelloOvest
	    gbc.weighty = 1.0;
	    add(p1, gbc);

	    p2 = new PannelloCentraleVendita();
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gbc.weightx = 0.8; // Imposta il peso della colonna per il PannelloCentrale
	    gbc.weighty = 1.0;
	    add(p2, gbc);		


	}
	
	private class PannelloOvest extends JPanel implements ActionListener {

		private static final long serialVersionUID = 1L;		
		
		public PannelloOvest() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
			setBackground(Color.ORANGE);
			titleMenu.setFont(new Font(titleMenu.getFont().getName(), titleMenu.getFont().getStyle(), 25));
			
			titleMenu.setAlignmentX(CENTER_ALIGNMENT);
			purchaseArticles.setAlignmentX(CENTER_ALIGNMENT);
			purchasedArticles.setAlignmentX(CENTER_ALIGNMENT);
			interestedArticles.setAlignmentX(CENTER_ALIGNMENT);
			messagesArticles.setAlignmentX(CENTER_ALIGNMENT);

		     add(Box.createVerticalGlue()); // Spazio vuoto sopra i bottoni
		     add(titleMenu);
		     add(Box.createVerticalGlue()); // Spazio vuoto tra il titolo e i bottoni
		     add(purchaseArticles);
		     add(purchasedArticles);
		     add(interestedArticles);
		     add(messagesArticles);
		     add(Box.createVerticalGlue());
		     
		     purchaseArticles.addActionListener(this);
		     purchasedArticles.addActionListener(this);
		     interestedArticles.addActionListener(this);
		     messagesArticles.addActionListener(this);
		      
		}
		

	    @Override
	    public void actionPerformed(ActionEvent evt) {		
	        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
	    	rimuovi(frame);
	    	if(evt.getSource() == purchaseArticles) {
				p2 = new PannelloCentraleVendita();
				ultimoPannello = "PannelloCentraleVendita";
				frame.add(p2,gbc);
			}
			else if(evt.getSource() == purchasedArticles) {
				p3 = new PannelloCentraleVenduti();
				ultimoPannello = "PannelloCentraleVenduti";
				frame.add(p3,gbc);
			}
			else if(evt.getSource() == interestedArticles) {
				p4 = new PannelloCentraleInteressati();
				ultimoPannello = "PannelloCentraleInteressati";
				frame.add(p4,gbc);
			}
			else if(evt.getSource() == messagesArticles) {
				p5 = new PannelloCentraleMessaggi();
				ultimoPannello = "PannelloCentraleMessaggi";
				frame.add(p5,gbc);
			}
	    	frame.revalidate();
	    	frame.repaint();
		}
	    
	    private void rimuovi(JFrame frame) {
	    	//recupero il frame genitore ed elimino il panel corrente
	        if(ultimoPannello.equals("PannelloCentraleVendita")) {
		        frame.remove(p2);
	        }
	        else if(ultimoPannello.equals("PannelloCentraleVenduti")) {
		        frame.remove(p3);
	        }
	        else if(ultimoPannello.equals("PannelloCentraleInteressati")) {
		        frame.remove(p4);
	        }
	        else if(ultimoPannello.equals("PannelloCentraleMessaggi")) {
		        frame.remove(p5);
	        }
	    }
		
	}	
}
