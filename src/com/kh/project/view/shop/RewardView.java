package com.kh.project.view.shop;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.Player;
import com.kh.project.view.MainView;

public class RewardView extends JPanel{
	
	private JPanel Reward;
	private MainView mf;
	Player p;
	public RewardView(MainView mf, Player p) {
		this.Reward = this;
		this.mf = mf;
		this.p = p;
		//위치고정
		//this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		this.setBackground(new Color(0,0,0,0));
		
		
//		JPanel panel = new JPanel();
//		
//		panel.setLocation(0, 0);
//		panel.setSize(360, 640);
//		panel.setBackground(new Color(0,0,0,0));
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/GameOver3.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		label.setBackground(new Color(0, 0, 0, 0));
		//label.setLayout(null);
		
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\game\\TimeOverResult.png").getImage().getScaledInstance(245, 205, 0)));
		label.setBounds(50, 100, 245, 205);
		
		JButton button = new JButton(new ImageIcon(new ImageIcon("src\\image\\game\\Go Home.png").getImage().getScaledInstance(111, 32, 0)));
		button.setBounds(127,417,111,32);
		
		label.add(button);
		label.add(label2);
		//panel.add(label);
		this.add(label);
		mf.add(this);
		mf.revalidate();
		
	}

}
