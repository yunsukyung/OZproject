package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.run.Run;

public class HowToPlayView extends JPanel{
	
	private MainView mf;
	private JPanel howtoplayview;
	Player p;
	InGameView iv;
	public static boolean playStart = false;
	public HowToPlayView(MainView mf, Player p) {
		this.mf = mf;
		this.howtoplayview = this;
		this.p = p;
		this.setLocation(0, 0);
		this.setSize(360, 640);
		iv = new InGameView(mf, p);
		Run.t2 = new Thread(iv);
		Run.t2.setDaemon(true);
		//튜토리얼 화면
	    JLabel background = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\게임방법.png").getImage().getScaledInstance(360, 640, 0)));
		background.setBounds(0, 0, 360, 640);
	    
		//back버튼추가
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setBounds(131, 530, 98, 35);
		background.add(backbutton);
		
		backbutton.addMouseListener(new MyMouseAdapter());

		background.add(backbutton, BorderLayout.CENTER);
		background.add(backbutton);
		this.add(background);
		
		mf.add(this);
		mf.revalidate();		
	}
	
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			
			Run.t2.start();
			InGameView.count = 0;
			InGameView.threadtimer = false;
			InGameView.timer = 3;
			ChangePanel.changePanel(mf, howtoplayview, iv);
		}
	}
}
