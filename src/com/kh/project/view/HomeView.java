package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeView extends JPanel{

	
	public HomeView(JFrame mf) {
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		Image background = new ImageIcon("/Users/hailey/git/OZproject/src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		
		JButton button1 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/로그인간판.png").getImage().getScaledInstance(129, 148, 0)));
		button1.setBounds(45, 175, 129, 148);
		
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		
		JButton button2 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/settings.png").getImage().getScaledInstance(36, 36, 0)));
		button2.setBounds(320, 20, 36, 36);
		
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		
		JButton button3 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/shopping-store (1).png").getImage().getScaledInstance(36, 36, 0)));
		button3.setBounds(320, 70, 36, 36);
		
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		
		JButton button4 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/Rectangle 83.png").getImage().getScaledInstance(36, 36, 0)));
		button4.setBounds(320, 110, 36, 36);
		
		button4.setBorderPainted(false);
		button4.setFocusPainted(false);
		button4.setContentAreaFilled(false);
		
		JButton button5 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/Component 2.png").getImage().getScaledInstance(360, 63, 0)));
		button5.setBounds(0, 577, 360, 63);
		
		button5.setBorderPainted(false);
		button5.setFocusPainted(false);
		button5.setContentAreaFilled(false);
		
		JButton button6 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/igloo (1).png").getImage().getScaledInstance(161, 161, 0)));
		button6.setBounds(30, 250, 161, 161);
		
		button6.setBorderPainted(false);
		button6.setFocusPainted(false);
		button6.setContentAreaFilled(false);
		
		JButton button7 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/pengz2.png.png").getImage().getScaledInstance(232, 320, 0)));
		button7.setBounds(100, 300, 235, 224);
		
		button7.setBorderPainted(false);
		button7.setFocusPainted(false);
		button7.setContentAreaFilled(false);
		
		JButton button8 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/soju1.png").getImage().getScaledInstance(90, 100, 0)));
		button8.setBounds(60, 500, 60, 100);
		
		button8.setBorderPainted(false);
		button8.setFocusPainted(false);
		button8.setContentAreaFilled(false);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
//		this.add(button9);
		
		this.add(label);
		mf.add(this);
	}
	

}
