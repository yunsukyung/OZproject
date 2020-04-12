package com.kh.project.view.shop;

import java.awt.Image;

import javax.swing.*;

import com.kh.project.view.MainView;

public class JvMasterView extends JPanel{
	private JPanel startPage;
	private MainView mf;

	public JvMasterView(MainView mf) {
		this.setLayout(null);
		this.setLocation(0, 0);
		this.setSize(360, 640);

		//배경
		Image background = new ImageIcon("src/image/start/편지배경.png").getImage().getScaledInstance(360, 640, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);


		//자바마스터의 편지
		Image JvMasterLetter = new ImageIcon("src\\image\\start\\자바마스터의 편지.png").getImage().getScaledInstance(618, 666, 0);
		JLabel label2 = new JLabel(new ImageIcon(JvMasterLetter));
		label2.setBounds(-129, 30, 618, 666);




		//유리병
		JButton letterBottle = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\편지병.png").getImage().getScaledInstance(33, 61, 0)));
		letterBottle.setBounds(46, 219, 33, 61);
		this.add(letterBottle);

		//버튼 틀?없애기
		letterBottle.setBorderPainted(false);
		letterBottle.setFocusPainted(false);
		letterBottle.setContentAreaFilled(false);


		this.add(label2);
		this.add(letterBottle);
		this.add(label);

	}
}