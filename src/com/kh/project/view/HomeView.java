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
		
		this.setLocation(0, 0);
		this.setSize(370, 760);
		Image background = new ImageIcon("/Users/hailey/git/OZproject/src/image/start/icebergMain.jpg").getImage().getScaledInstance(370, 760, 0);

		JLabel label = new JLabel(new ImageIcon(background));
		
		
		
		JButton button1 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/로그인간판.png").getImage().getScaledInstance(129, 148, 0)));
		button1.setLocation(60, 250);
		button1.setSize(129, 148);
		
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		
		JButton button2 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/settings.png").getImage().getScaledInstance(36, 36, 0)));
		button2.setLocation(330, 10);
		button2.setSize(36, 36);
		
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		
		JButton button3 = new JButton(new ImageIcon(new ImageIcon("/Users/hailey/git/OZproject/src/image/start/shopping-store (1).png").getImage().getScaledInstance(36, 36, 0)));
		button3.setLocation(330, 50);
		button3.setSize(36, 36);
		
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		
		
		this.add(button1);
		mf.add(this);
		
		this.add(button2);
		mf.add(this);
		
		this.add(button3);
		mf.add(this);
		
		this.add(mf);
		
	}
	

}
