package Mastermind_Menü;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Menü_Panel extends JPanel implements ActionListener {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	
   
	
	
	public Menü_Panel() {
		
		img = new ImageIcon(getClass().getResource("Bild.jpg")).getImage();
		
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(new Dimension(762, 456));
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
		
		JLabel Label = new JLabel("Mastermind");
		Label.setBounds(131, 0, 665, 126);
		Label.setForeground(Color.RED);
		Label.setFont(new Font("Urdu Typesetting", Font.PLAIN, 90));
		add(Label);
		
		JButton startButton = new JButton("Schnelles Spiel"); //Spiel mit Standardeinstellungen
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//erstellt das Spiel Fenster ( andere Klasse) , nachdem Button gedrückt
				new Spiel(false);
				
		
			}
		});
		startButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		startButton.setForeground(Color.WHITE);
		startButton.setBackground(Color.BLACK);
		startButton.setBounds(65, 188, 215, 86);
		add(startButton);
		
		JButton Highscore_Button = new JButton("Highscore");  //Netzwerk? Optionen sind im Spiel
		Highscore_Button.setBackground(Color.BLACK);
		Highscore_Button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Highscore_Button.setForeground(Color.WHITE);
		Highscore_Button.setBounds(443, 164, 198, 52);
		add(Highscore_Button);
		
		JButton Infos_Button = new JButton("Informationen");
		Infos_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] option = {"OK"};
				JOptionPane.showOptionDialog(null, "Hier wird mal etwas sinnvolles stehen. (Hoffentlich)", "Information", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
			}
		});
		Infos_Button.setBackground(Color.BLACK);
		Infos_Button.setForeground(Color.WHITE);
		Infos_Button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Infos_Button.setBounds(443, 360, 198, 52);
		add(Infos_Button);
		
		JButton Hilfe_Button = new JButton("Hilfe");
		Hilfe_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object [] option = {"OK"};
				JOptionPane.showOptionDialog(null, "<html>Mit dem Button 'Schnelles Spiel' starten Sie das Spiel mit Standardeinstellungen.<p/> Möchten Sie Einstellungen vornehmen, wählen Sie 'Neues Spiel'.</html> ", "Hilfe", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
			
			}});
		Hilfe_Button.setBackground(Color.BLACK);
		Hilfe_Button.setForeground(Color.WHITE);
		Hilfe_Button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Hilfe_Button.setBounds(443, 263, 198, 52);
		add(Hilfe_Button);
		
		JButton Spiel2 = new JButton("Neues Spiel");  //Vorherige Einstellung der Optionen
		Spiel2.setForeground(Color.WHITE);
		Spiel2.setBackground(Color.BLACK);
		Spiel2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		Spiel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Spiel(true);
			
			
			}
		});
		Spiel2.setBounds(65, 334, 215, 78);
		add(Spiel2);

	}


	
	
	
	

		
	
	
	 public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, null);
		    
		    
		  }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
