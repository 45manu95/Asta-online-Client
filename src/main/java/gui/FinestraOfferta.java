package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import astaOnlineProto.AstaOnLine.Articolo;

public class FinestraOfferta extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel centralDisposition = new JPanel();
	private JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel subtitlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel offerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	private JLabel titleLabel;
	private JLabel subtitleLabel = new JLabel("Dal momento in cui invierai l'offerta inizierai a partecipare all'asta e riceverai messaggi");
	private JLabel offerLabel = new JLabel("Inserisci offerta: ");
	private JTextField offer = new JTextField();
	private JButton send = new JButton("INVIA");
	
	public FinestraOfferta(Articolo articolo) {
		setTitle("Invia offerta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		setResizable(false);
		
		centralDisposition.setLayout(new BoxLayout(centralDisposition, BoxLayout.Y_AXIS));

		offer.setPreferredSize(new Dimension(150,25));
		
		titleLabel = new JLabel("OFFERTA per "+articolo.getNome());
		titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 16));
		
		titlePanel.add(titleLabel);
		subtitlePanel.add(subtitleLabel);
		offerPanel.add(offerLabel);
		offerPanel.add(offer);
		buttonPanel.add(send);
		
		centralDisposition.add(titlePanel);
		centralDisposition.add(subtitlePanel);
		centralDisposition.add(offerPanel);
		centralDisposition.add(buttonPanel);
		
		add(centralDisposition);
		
		send.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                  new FinestraSubscribe().setVisible(true);
                  dispose();
            }
        });
		
		pack();
	}
}
