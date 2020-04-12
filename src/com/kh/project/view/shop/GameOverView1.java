package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

import com.kh.project.view.MainView;

public class GameOverView1 extends JPanel{
	private JPanel startPage;
	private MainView mf;

	public GameOverView1(MainView mf) {
		this.startPage = this;
		this.mf = mf;

		//위치고정 


		this.setLocation(0, 0);
		this.setSize(360, 640);

		//배경

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 360, 640);
		this.setBackground(new Color(0, 0, 0, 0));    //패널 투명

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\GameOver2.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		label.setBackground(new Color(0, 0, 0, 0));
		
		JLabel GameOver = new JLabel("G A M E O V E R");
		GameOver.setBounds(90, 250, 240, 100);
		JTextField tf1 = new JTextField(100);
		tf1.setBounds(0, 0, 300, 300);
		GameOver.setFont(new Font("Arial", Font.BOLD, 20));
		JLabel GameOver1 = new JLabel("색변경");
		GameOver.setForeground(Color.WHITE);
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\바다속gameover.png").getImage().getScaledInstance(360, 640, 0)));
		label2.setBounds(0, 0, 360, 640);
		




		label.add(GameOver);
		this.add(label);
		this.add(label);
		mf.add(this);
		mf.revalidate();


	}

}
