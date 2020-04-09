package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginView extends JPanel{
	
	public LoginView(JFrame mf) {
		this.setLocation(0, 0);
		this.setSize(370, 760);
		
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\jino0\\git\\OZproject\\src\\image\\start\\로그인 바탕.png").getImage().getScaledInstance(360, 640, 0)));
		
		
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\jino0\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(458, 458, 0)));
		label.setLocation(0, 0);
		label.setSize(360, 458);
		
		JLabel Id = new JLabel("ID");
		Id.setBounds(110, 135, 50, 50);
		JTextField Idtf = new JTextField(30);
		Idtf.setBounds(180, 150, 100, 20);
		
		JPasswordField password = new JPasswordField(30);
		JLabel pass = new JLabel("PW");
		pass.setBounds(110, 165, 80, 50);
		password.setBounds(180, 180, 100, 20);
		
		
		
		JButton button1 = new JButton("로그인");
		button1.setBounds(80, 220, 60, 20);
		JButton button2 = new JButton("회원가입");
		button2.setBounds(150, 220, 60, 20);
		JButton button3 = new JButton("아이디찾기");
		button3.setBounds(220, 220, 60, 20);
		
		
		
		
		label.add(Id);
		label.add(Idtf);
		label.add(pass);
		label.add(password);
		label.add(button1);
		label.add(button2);
		label.add(button3);
		
		background.add(label, BorderLayout.CENTER);
		this.add(background);
		
	}
}