package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FinestraHome extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//TextFields
    JTextField email = new JTextField();
    JPasswordField password = new JPasswordField();

    //Labels
    JLabel login = new JLabel("ACCESSO");
    JLabel emailLabel = new JLabel("Email:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel subscribe = new JLabel("altrimenti");
    JLabel welcome = new JLabel("INGEGNERIA DEL SOFTWARE");
    JLabel projectName = new JLabel("<html><center>Progetto Asta on-line<br>Power by<br>Manuel Ganino<br>matricola 219928<center></html>");
    
    //componenti multimediali
    JLabel imgLabel = new JLabel(new ImageIcon("src/main/resources/images/user.png"));
    
    //bottoni
    JButton enter = new JButton("INVIO");
    JButton subscribeButton = new JButton("REGISTRATI");
    
    //ritocchi grafici	
	public FinestraHome() {
		setTitle("Asta Online");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1,2));
		setBackground(Color.WHITE);
		setResizable(false);
	}

}
