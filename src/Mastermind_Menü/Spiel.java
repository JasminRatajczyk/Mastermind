package Mastermind_Menü;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Spiel extends JFrame {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public Spiel (Boolean b){
	
		if(b==false){
			setTitle("Mastermind");
			panel = new Spiel_Panel();
			
		}else{
		if(b==true){
			setTitle("Voreinstellungen");
			panel = new SpielPanelExtended();
		}}
		getContentPane().add(panel);
		setLocationByPlatform(true);
		
		setResizable(false);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
