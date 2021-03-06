package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.model.vo.Player;
import com.kh.project.view.ChangePanel;
import com.kh.project.view.HomeView;
import com.kh.project.view.MainView;

public class PaymentView extends JDialog{
	private JDialog startPage;
	private MainView mf;
	Player p;
	int pearl = 0;
	int money = 0;

	public PaymentView (MainView mf, Player p, int pearl, int money) {
		this.startPage = this;
		this.mf = mf;
		this.p = p;
		this.pearl = pearl;
		this.money = money;
		
		
		
		//위치
		this.setLocation(0, 0);
		this.setSize(317, 378);
		this.setVisible(true);
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
		String pe = Integer.toString(pearl);
		JLabel PearlNumber = new JLabel(pe);
		PearlNumber.setBounds(203, 46, 216, 35);
		JTextField tf2 = new JTextField(100);
		tf2.setBounds(0, 0, 216, 35);
		
		PearlNumber.setFont(new Font("바탕체", Font.BOLD, 18));
		PearlNumber.setBackground(new Color(255,0,0));
		PearlNumber.setForeground(Color.WHITE);
		
		//결제가격 텍스트
		String mo = Integer.toString(money);
		JLabel Price = new JLabel(mo);
		Price.setBounds(236, 130, 72, 35);
		JTextField tf3 = new JTextField(100);
		tf3.setBounds(0, 0, 72, 35);
		
		Price.setFont(new Font("바탕체", Font.BOLD, 18));
		Price.setBackground(new Color(255,0,0));
		Price.setForeground(Color.WHITE);
		
		//지문버튼 
		JButton button = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\결제버튼.png").getImage().getScaledInstance(57, 57, 0)));
		button.setLocation(130, 200);
		button.setSize(57, 57);
		
		button.addMouseListener(new MyMouseAdapter());
		
		
		//버튼 투명하게하기
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);


		this.add(label);
		label.add(button); 
		label.add(Cancel);
		label.add(PearlNumber);
		label.add(Price);

	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			JDialog buy = new JDialog(mf, "구매성공!");
			buy.setVisible(true);
			buy.setBounds(120, 250, 200, 200);

			JLabel ok = new JLabel("진주를 구매하였습니다!");
			ok.setBounds(10, 30, 150, 50);

			JButton button = new JButton("확인");
			button.setBounds(0, 100, 150, 50);
			buy.add(button, BorderLayout.SOUTH);
			buy.add(ok);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					buy.dispose();
//					Player.pearl = p.getPearl() + pearl;
//					System.out.println(Player.pearl);
//					HomeView.pearl.repaint();
//					HomeView.bg_l.add(HomeView.pearl);
					p.setMyPearl(p.getMyPearl() + pearl);
					HomeView.pearl = HomeView.pearl + pearl;
					
					System.out.println(p.getMyPearl());
					System.out.println(HomeView.pearl);
					
					new PaymentView(mf, p, pearl, money).dispose();
					
					ChangePanel.change(mf, buy, new HomeView(mf, p , 0 ,pearl));
					
				}
			});
			
		}
	}

}
