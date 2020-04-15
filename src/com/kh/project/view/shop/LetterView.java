package com.kh.project.view.shop;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.view.MainView;
import com.kh.project.*;

public class LetterView extends JPanel{
	private JPanel startPage;
	private MainView mf;
	Player p;

	public LetterView (MainView mf, Player p) {
		this.startPage = this;
		this.mf = mf;

		//위치고정 
		this.setLocation(0, 0);
		this.setSize(360, 640);

		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\진오에게 진호가.png").getImage().getScaledInstance(312, 313, 0)));
		label.setBounds(0, 0, 312, 313);
		label.setBackground(new Color(0, 0, 0, 0));

		JLabel LoveLetter = new JLabel("LOVE LETTER");
		LoveLetter.setBounds(75, 100, 240, 100);
		LoveLetter.setFont(new Font("Arial", Font.BOLD, 30));
		LoveLetter.setForeground(Color.WHITE);

		JButton button = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\back.png").getImage().getScaledInstance(111, 32, 0)));
		button.setBounds(127,417,111,32);

		label.add(LoveLetter);
		this.add(label);
		mf.add(this);
		mf.revalidate();

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


			}


	
	});

}

}

