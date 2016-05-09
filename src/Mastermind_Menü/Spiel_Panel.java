package Mastermind_Menü;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;

public class Spiel_Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	Spiel_Panel(){
		
	Dimension size = new Dimension(1500, 800);
	setPreferredSize(new Dimension(1500, 800));
	setMinimumSize(size);
	setMaximumSize(size);
	setSize(size);
	setLayout(null);
	
	JButton btnNewButton = new JButton("Men\u00FC");
	btnNewButton.setBounds(1321, 82, 164, 40);
	add(btnNewButton);
	
	JPanel panel_unten = new JPanel();
	panel_unten.setBackground(Color.GRAY);
	panel_unten.setBounds(332, 615, 946, 169);
	add(panel_unten);
	panel_unten.setLayout(null);
	
	JButton button_blau = new JButton("");
	button_blau.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	button_blau.setBackground(Color.GRAY);
	button_blau.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_Blau.png")));
	button_blau.setBounds(125, 27, 47, 52);
	panel_unten.add(button_blau);
	
	JButton button_grün = new JButton("");
	button_grün.setSelectedIcon(new ImageIcon("C:\\Users\\Jasmin\\workspace\\Mastermind\\bin\\Mastermind_Men\u00FC\\Pin_gr\u00FCn.png"));
	button_grün.setBackground(Color.GRAY);
	button_grün.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_gr\u00FCn.png")));
	button_grün.setBounds(200, 27, 47, 52);
	panel_unten.add(button_grün);
	
	JButton button_gelb = new JButton("");
	button_gelb.setBackground(Color.GRAY);
	button_gelb.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_gelb.png")));
	button_gelb.setBounds(275, 27, 47, 52);
	panel_unten.add(button_gelb);
	
	JButton btnNewButton_1 = new JButton("");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	btnNewButton_1.setBackground(Color.GRAY);
	btnNewButton_1.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/roter_pin.png")));
	btnNewButton_1.setSelectedIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/roter_pin.png")));
	btnNewButton_1.setBounds(49, 27, 52, 52);
	panel_unten.add(btnNewButton_1);
	
	
	
	
	
	
	

	
	JPanel panel_links = new JPanel();
	panel_links.setBackground(Color.LIGHT_GRAY);
	panel_links.setBounds(51, 43, 266, 741);
	add(panel_links);
	panel_links.setLayout(null);
	
	
	
	JButton bw_Button1 = new JButton("");
	bw_Button1.setEnabled(false);
	bw_Button1.setBackground(Color.LIGHT_GRAY);
	bw_Button1.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	bw_Button1.setBounds(25, 36, 55, 53);
	panel_links.add(bw_Button1);
	
	
	JButton bw_Button2 = new JButton("");
	bw_Button2.setEnabled(false);
	bw_Button2.setBackground(Color.LIGHT_GRAY);
	bw_Button2.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	bw_Button2.setBounds(95, 36, 55, 53);
	panel_links.add(bw_Button2);
	
	JButton bw_Button3 = new JButton("");
	bw_Button3.setEnabled(false);
	bw_Button3.setBackground(Color.LIGHT_GRAY);
	bw_Button3.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	bw_Button3.setBounds(165, 36, 55, 53);
	panel_links.add(bw_Button3);
	
	JPanel panel_rechts = new JPanel();
	panel_rechts.setBorder(null);
	panel_rechts.setBackground(Color.GRAY);
	panel_rechts.setBounds(332, 43, 946, 556);
	add(panel_rechts);
	
	JButton Button_Code1 = new JButton("");
	Button_Code1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	
	ButtonGroup code = new ButtonGroup();
	
	Button_Code1.setBackground(Color.GRAY);
	Button_Code1.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	
	JButton Button_Code2 = new JButton("");
	Button_Code2.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	Button_Code2.setEnabled(false);
	Button_Code2.setBackground(Color.GRAY);
	
	JButton Button_Code3 = new JButton("");
	Button_Code3.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	Button_Code3.setEnabled(false);
	Button_Code3.setBackground(Color.GRAY);
	
	JButton Button_Code4 = new JButton("");
	Button_Code4.setIcon(new ImageIcon(Spiel_Panel.class.getResource("/resources/Pin_grau.png")));
	Button_Code4.setEnabled(false);
	Button_Code4.setBackground(Color.GRAY);
	
	code.add(Button_Code1);       
	code.add(Button_Code2);
	code.add(Button_Code3);
	code.add(Button_Code4);
	
	
	GroupLayout gl_panel_rechts = new GroupLayout(panel_rechts);
	gl_panel_rechts.setHorizontalGroup(
		gl_panel_rechts.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_rechts.createSequentialGroup()
				.addGap(37)
				.addComponent(Button_Code1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addGap(29)
				.addComponent(Button_Code2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addGap(30)
				.addComponent(Button_Code3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addGap(30)
				.addComponent(Button_Code4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(572, Short.MAX_VALUE))
	);
	gl_panel_rechts.setVerticalGroup(
		gl_panel_rechts.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panel_rechts.createSequentialGroup()
				.addGap(42)
				.addGroup(gl_panel_rechts.createParallelGroup(Alignment.LEADING)
					.addComponent(Button_Code4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addComponent(Button_Code3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addComponent(Button_Code2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addComponent(Button_Code1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(26, Short.MAX_VALUE))
	);
	panel_rechts.setLayout(gl_panel_rechts);
}
}
