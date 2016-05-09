package Mastermind_Menü;
import javax.swing.JFrame;


public class Menü_Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menü_Frame(){
		Menü_Panel panel = new Menü_Panel();
		getContentPane().add(panel);
		pack();
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args){
		new Menü_Frame();
	}

}
