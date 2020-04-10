package com.kh.project.view.book;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainBookView extends JPanel{
	
	
	public MainBookView(JFrame mf) {
		this.setLayout(null);
				
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\스토리 배경.jpg").getImage().getScaledInstance(360, 640, 0)));
		back.setBounds(0, 0, 360, 640);
		JLabel book = new JLabel(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\book\\book.PNG").getImage().getScaledInstance(292, 520, 0)));
		book.setBounds(30, 31, 292, 520);

		JButton bookbutton1 = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\book\\업적버튼.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton1.setLayout(null);
		bookbutton1.setBounds(72, 179, 218, 52);

		JButton bookbutton2 = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\book\\업적버튼2_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton1.setLayout(null);
		bookbutton2.setBounds(72, 249, 218, 52);

		JButton bookbutton3 = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\book\\업적버튼3_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton1.setLayout(null);
		bookbutton3.setBounds(72, 316, 218, 52);

		JButton bookbutton4 = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\book\\업적버튼4_1.PNG").getImage().getScaledInstance(218, 52, 0)));
		bookbutton1.setLayout(null);
		bookbutton4.setBounds(72, 384, 218, 52);
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("C:\\Users\\보훈\\git\\OZproject\\src\\image\\start\\back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(130, 469, 98, 35);
		

		this.add(bookbutton1);
		this.add(bookbutton2);
		this.add(bookbutton3);
		this.add(bookbutton4);
		this.add(backbutton);
		this.add(book);
		this.add(back);
		
		
	}
}
