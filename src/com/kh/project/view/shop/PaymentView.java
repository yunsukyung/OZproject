package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.view.MainView;

public class PaymentView extends JPanel{
	private JPanel startPage;
	private MainView mf;

	public PaymentView (MainView mf) {
		this.startPage = this;
		this.mf = mf;
		
		//위치
		this.setLocation(0, 0);
		this.setSize(307, 358);
		//진주결제창 
		Image background = new ImageIcon("src\\image\\start\\진주결체장1.png").getImage().getScaledInstance(307, 358, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		
		//취소 텍스트
		JLabel Cancel = new JLabel("취 소");
		Cancel.setBounds(243, 0, 110, 44);
		JTextField tf1 = new JTextField(100);
		tf1.setBounds(0, 0, 150, 24);

		Cancel.setFont(new Font("바탕체", Font.BOLD, 18));
		Cancel.setBackground(new Color(255,0,0));
		Cancel.setForeground(Color.WHITE);
		
		//진주 구매갯수 텍스트
		JLabel PearlNumber = new JLabel("120");
		PearlNumber.setBounds(205, 56, 216, 35);
		JTextField tf2 = new JTextField(100);
		tf2.setBounds(0, 0, 216, 35);
		
		PearlNumber.setFont(new Font("바탕체", Font.BOLD, 18));
		PearlNumber.setBackground(new Color(255,0,0));
		PearlNumber.setForeground(Color.WHITE);
		
		//결제가격 텍스트
		JLabel Price = new JLabel("10,000");
		Price.setBounds(246, 140, 72, 35);
		JTextField tf3 = new JTextField(100);
		tf3.setBounds(0, 0, 72, 35);
		
		Price.setFont(new Font("바탕체", Font.BOLD, 18));
		Price.setBackground(new Color(255,0,0));
		Price.setForeground(Color.WHITE);
		
		//지문버튼 
		JButton button = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\결제버튼.png").getImage().getScaledInstance(57, 57, 0)));
		button.setLocation(130, 200);
		button.setSize(57, 57);
		
		
		//버튼 투명하게하기
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);


		this.add(label, BorderLayout.CENTER);
		label.add(button, BorderLayout.CENTER); 
		label.add(Cancel);
		label.add(PearlNumber);
		label.add(Price);
		mf.add(this);
		mf.revalidate();
	}

}
