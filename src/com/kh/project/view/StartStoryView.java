package com.kh.project.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartStoryView extends JPanel{

	public StartStoryView(JFrame mf) {
	
		this.setLayout(null);
		
		
		
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("D:\\java\\workspace\\OZproject\\src\\image\\start\\스토리 배경.jpg").getImage().getScaledInstance(100, 100, 0)));
		label.setBounds(0,0,100,800);
		
		JLabel penguin = new JLabel(new ImageIcon(new ImageIcon("D:\\java\\workspace\\OZproject\\src\\image\\start\\스토리 배경.jpg").getImage().getScaledInstance(100, 100, 0)));
		penguin.setBounds(0, 0, 30, 50);
		
		this.add(label);
		this.add(penguin);
		
		
		
		
	}

	

}
