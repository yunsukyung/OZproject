package com.kh.project.view.shop;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.view.MainView;

public class RewardView extends JPanel{
	
	private JPanel Reward;
	private MainView mf;
	
	public RewardView(MainView mf) {
		this.Reward = this;
		this.mf = mf;
		
		//위치고정
		
		this.setLocation(0, 0);
		this.setSize(360, 640);

		
		//배경
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 360 ,640);
		
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src\\image\\game\\Component 63.png").getImage().getScaledInstance(245, 205, 0)));
		label.setBounds(0, 0, 245, 205);
		
		JButton button = new JButton(new ImageIcon(new ImageIcon("src\\image\\game\\Component 64.png").getImage().getScaledInstance(111, 32, 0)));
		button.setBounds(127,417,111,32);
		
		label.add(label);
		this.add(label);
		this.add(button);
		mf.add(this);
		mf.revalidate();
		
	}

}
