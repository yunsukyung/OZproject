package com.kh.project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MakeIdView extends JPanel{	
	
	public MakeIdView(JFrame mf) {
		
		this.setLayout(null);
		
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\user2\\git\\OZproject\\src\\image\\start\\시작 배경.png").getImage().getScaledInstance(370, 760, 0)));
		back.setBounds(0, -40, 370, 760);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\user2\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(400, 400, 0)));
		label.setBounds(20, 103, 350, 350);
		
		JButton next = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\user2\\git\\OZproject\\src\\image\\start\\next.png").getImage().getScaledInstance(50, 20, 0)));
		next.setLayout(null);
		next.setBounds(170, 275, 50, 20);

		
		JLabel id = new JLabel("ID : ");
		id.setBounds(157, 175, 50, 50);
		JTextField tf = new JTextField(10);
		tf.setBounds(180, 190, 100, 20);
		
		JLabel pwd = new JLabel("pass : ");
		pwd.setBounds(140, 205, 50, 50);
		JPasswordField tf2 = new JPasswordField(10);
		tf2.setBounds(180, 220, 100, 20);
		
		JLabel passcheck = new JLabel("passcheck : ");
		passcheck.setBounds(105, 235, 80, 50);
		JPasswordField tf3 = new JPasswordField(10);
		tf3.setBounds(180, 250, 100, 20);
		
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MakeIdView2(mf);
				System.out.println("112");
			}
		});
		
		this.add(id);
		this.add(tf);
		this.add(pwd);
		this.add(tf2);
		this.add(passcheck);
		this.add(tf3);
		
		this.add(next);
		this.add(label);
		this.add(back);
		
	}
}
