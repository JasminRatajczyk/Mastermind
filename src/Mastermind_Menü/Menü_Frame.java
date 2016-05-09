package Mastermind_Men�;
import javax.swing.JFrame;


public class Men�_Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Men�_Frame(){
		Men�_Panel panel = new Men�_Panel();
		getContentPane().add(panel);
		pack();
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args){
		new Men�_Frame();
	}

}
