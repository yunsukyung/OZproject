package com.kh.project.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InforMationView extends JPanel{

	public InforMationView(JFrame mf) {
		this.setLocation(0, 0);
		this.setSize(370,760);
		
		//바다뒷배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\jino0\\git\\OZproject\\src\\image\\start\\바다뒷배경.png").getImage().getScaledInstance(360, 640, 0)));
		//안내표지판
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\jino0\\git\\OZproject\\src\\image\\start\\안내문표.png").getImage().getScaledInstance(458, 458, 0)));
		label.setLocation(0, 0);
		label.setSize(360, 458);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(150,220,60,20);
		
		label.add(backButton);
		
		background.add(label, BorderLayout.CENTER);
		this.add(background);
	}
	
}
