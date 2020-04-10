package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.kh.project.view.*;

public class MainShopView extends JPanel{
	private JPanel startPage;
	private MainView mf;
	
	public MainShopView(MainView mf) {
		this.startPage = this;
		this.mf = mf;
		
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		Image background = new ImageIcon("src/image/start/ShopMain.png").getImage().getScaledInstance(360, 640, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		JButton robButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/rod.png").getImage().getScaledInstance(100, 100, 0)));
		robButton.setBounds(72, 188, 100, 100);
		
		JButton foodButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/fish.png").getImage().getScaledInstance(100, 100, 0)));
		foodButton.setBounds(183, 188, 100, 100);
		
		JButton epsButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/eps.png").getImage().getScaledInstance(100, 100, 0)));
		epsButton.setBounds(183, 298, 100, 100);
		
		JButton hatButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/hat.png").getImage().getScaledInstance(100, 100, 0)));
		hatButton.setBounds(72, 298, 100, 100);
		
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setBounds(131, 450, 98, 35);
		
		
		
		this.add(robButton);
		this.add(foodButton);
		this.add(epsButton);
		this.add(hatButton);
		label.add(backButton,BorderLayout.CENTER);
		this.add(backButton);
		
		this.add(label);
		mf.add(this);
	}
	
}
