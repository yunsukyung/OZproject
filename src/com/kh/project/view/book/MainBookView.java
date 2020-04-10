package com.kh.project.view.book;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainBookView extends JPanel{
	private JPanel startPage;
	private bohoonView mf;
	
	public MainBookView(bohoonView mf) {
		this.startPage = this;
		this.mf = mf;
		
		this.setLayout(null);
				
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\스토리 배경.jpg").getImage().getScaledInstance(360, 640, 0)));
		back.setBounds(0, 0, 360, 640);
		JLabel book = new JLabel(new ImageIcon(new ImageIcon("src\\image\\book\\book.PNG").getImage().getScaledInstance(292, 520, 0)));
		book.setBounds(30, 31, 292, 520);

		JButton bookbutton1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton1.setLayout(null);
		bookbutton1.setBounds(72, 179, 218, 52);

		JButton bookbutton2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼2_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton2.setLayout(null);
		bookbutton2.setBounds(72, 249, 218, 52);

		JButton bookbutton3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼3_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton3.setLayout(null);
		bookbutton3.setBounds(72, 316, 218, 52);

		JButton bookbutton4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼4_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton4.setLayout(null);
		bookbutton4.setBounds(72, 384, 218, 52);
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(130, 469, 98, 35);
		
		bookbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous();
				
			}
		});
		
		
		this.add(bookbutton1);
		this.add(bookbutton2);
		this.add(bookbutton3);
		this.add(bookbutton4);
		this.add(backbutton);
		this.add(book);
		this.add(back);
		
		
	}
}

class mous extends JFrame{
	
	public mous() {
		this.setBounds(57, 206, 245, 205);
		JPanel mo = new JPanel();
		mo.setLayout(null);
		JLabel pan = new JLabel(new ImageIcon(new ImageIcon("src\\image\\book\\판.png").getImage().getScaledInstance(245, 205, 0)));
		pan.setBounds(-5, 0, 245, 205);
		JLabel jin = new JLabel(new ImageIcon(new ImageIcon("src\\image\\book\\진주.png").getImage().getScaledInstance(116, 113, 0)));
		jin.setBounds(60, 20, 116, 113);
		
		JButton gohome = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\gohome버튼.png").getImage().getScaledInstance(98, 35, 0)));
		gohome.setLayout(null);
		gohome.setBounds(60, 160, 121, 32);
		gohome.setBorderPainted(false);
		gohome.setFocusPainted(false);
		gohome.setContentAreaFilled(false);
		
		JLabel garbagetong = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\garbagetong.png").getImage().getScaledInstance(25, 25, 0)));
		garbagetong.setBounds(80, 135, 25, 25);
		
		JLabel point = new JLabel("x  150");
		point.setBounds(110, 130, 50, 40);
		
		JLabel jin2 = new JLabel("진주 획득!!");
		jin2.setBounds(90, 30, 100, 40);
		jin2.setForeground(Color.WHITE);
		JLabel jin3 = new JLabel("x 2");
		jin3.setBounds(110, 50, 30, 40);
		jin3.setForeground(Color.WHITE);
		
		
		mo.add(jin2);
		mo.add(jin3);
		mo.add(garbagetong);
		mo.add(point);
		mo.add(gohome);
		mo.add(jin);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false);
		this.setSize(240,222);
		this.setVisible(true);
	}
}
