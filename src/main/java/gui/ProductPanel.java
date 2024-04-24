package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.google.protobuf.ByteString;

import astaOnlineProto.AstaOnLine.Articolo;

public class ProductPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	//JPanel
	private JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel descriptionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JPanel pricePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	//JLabel
	private JLabel title;
	private JLabel imageProduct;
	private JLabel description;
	private JLabel price;
	
	
	public ProductPanel(Articolo articolo) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.WHITE);
		
		//otteniamo l'immagine
		ByteString byteString = articolo.getImmagine();
		byte[] imageData = byteString.toByteArray();
        ImageIcon imageIcon = creaImageIcon(imageData);
        
        title = new JLabel(articolo.getNome().toUpperCase());
        imageProduct = new JLabel(imageIcon);
        description = new JLabel(articolo.getDescrizione());
        price = new JLabel(String.valueOf(articolo.getValorePartenza())+ " €");
        
        title.setFont(title.getFont().deriveFont(Font.BOLD, 16));
		
		titlePanel.add(title);
		imagePanel.add(imageProduct);
		descriptionPanel.add(description);
		pricePanel.add(price);
		
		add(titlePanel);
		add(imagePanel);
		add(descriptionPanel);
		add(pricePanel);
	}
	
	private ImageIcon creaImageIcon(byte[] imageData) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
            BufferedImage image = ImageIO.read(bis);
            
            Image resizedImage = image.getScaledInstance(200, 200, Image.SCALE_REPLICATE);

            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
