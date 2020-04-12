package com.kh.project.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;
import com.kh.project.view.shop.MainShopView;

//!!!!메인뷰에 this.add(new HomeView(this)); 이거 추가해야 빨간 줄 사라짐!!!!


public class HomeView extends JPanel implements Runnable {
	private JPanel homeView;
	private MainView mf;
	
	LoginManager lm = new LoginManager();
	Player p = new Player();
	ReduceSatiety rs = new ReduceSatiety(mf);
	
	JLabel labelrs;
	JLabel label;
	JLabel gameover;
	JLabel top;
	public HomeView(MainView mf) {
		this.homeView = this;
		this.mf = mf;
		
		//위치 초기화
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		top = new JLabel();
		top.setBounds(100, 300, 100, 50);
		
		//닉네임 간판
		JButton button1 = new JButton(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(129, 148, 0)));
		button1.setBounds(45, 110, 129, 148);
		
		//설정
		JButton button2 = new JButton(new ImageIcon(new ImageIcon("src/image/start/settings.png").getImage().getScaledInstance(36, 36, 0)));
		button2.setBounds(310, 20, 36, 36);
		
		//상점
		JButton button3 = new JButton(new ImageIcon(new ImageIcon("src/image/start/shopping-store (1).png").getImage().getScaledInstance(36, 36, 0)));
		button3.setBounds(310, 65, 36, 36);
		
		//책(업적)
		JButton button4 = new JButton(new ImageIcon(new ImageIcon("src/image/start/Rectangle 83.png").getImage().getScaledInstance(36, 36, 0)));
		button4.setBounds(310, 110, 36, 36);
		
		//광고
		JButton button5 = new JButton(new ImageIcon(new ImageIcon("src/image/start/Component 2.png").getImage().getScaledInstance(360, 63, 0)));
		button5.setBounds(0, 577, 360, 63);
		
		//이글루
		JButton button6 = new JButton(new ImageIcon(new ImageIcon("src/image/start/igloo (1).png").getImage().getScaledInstance(161, 161, 0)));
		button6.setBounds(30, 185, 161, 161);
		
		//펭즈
		JButton button7 = new JButton(new ImageIcon(new ImageIcon("src/image/start/pengz2.png.png").getImage().getScaledInstance(232, 320, 0)));
		button7.setBounds(100, 210, 235, 224);
		
		//쏘주
		JButton button8 = new JButton(new ImageIcon(new ImageIcon("src/image/start/soju1.png").getImage().getScaledInstance(90, 100, 0)));
		button8.setBounds(60, 400, 60, 100);
		
		
		//쓰레기 현황
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/trash.png").getImage().getScaledInstance(25, 25, 0)));
		label2.setBounds(20, 35, 25, 25);
		
		//진주 현황
		JLabel label3 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(25, 25, 0)));
		label3.setBounds(20, 60, 25, 25);
		
		//하트
		JLabel label1 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/heartbeat.png").getImage().getScaledInstance(25, 25, 0)));
		label1.setBounds(20, 10, 25, 25);
		
		//포만감 현황 배경
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 80.png").getImage().getScaledInstance(236, 12, 0)));
		label4.setBounds(23, 15, 236, 12);
		
		//포만감 감소
//		labelrs = new JLabel();
		labelrs = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 81.png").getImage().getScaledInstance(236, 12, 0)));
		labelrs.setBounds(23, 15, 236, 12);

		
		//쓰레기 텍스트
		JLabel trash = new JLabel(Integer.toString(p.getGarbage()));
		trash.setBounds(55, 35, 100, 25);
		JTextField tf1 = new JTextField(10);
		tf1.setBounds(70, 50, 100, 30);
		
		//진주 텍스트
		JLabel pearl = new JLabel(Integer.toString(p.getPearl()));
		pearl.setBounds(55, 60, 100, 25);
