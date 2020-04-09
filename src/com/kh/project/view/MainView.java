package com.kh.project.view;

import javax.swing.JFrame;

public class MainView extends JFrame {
	
	public MainView() {
		this.setTitle("oz의 펭귄");
		this.setBounds(0, 0, 370, 760);
		
		//this.add(new BackgroundPanel(this));
		this.add(new MakeIdView(this));
		this.add(new LoginView(this));
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
