package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.*;

public class HowToPlayView extends JPanel{
	public HowToPlayView(JFrame mf) {
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//튜토리얼 화면
	    JLabel background = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\tmddu\\git\\OZproject\\src\\image\\start\\게임방법.png").getImage().getScaledInstance(360, 640, 0)));
		background.setBounds(0, 0, 360, 640);
	    
		//back버튼추가
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\tmddu\\git\\OZproject\\src\\image\\start\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setBounds(131, 530, 98, 35);
		background.add(backbutton);
		

		background.add(backbutton, BorderLayout.CENTER);
		this.add(backbutton);
		this.add(background);
	}
}
