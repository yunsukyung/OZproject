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

public class StartView extends JPanel{

	public StartView(JFrame mf) {
		
		this.setLocation(0, 0);
		this.setSize(370, 760);
		Image background = new ImageIcon("C:\\Users\\tmddu\\git\\OZ\\image\\start\\startBackground.png").getImage().getScaledInstance(370, 760, 0);

		JLabel label = new JLabel(new ImageIcon(background));
		
		
		
		JButton button = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\tmddu\\git\\OZ\\image\\start\\start.png").getImage().getScaledInstance(160, 160, 0)));
		button.setLocation(100, 300);
		button.setSize(180, 150);
	
		
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		label.add(button, BorderLayout.CENTER);
		this.add(label, BorderLayout.CENTER);
		mf.add(this);
		mf.revalidate();
	}


	
}

