package com.kh.project.view.shop;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.model.vo.Player;
import com.kh.project.view.MainView;

public class EPSView extends JPanel{
	
	private JPanel buypearl;
	private MainView mf;
	private Player p;
	
	public EPSView(MainView mf, Player p) {
		this.buypearl = this;
		this.mf = mf;
		this.p = p;
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		//상점 레이어 1
		JLabel label1 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 15.png").getImage()));
		label1.setBounds(34, 50, 300, 540);
		
		//상점 레이어 2
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 17.png").getImage()));
		label2.setBounds(39, 60, 292, 520);
		
		//상점 레이어 3
		JLabel label3 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 16.png").getImage()));
		label3.setBounds(39, 100, 292, 100);
		
		//상점 레이어 4
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 32.png").getImage()));
		label4.setBounds(35, 160, 300, 300);
		
		//상점 레이어 5
		JLabel label5 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/winter.png").getImage().getScaledInstance(155, 155, 0)));
		label5.setBounds(35, 160, 300, 300);
		
		//상점 레이어 6 (모래시계 작은아이콘)
		JLabel label6 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/hourglass 2.png").getImage()));
		label6.setBounds(140, 400, 18, 18);
		
		
		//상점 레이어 7
		JLabel label7 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 29.png").getImage()));
		label7.setBounds(133, 490, 100, 50);
		
		//상점 레이어 8
		JLabel label8 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Component 6.png").getImage()));
		label8.setBounds(118, 425, 130, 70);
		
		//상점 레이어 9 (쓰레기통 작은아이콘)
		JLabel label9 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/garbagetong.png").getImage().getScaledInstance(25, 25, 0)));
		label9.setBounds(220, 400, 18, 18);
		
		
		//앞으로
		JButton button1 = new JButton(new ImageIcon(new ImageIcon("src/image/start/left.png").getImage().getScaledInstance(30, 30, 0)));
		button1.setBounds(75, 310, 30, 30);
		
		//뒤로
		JButton button2 = new JButton(new ImageIcon(new ImageIcon("src/image/start/right.png").getImage().getScaledInstance(30, 30, 0)));
		button2.setBounds(265, 310, 30, 30);
		
		//광고
		JButton button3 = new JButton(new ImageIcon(new ImageIcon("src/image/start/Component 2.png").getImage().getScaledInstance(360, 63, 0)));
		button3.setBounds(0, 577, 360, 63);
		
		
		//SHOP 텍스트
		JLabel shop = new JLabel("SHOP");
		shop.setBounds(130, 100, 150, 100);
		JTextField tf1 = new JTextField(50);
		tf1.setBounds(0, 0, 150, 100);
		
		//상품 기능 텍스트
		JLabel pearl = new JLabel("1 min X 1");
		pearl.setBounds(160, 400, 100, 17);
		JTextField tf2 = new JTextField(10);
		tf2.setBounds(50, 50, 50, 50);
		
		//물물교환 텍스트
		JLabel money = new JLabel("500");
		money.setBounds(200, 435, 50, 50);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(50, 50, 50, 50);
		
		//back 텍스트
		JLabel back = new JLabel("Back");
		back.setBounds(160, 485, 50, 50);
		JTextField tf4 = new JTextField(10);
		tf4.setBounds(50, 50, 50, 50);
		
		
		
		shop.setFont(new Font("Arial", Font.BOLD, 40));
		back.setFont(new Font("Arial", Font.BOLD, 20));
		
		//닉네임 간판
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		
		//설정
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);

		//상점
		button3.setBorderPainted(false);
		button3.setFocusPainted(false);
		button3.setContentAreaFilled(false);
		
		
		this.add(shop);		//SHOP 텍스트
		this.add(pearl);		//진주 텍스트
		this.add(money);		//진주 텍스트
		this.add(back);		//BACK 텍스트
		this.add(button1);		//진주 텍스트
		this.add(button2);		//진주 텍스트
		this.add(button3);		//진주 텍스트
		
		
		this.add(label9);		//배경
		this.add(label8);		//배경
		this.add(label7);		//배경
		this.add(label6);		//배경
		this.add(label5);		//배경
		this.add(label4);		//배경
		this.add(label3);		//배경
		this.add(label2);		//배경
		this.add(label1);		//배경
		this.add(label);		//배경
		mf.add(this);
	}
	
	
	
}