//		JTextField tf2 = new JTextField(10);
//		tf2.setBounds(70, 80, 100, 30);
		
		//닉네임 텍스트
		JLabel id = new JLabel(p.getUserName());
		id.setBounds(89, 159, 100, 25);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(70, 80, 100, 30);
		
		//gameover 텍스트
		gameover = new JLabel("Game Over");
		gameover.setBounds(100, 300, 100, 50);
//		JTextField tf4 = new JTextField(10);
//		tf4.setBounds(400, 300, 100, 30);
		
		gameover.setFont(new Font("Ariel", Font.BOLD, 20));
		
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
		
		//책
		button4.setBorderPainted(false);
		button4.setFocusPainted(false);
		button4.setContentAreaFilled(false);
		
		//광고
		button5.setBorderPainted(false);
		button5.setFocusPainted(false);
		button5.setContentAreaFilled(false);
		
		//이글루
		button6.setBorderPainted(false);
		button6.setFocusPainted(false);
		button6.setContentAreaFilled(false);
		
		//펭즈
		button7.setBorderPainted(false);
		button7.setFocusPainted(false);
		button7.setContentAreaFilled(false);
		
		//쏘주
		button8.setBorderPainted(false);
		button8.setFocusPainted(false);
		button8.setContentAreaFilled(false);
		
		//닉네임 간판
		button1.addActionListener(new Listener1());
		//설정
		button2.addMouseListener(new MyMouseAdapter2());
		//상점
		button3.addMouseListener(new MyMouseAdapter3());
		//책(업적)
		button4.addMouseListener(new MyMouseAdapter4());
		//광고
		button5.addMouseListener(new MyMouseAdapter5());
		//소주(게임)
		button8.addMouseListener(new MyMouseAdapter6());
		
		//포만감 감소
//		label5.addMouseListener(new MyMouseAdapter9());
		
		
		this.add(button7);		//펭즈
		label.add(id);			//닉네임 텍스트
		label.add(button2);		//설정
		label.add(button3);		//상점
		label.add(button4);		//책(업적)
		label.add(button5);		//광고
		label.add(button8);		//쏘주(게임)
		label.add(label1);		//하트
		label.add(label2);		//쓰레기
		label.add(label3);		//진주
		label.add(labelrs);		//포만감 감소
//		this.add(label4);		//포만감 배경
		label.add(trash);		//쓰레기 텍스트
		label.add(pearl);		//진주 텍스트
		this.add(button1);		//닉네임 간판
		this.add(button6);		//이글루
		
		this.add(label);		//배경
		mf.add(this);
		mf.repaint();
	}
	
	//닉네임 간판
	//텍스트로 바꾸기
	class Listener1 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			lm.SearchId(getName(), null, null);
			// TODO Auto-generated method stub
			
		}
	}
	
	//설정
	class MyMouseAdapter2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel1.changePanel(mf, homeView, new ConfigurationView(mf));
		}
	}
	
	//상점
	class MyMouseAdapter3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, homeView, new MainShopView(mf));
		}
	}
	
	//업적
	class MyMouseAdapter4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel1.changePanel(mf, homeView, new MainBookView(mf));
		}
	}
	
	//광고
	class MyMouseAdapter5 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel1.changePanel(mf, homeView, new View(mf));
		}
	}
	
	//소주 게임
	class MyMouseAdapter6 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel1.changePanel(mf, homeView, new InGameView(mf));
		}
	}
	
	//포만감 감소
	class MyMouseAdapter9 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getSatiety() <= 0) {
				ChangePanel.changePanel(mf, homeView, new GameOverView(mf));
			}
		}
	}

	@Override
	public void run() {
		int maxHp = p.getSatiety();
		
		while(true) {
			if(maxHp < 0) {
				break;
			}
			maxHp -= 30;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			labelrs.setBounds(23, 15, maxHp, 12);
			label.add(labelrs);
			label.repaint();
			System.out.println(labelrs.getSize());
			
		}
		gameover.setBounds(100, 300, 100, 50);
		top.add(gameover);
		System.out.println("gameover");
	}
	
	

}
