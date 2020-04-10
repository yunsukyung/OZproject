package com.kh.project.view.shop;

import java.awt.Image;

import javax.swing.*;

import com.kh.project.view.MainView;

public class GameOverView1 extends JPanel{
	private JPanel startPage;
	private MainView mf;

	public GameOverView1(MainView mf) {
		this.startPage = this;
		this.mf = mf;
		
		//위치고정 
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//배경
		Image background = new ImageIcon("src\\image\\start\\바다속gameover.png").getImage().getScaledInstance(360, 640, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		JLabel label1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\GameOver1.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		
				
				
				
		this.add(label1);
		this.add(label);
		
		
		
	}

}
