package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;



public class StartView extends JPanel {
	private JPanel startPage;
	private MainView mf;

	public StartView(MainView mf) {
		this.startPage = this;
		this.mf = mf;

		this.setLocation(0, 0);
		this.setSize(360, 640);
		Image background = new ImageIcon("src/image/start/시작 배경.png").getImage().getScaledInstance(360, 640, 0);

		JLabel label = new JLabel(new ImageIcon(background));


		JLabel OZ = new JLabel("      O  Z  의");
		OZ.setBounds(28, 57, 240, 100);
		JTextField tf1 = new JTextField(100);
		tf1.setBounds(0, 0, 300, 100);
		OZ.setFont(new Font("궁서체", Font.BOLD, 30));
		OZ.setBackground(new Color(255,0,0));
		OZ.setForeground(Color.WHITE);
		
		JLabel OZ1 = new JLabel("       펭 귄");
		OZ1.setBounds(28, 57, 240, 300);
		JTextField tf2 = new JTextField(100);
		tf1.setBounds(0, 0, 300, 300);
		OZ1.setFont(new Font("궁서체", Font.BOLD, 30));
		OZ1.setBackground(new Color(255,0,0));
		OZ1.setForeground(Color.WHITE);
	

		JButton button = new JButton(new ImageIcon(new ImageIcon("src/image/start/start2.png").getImage().getScaledInstance(180, 70, 0)));
		button.setLocation(100, 300);
		button.setSize(180, 70);


		button.addMouseListener(new MyMouseAdapter());


		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);

		label.add(button, BorderLayout.CENTER);
		this.add(label, BorderLayout.CENTER);
		label.add(OZ);
		label.add(OZ1);
		mf.add(this);
		mf.revalidate();

	}

	class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, startPage, new LoginView(mf));
		}
	}


}

