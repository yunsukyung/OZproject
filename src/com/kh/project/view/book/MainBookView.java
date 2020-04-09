package com.kh.project.view.book;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainBookView extends JPanel{
	
	
	public MainBookView(JFrame mf) {
		this.setLayout(null);
		JPanel panel = new JPanel();
		
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\user2\\git\\OZproject\\src\\image\\book\\book.PNG").getImage().getScaledInstance(370, 760, 0)));
		back.setBounds(0, -40, 370, 760);
		
		panel.add(back);
		
		
	}
}
