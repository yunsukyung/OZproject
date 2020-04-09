package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.*;


public class ExplainView extends JPanel{

	public ExplainView(JFrame mf) {
		this.setLocation(0, 0);
		this.setSize(370, 720);
		Image background = new ImageIcon("C:\\Users\\tmddu\\git\\OZproject\\src\\image\\start\\튜토리얼.png").getImage().getScaledInstance(370, 720, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		
		
		this.add(label, BorderLayout.CENTER);
		mf.add(this);
		this.add(label);
	}
	


}
