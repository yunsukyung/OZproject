package com.kh.project.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MakeIdView2 extends JPanel{
	public MakeIdView2(JFrame mf) {
		this.setLayout(null);
		
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\시작 배경.png").getImage().getScaledInstance(370, 760, 0)));
		back.setBounds(0, -40, 370, 760);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(400, 400, 0)));
		label.setBounds(20, 103, 350, 350);
		
		JButton enter = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\enter.png").getImage().getScaledInstance(50, 20, 0)));
		enter.setLayout(null);
		enter.setBounds(170, 275, 50, 20);
		
		JLabel email = new JLabel("Email : ");
		email.setBounds(137, 175, 50, 50);
		JTextField tf = new JTextField(10);
		tf.setBounds(180, 190, 100, 20);
		
		JLabel name = new JLabel("NickName : ");
		name.setBounds(110, 205, 80, 50);
		JTextField tf2 = new JTextField(10);
		tf2.setBounds(180, 220, 100, 20);
		
		JLabel phon = new JLabel("PhoneNumber : ");
		phon.setBounds(86, 235, 100, 50);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(180, 250, 100, 20);
		
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		

		
		this.add(email);
		this.add(tf);
		this.add(name);
		this.add(tf2);
		this.add(phon);
		this.add(tf3);
		this.add(enter);
		this.add(label);
		this.add(back);
		
	}

}
