package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.*;

import com.kh.project.view.MainView;

public class LoveLetterView extends JPanel{
	private JPanel startPage;
	private MainView mf;
	
	public LoveLetterView(MainView mf) {
		//위치고정
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//배경
		Image background = new ImageIcon("src/image/start/편지배경.png").getImage().getScaledInstance(360, 640, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		//연애편지
		Image loveLetter = new ImageIcon("src\\image\\start\\진오에게 진호가.png").getImage().getScaledInstance(312, 313, 0);
		JLabel label2 = new JLabel(new ImageIcon(loveLetter));
		label2.setBounds(28, 204, 312, 313);
		
		//유리병
		JButton letterBottle = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\편지병.png").getImage().getScaledInstance(33, 61, 0)));
		letterBottle.setBounds(46, 219, 33, 61);
		this.add(letterBottle);
		
		//버튼 틀?없애기
		letterBottle.setBorderPainted(false);
		letterBottle.setFocusPainted(false);
		letterBottle.setContentAreaFilled(false);
		
		
		
		this.add(label2);		//러브레터
		this.add(letterBottle);	//유리병
		this.add(label);		//배경화면
		
	}

}
