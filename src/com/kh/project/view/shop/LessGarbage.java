package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.*;

public class LessGarbage extends JPanel{
	
	public LessGarbage(JFrame mf) {
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//쓰레기수집배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src/image/start/쓰레기 수집1.png").getImage().getScaledInstance(360, 640, 0)));
		background.setBounds(0, 0, 360, 640);
		
		//쓰레기 수집하러가기 버튼
		JButton garbageButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\쓰레기수집하러가기1.png").getImage().getScaledInstance(100, 35, 0)));
		garbageButton.setBounds(131, 340, 92, 27);
		background.add(garbageButton);
		
		//back버튼 
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setBounds(131, 450 ,98,35);
		background.add(backButton);
		
		background.add(garbageButton, BorderLayout.CENTER);
		this.add(garbageButton);
		this.add(background);
		
	
		
		
	}
	
	
}
