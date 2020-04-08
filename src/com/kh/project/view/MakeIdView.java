package com.kh.project.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MakeIdView extends JPanel{
	
	public MakeIdView(JFrame mf) {
		this.setLayout(null);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\user2\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(400, 400, 0)));
		label.setBounds(-30, 50, 400, 400);
		this.add(label);
		
		
	}
}
