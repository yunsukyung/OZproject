package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.model.dao.PlayerDao;
import com.kh.project.run.Run;
import com.kh.project.view.ChangePanel;
import com.kh.project.view.HomeView;
import com.kh.project.view.MainView;

public class GemeOverView extends JPanel{
	private JPanel startPage;
	private MainView mf;
	Player p = new Player();
	
	public GemeOverView(MainView mf, Player p, int countGarbage) {
		this.startPage = this;
		this.mf = mf;
		this.p = p;
		//위치고정 
	
		this.setLocation(0, 0);
		this.setSize(360, 640);

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/GameOver2.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		label.setBackground(new Color(0, 0, 0, 0));
		
		JLabel TimeOver = new JLabel("G A M E O V E R");
		TimeOver.setBounds(70, 100, 240, 100);
		TimeOver.setFont(new Font("Arial", Font.BOLD, 30));
		TimeOver.setForeground(Color.WHITE);
		
		//label.addMouseListener(new MyMouseAdapter());
		JLabel trash = new JLabel(Integer.toString(countGarbage));
		trash.setBounds(225, 278, 100, 25);

		JLabel label3 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/GameOver3.png").getImage().getScaledInstance(360, 640, 0)));
		label.setBounds(0, 0, 360, 640);
		label.setBackground(new Color(0, 0, 0, 0));
		//label.setLayout(null);
		
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src/image/game/Component 64.png").getImage().getScaledInstance(245, 205, 0)));
		label.setBounds(0, 0, 245, 205);
		
		JButton button2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\game\\GameOver1.png").getImage().getScaledInstance(245, 205, 0)));
		button2.setBounds(60,200,240,190);
		JButton button = new JButton(new ImageIcon(new ImageIcon("src/image/game/Go Home.png").getImage().getScaledInstance(111, 32, 0)));
		button.setBounds(127,417,111,32);
		
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setDefaultCapable(false);
		
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setDefaultCapable(false);
		
		label.add(trash);
		
		label.add(button2);
		label.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, startPage, new HomeView(mf, p));
//				MiniGameView = false;
				
			}
		});
		
		label.add(TimeOver);
		
		this.add(label);
		
		mf.add(this);
		mf.revalidate();

		
	}

}
