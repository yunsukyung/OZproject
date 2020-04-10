package com.kh.project.view;

import javax.swing.JFrame;

import com.kh.project.view.shop.*;

public class MainView extends JFrame {
	
	public MainView() {
		this.setTitle("oz의 펭귄");
		this.setBounds(0, 0, 380, 680);
		this.setLayout(null);
		this.add(new StartView(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
