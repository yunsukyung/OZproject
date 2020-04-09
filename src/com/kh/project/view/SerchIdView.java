package com.kh.project.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SerchIdView extends JPanel{

	public SerchIdView(JFrame mf) {
		this.setLayout(null);
		
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\시작 배경.png").getImage().getScaledInstance(370, 760, 0)));
		back.setBounds(0, -40, 370, 760);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\로그인간판.png").getImage().getScaledInstance(400, 400, 0)));
		label.setBounds(20, 103, 350, 350);
		
		JButton next = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\enter.png").getImage().getScaledInstance(50, 20, 0)));
		next.setLayout(null);
		next.setBounds(170, 275, 50, 20);
		
		JLabel id = new JLabel("Email : ");
		id.setBounds(137, 175, 50, 50);
		JTextField tf = new JTextField(10);
		tf.setBounds(180, 190, 100, 20);
		
		JLabel pwd = new JLabel("NickName : ");
		pwd.setBounds(110, 205, 80, 50);
		JTextField tf2 = new JTextField(10);
		tf2.setBounds(180, 220, 100, 20);
		
		JLabel passcheck = new JLabel("PhoneNumber : ");
		passcheck.setBounds(86, 235, 100, 50);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(180, 250, 100, 20);

		
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
