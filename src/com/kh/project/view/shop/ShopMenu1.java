package com.kh.project.view.shop;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopMenu1 extends JPanel{

	public ShopMenu1() {
		this.setBounds(25, 100, 170, 190);
		this.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(25, 100, 170, 190);
		panel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel shoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		shoplabel1.setBounds(0, 0, 170, 190);
		
		JButton left = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		left.setLayout(null);
		left.setBounds(15, 80, 20, 20);
		
		JButton right = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		right.setLayout(null);
		right.setBounds(140, 80, 20, 20);
		
		panel2.add(right);
		panel2.add(left);
		panel2.add(shoplabel1);
		
		this.add(panel2);
	}
}
