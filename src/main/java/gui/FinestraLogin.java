package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FinestraLogin extends JFrame{
	private static final long serialVersionUID = 1L;

	private PannelloOvest p1=null;
	private PannelloLogin p2=null;
	
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
    
    public FinestraLogin() {
		setTitle("Asta Online");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1,2));
		setBackground(Color.WHITE);
		setResizable(false);
		add(p1 = new PannelloOvest());
		add(p2 = new PannelloLogin());
	}
	
	private class PannelloLogin extends JPanel{
		private static final long serialVersionUID = 1L;
		
		private JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel img = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel enterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel subscribePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		public PannelloLogin() {
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
            
            //ritocchi grafici
            email.setPreferredSize(new Dimension(150,25));
            password.setPreferredSize(new Dimension(150,25));
            login.setFont(new Font(login.getFont().getName(), login.getFont().getStyle(), 25));
            
            //aggiunta eventi agli elementi
            enter.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
                      new FinestraHome().setVisible(true);
                      dispose();
                }
            });
            subscribeButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
                      new FinestraSubscribe().setVisible(true);
                      dispose();
                }
            });
            
            //aggiunta dei rispettivi elementi ai pannelli
            titlePanel.add(login);
            img.add(imgLabel);
            emailPanel.add(emailLabel);
            emailPanel.add(email);
            passwordPanel.add(passwordLabel);
            passwordPanel.add(password);
            enterPanel.add(enter);
            subscribePanel.add(subscribe);
            subscribePanel.add(subscribeButton);

            
            add(titlePanel);
            add(img);
            add(emailPanel);
            add(passwordPanel);
            add(enterPanel);
            add(subscribePanel);
		}
	}
	
	private class PannelloOvest extends JPanel{
		private static final long serialVersionUID = 1L;

		public PannelloOvest() {
            setLayout(new GridBagLayout());
            setBackground(Color.orange);
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.anchor = GridBagConstraints.CENTER;
            
            welcome.setForeground(Color.white);
            welcome.setFont(new Font(login.getFont().getName(), login.getFont().getStyle(), 20));
            
            projectName.setHorizontalAlignment(SwingConstants.CENTER);
            
            add(welcome, gbc);
            gbc.gridy++;
            add(projectName, gbc);
		}
	}

}
