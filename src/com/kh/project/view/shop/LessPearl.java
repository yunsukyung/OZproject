package com.kh.project.view.shop;

import java.awt.BorderLayout;

import javax.swing.*;

public class LessPearl extends JPanel{

	public LessPearl(JFrame mf) {
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//진주 수집배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\진주수집배경.png").getImage().getScaledInstance(360, 640, 0)));
		background.setBounds(0, 0, 360, 640);
		
		//진주 구매하러가기 버튼
		JButton pearlButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\진주구매하러가기2.png").getImage().getScaledInstance(100, 35, 0)));
		pearlButton.setBounds(131, 340, 100, 35);
		background.add(pearlButton);
		pearlButton.setLayout(null);
		
		//back버튼
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src\\\\image\\\\start\\\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setBounds(131, 450, 98, 35);
		background.add(backButton);
		
		background.add(pearlButton, BorderLayout.CENTER);
		this.add(pearlButton);
		this.add(background);
	}
}
