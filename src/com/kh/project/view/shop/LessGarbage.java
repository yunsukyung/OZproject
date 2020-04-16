package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.view.ChangePanel;
import com.kh.project.view.HomeView;
import com.kh.project.view.MainView;
import com.kh.project.view.book.MainBookView;

public class LessGarbage extends JPanel{
	Player p;
	private MainView mf;
	private JPanel lessGarbage;
	public LessGarbage(MainView mf, Player p) {
		this.mf = mf;
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		this.p = p;
		//쓰레기수집배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src/image/start/쓰레기 수집1.png").getImage().getScaledInstance(360, 640, 0)));
		background.setBounds(0, 0, 360, 640);
		
		//쓰레기 수집하러가기 버튼
		JButton garbageButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\쓰레기수집하기 2.png").getImage().getScaledInstance(100, 35, 0)));
		garbageButton.setBounds(131, 340, 100, 35);
		background.add(garbageButton);
		garbageButton.setLayout(null);
		
		garbageButton.addMouseListener(new MyMouseAdapter());
		
		//back버튼 
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setBounds(131, 450 ,98,35);
		background.add(backButton);
		
		backButton.addMouseListener(new MyMouseAdapter2());
		
		background.add(garbageButton, BorderLayout.CENTER);
		this.add(garbageButton);
		this.add(background);
		
	
		
		
	}
	
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, lessGarbage, new HomeView(mf, p));
		}
	}
	class MyMouseAdapter2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, lessGarbage, new HomeView(mf, p));
		}
	}
	
	
}
