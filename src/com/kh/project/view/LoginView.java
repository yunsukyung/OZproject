package com.kh.project.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginView extends JPanel{

	public LoginView(JFrame mf) {
		
		this.setLayout(null);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\jino0\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		this.add(label);
		
		
	}
}
