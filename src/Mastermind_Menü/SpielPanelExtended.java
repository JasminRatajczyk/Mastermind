package Mastermind_Menü;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SpielPanelExtended extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SpielPanelExtended() {
		setBackground(Color.BLACK);
		
		Dimension size = new Dimension(1500, 800);
		setPreferredSize(new Dimension(1500, 800));
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Spieleinstellungen");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(273, 61, 572, 68);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setForeground(Color.LIGHT_GRAY);
		spinner.setBounds(146, 347, 91, 57);
		spinner.setModel(new SpinnerNumberModel(4, 4, 15, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 27));
		add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("Anzahl der Farben");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(95, 270, 268, 39);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Anzahl der Versuche");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(95, 498, 268, 39);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		add(lblNewLabel_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setForeground(Color.LIGHT_GRAY);
		spinner_1.setModel(new SpinnerListModel(new String[] {"5", "10", "15", "20","25", "30","35", "40","45", "50", "beliebig"}));
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		spinner_1.setBounds(95, 576, 179, 57);
		add(spinner_1);
		
		JButton btnNewButton = new JButton("Spiel starten");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Spiel(false);   //geht jetzt zum Spielbildschirm mit voreinstellungen, möglicherweise parameter übergeben??
				//Fenster für Voreinstellungen muss beendet werden ??
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(492, 672, 261, 68);
		add(btnNewButton);
		
		JLabel farbenLabel = new JLabel("<html>Wählen Sie aus, <p/>mit wie viel Farben Sie spielen möchten.<p/>Durch mehr Farben erhöht sich die Schwierigkeit.</html>");
		farbenLabel.setForeground(Color.WHITE);
		farbenLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		farbenLabel.setBounds(308, 325, 326, 102);
		add(farbenLabel);
		
		JLabel versucheLabel = new JLabel("<html>W\u00E4hlen Sie aus,<p/>wie lange Sie raten m\u00F6chten.</html>");
		versucheLabel.setForeground(Color.WHITE);
		versucheLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		versucheLabel.setBounds(308, 553, 279, 80);
		add(versucheLabel);
		

	}
}
