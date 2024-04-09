package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class FinestraSubscribe extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//Panels
	@SuppressWarnings("unused")
	private CentralPanel p1=null;

	
	//JTextField
	private JTextField name = new JTextField();
	private JTextField surname = new JTextField();
	private JTextField email = new JTextField();
	private JPasswordField password = new JPasswordField();

	//JLabel
	private JLabel subscribe = new JLabel("ISCRIVITI");
	private JLabel nameLabel = new JLabel("Nome:");
	private JLabel surnameLabel = new JLabel("Cognome:");
	private JLabel emailLabel = new JLabel("Email:");
	private JLabel passwordLabel = new JLabel("Password:");
	
	//JButton
	private JButton subscribeButton= new JButton("Iscriviti");


	public FinestraSubscribe() {
		setTitle("Asta Online - Iscrizione");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                new FinestraLogin().setVisible(true);
                dispose();
            }
        });		
        setLocationRelativeTo(null);
		setResizable(false);
		add(p1 = new CentralPanel());
	}
	
	private class CentralPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		
		//Pannelli per disposizione grafica
		private JPanel titleDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel nameDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel surnameDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel emailDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel passwordDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));
		private JPanel buttonDisposition = new JPanel(new FlowLayout(FlowLayout.CENTER));

		
		public CentralPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
            subscribe.setFont(new Font(subscribe.getFont().getName(), subscribe.getFont().getStyle(), 25));
            
            name.setPreferredSize(new Dimension(150,25));
            surname.setPreferredSize(new Dimension(150,25));
            email.setPreferredSize(new Dimension(150,25));
            password.setPreferredSize(new Dimension(150,25));
            
            subscribeButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
                    new FinestraHome().setVisible(true);
                    dispose();
              }
          });
            
            titleDisposition.add(subscribe);
			nameDisposition.add(nameLabel);
			nameDisposition.add(name);
			surnameDisposition.add(surnameLabel);
			surnameDisposition.add(surname);
			emailDisposition.add(emailLabel);
			emailDisposition.add(email);
			passwordDisposition.add(passwordLabel);
			passwordDisposition.add(password);
			buttonDisposition.add(subscribeButton);
			
			add(titleDisposition);
			add(nameDisposition);
			add(surnameDisposition);
			add(emailDisposition);
			add(passwordDisposition);
			add(buttonDisposition);
		}
	}
	
	
	
}
