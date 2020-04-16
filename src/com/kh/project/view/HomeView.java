package com.kh.project.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.I_Eps2;
import com.kh.project.model.vo.Player;
import com.kh.project.run.Run;
import com.kh.project.view.book.MainBookView;
import com.kh.project.view.shop.MainShopView;
import com.kh.project.view.shop.StageView;
import com.kh.project.view.shop.TimeOverView1;

//!!!!메인뷰에 this.add(new HomeView(this)); 이거 추가해야 빨간 줄 사라짐!!!!


public class HomeView extends JPanel implements Runnable {
	private JPanel homeView;
	private MainView mf;
	boolean f = false;
	LoginManager lm = new LoginManager();
	Player p;
	public static int garbage;
	public static int pearl;
	//ReduceSatiety rs = new ReduceSatiety(mf);
	public static JLabel labelrs = new JLabel();
	public static JLabel bg_l = new JLabel();
	public static JLabel gameover = new JLabel();
	public static JLabel top_l = new JLabel();
	public static JButton restart = new JButton();
	public static JButton restart2 = new JButton();
	public static JLabel re_text = new JLabel();
	public static JButton soju_b = new JButton();
	public static int maxHp = 236;
	public static boolean stop = false;
	public static boolean bl = false;
	public static JLabel jPearl = new JLabel(); 
	public static JLabel jTrash = new JLabel(); 
	public static JButton eps1_b;
	public static JButton eps2_b;
	public static JButton eps3_b;
	public static JButton eps4_b;
	public static boolean eps1bl = false;
	public static boolean eps2bl = false;
	public static boolean eps3bl = false;
	public static boolean eps4bl = false;
	Thread tt = new Thread(new I_Eps2());
	
	public HomeView() {}
	public HomeView(MainView mf, Player p) {
		this.homeView = this;
		this.mf = mf;
		this.p = p;
		//위치 초기화
		this.setLayout(null);

		this.setLocation(0, 0);
		this.setSize(360, 640);
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		bg_l = new JLabel(new ImageIcon(background));
		bg_l.setBounds(0, 0, 360, 640);

		top_l = new JLabel();
		top_l.setBounds(0, 0, 360, 640);

		MusicPlayer.MusicStart("src\\com\\kh\\project\\bgm\\로딩-코크타운_1.wav");

		//닉네임 간판
		JButton nickname_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(129, 148, 0)));
		nickname_b.setBounds(45, 110, 129, 148);

		//설정
		JButton setting_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/settings.png").getImage().getScaledInstance(36, 36, 0)));
		setting_b.setBounds(310, 20, 36, 36);

		//상점
		JButton shop_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/shopping-store (1).png").getImage().getScaledInstance(36, 36, 0)));
		shop_b.setBounds(310, 65, 36, 36);

		//책(업적)
		JButton book_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/Rectangle 83.png").getImage().getScaledInstance(36, 36, 0)));
		book_b.setBounds(310, 110, 36, 36);

		//광고
		JButton ads_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/Component 2.png").getImage().getScaledInstance(360, 63, 0)));
		ads_b.setBounds(0, 577, 360, 63);

		//이글루
		JButton igloo_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/igloo (1).png").getImage().getScaledInstance(161, 161, 0)));
		igloo_b.setBounds(30, 185, 161, 161);

		//펭즈
		JButton button7 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\메인펭귄.gif").getImage().getScaledInstance(100, 100, 0)));
		button7.setBounds(100, 300, 150, 100);

		//쏘주
		soju_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/soju1.png").getImage().getScaledInstance(90, 100, 0)));
		soju_b.setBounds(60, 400, 60, 100);

		//재시작 버튼
		restart = new JButton(new ImageIcon(new ImageIcon("src/image/start/refresh.png").getImage().getScaledInstance(50, 50, 0)));
		restart.setBounds(100, 500, 50, 50);

		//재시작 텍스트 버튼
		restart2 = new JButton(new ImageIcon(new ImageIcon("src/image/start/Rectangle 35.png").getImage().getScaledInstance(140, 40, 0)));
		restart2.setBounds(120, 510, 140, 40);

		//나무
		eps1_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/winter.png").getImage().getScaledInstance(40, 40, 0)));
		eps1_b.setLayout(null);
		p.setEps1(eps1bl);
		if(p.isEps1()) {
			eps1_b.setBounds(310, 155, 40, 40);
//			tt.start();
		} else {
			eps1_b.setBounds(3100, 1550, 40, 40);
		}
		
		
		//풍력
		eps2_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/풍차.png").getImage().getScaledInstance(40, 40, 0)));
		eps2_b.setLayout(null);
		p.setEps2(eps2bl);
		if(p.isEps2()) {
			eps2_b.setBounds(310, 205, 40, 40);
//			tt.start();
		} else {
			eps2_b.setBounds(3100, 1550, 40, 40);
		}
		
		
		
		//태양열
		eps3_b = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\태양열.png").getImage().getScaledInstance(40, 40, 0)));
		eps3_b.setLayout(null);
		p.setEps3(eps3bl);
		if(p.isEps3()) {
			eps3_b.setBounds(310, 255, 40, 40);
//			tt.start();
		} else {
			eps3_b.setBounds(3100, 1550, 40, 40);
		}

		//지구
		eps4_b = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\earth.png").getImage().getScaledInstance(300, 300, 0)));
		eps4_b.setLayout(null);
		p.setEps3(eps4bl);
		if(p.isEps3()) {
			eps4_b.setBounds(30, 100, 300, 300);
			
			eps4_b.addMouseListener(new EndingMouse());
			
//			tt.start();
		} else {
			eps4_b.setBounds(3100, 1550, 200, 200);
		}

		//쓰레기 현황
		JLabel garbage_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/trash.png").getImage().getScaledInstance(25, 25, 0)));
		garbage_l.setBounds(20, 35, 25, 25);

		//진주 현황
		JLabel pearl_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(25, 25, 0)));
		pearl_l.setBounds(20, 60, 25, 25);

		//하트
		JLabel heart_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/heartbeat.png").getImage().getScaledInstance(25, 25, 0)));
		heart_l.setBounds(20, 10, 25, 25);

		//포만감 현황 배경
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 80.png").getImage().getScaledInstance(236, 12, 0)));
		label4.setBounds(23, 15, 236, 12);

		//포만감 감소
		//		labelrs = new JLabel();
		labelrs = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 81.png").getImage().getScaledInstance(236, 12, 0)));
//		labelrs.setBounds(60, 15, Player.satiety, 12);

		System.out.println("=====");
		//쓰레기 텍스트
		jTrash = new JLabel(" x " + Integer.toString(p.getMyGarbage()));
		jTrash.setBounds(50, 35, 100, 25);

		//진주 텍스트
		jPearl = new JLabel(" x " + Integer.toString(p.getMyPearl()));
		jPearl.setBounds(50, 60, 100, 25);

		//닉네임 텍스트
		JLabel id = new JLabel(p.getUserName());
		id.setBounds(89, 159, 100, 25);

		//gameover 텍스트
		gameover = new JLabel("G A M E O V E R");
		gameover.setFont(new Font("Ariel", Font.BOLD, 35));

		//gameover 텍스트
		re_text = new JLabel("RESTART");
		re_text.setFont(new Font("Ariel", Font.BOLD, 20));

		//		bg_gameover = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\GameOver2.png").getImage().getScaledInstance(360, 640, 0)));
		//		bg_gameover.setBounds(0, 0, 360, 640);
		//		bg_gameover.setBackground(new Color(0, 0, 0, 0));

		//닉네임 간판
		nickname_b.setBorderPainted(false);
		nickname_b.setFocusPainted(false);
		nickname_b.setContentAreaFilled(false);

		//설정
		setting_b.setBorderPainted(false);
		setting_b.setFocusPainted(false);
		setting_b.setContentAreaFilled(false);

		//상점
		shop_b.setBorderPainted(false);
		shop_b.setFocusPainted(false);
		shop_b.setContentAreaFilled(false);

		//책
		book_b.setBorderPainted(false);
		book_b.setFocusPainted(false);
		book_b.setContentAreaFilled(false);

		//광고
		ads_b.setBorderPainted(false);
		ads_b.setFocusPainted(false);
		ads_b.setContentAreaFilled(false);

		//이글루
		igloo_b.setBorderPainted(false);
		igloo_b.setFocusPainted(false);
		igloo_b.setContentAreaFilled(false);

		//펭즈
		button7.setBorderPainted(false);
		button7.setFocusPainted(false);
		button7.setContentAreaFilled(false);


		//펭즈
		eps1_b.setBorderPainted(false);
		eps1_b.setFocusPainted(false);
		eps1_b.setContentAreaFilled(false);
		
		eps2_b.setBorderPainted(false);
		eps2_b.setFocusPainted(false);
		eps2_b.setContentAreaFilled(false);
		
		eps3_b.setBorderPainted(false);
		eps3_b.setFocusPainted(false);
		eps3_b.setContentAreaFilled(false);
		
		eps4_b.setBorderPainted(false);
		eps4_b.setFocusPainted(false);
		eps4_b.setContentAreaFilled(false);

		//쏘주
		soju_b.setBorderPainted(false);
		soju_b.setFocusPainted(false);
		soju_b.setContentAreaFilled(false);

		//쏘주
		restart.setBorderPainted(false);
		restart.setFocusPainted(false);
		restart.setContentAreaFilled(false);

		//쏘주
		restart2.setBorderPainted(false);
		restart2.setFocusPainted(false);
		restart2.setContentAreaFilled(false);

		//닉네임 간판
		nickname_b.addActionListener(new Listener1());
		//설정
		setting_b.addMouseListener(new MyMouseAdapter2());
		//상점
		shop_b.addMouseListener(new MyMouseAdapter3());
		//책(업적)
		book_b.addMouseListener(new MyMouseAdapter4());
		//광고
		ads_b.addMouseListener(new MyMouseAdapter5());
		//소주(게임)
		soju_b.addMouseListener(new MyMouseAdapter6());
		//포만감 감소
		//		label5.addMouseListener(new MyMouseAdapter9());
		
		maxHp = Player.getSatiety();
		//		bg_l.add(bg_gameover);
		bg_l.add(top_l);
		bg_l.add(eps1_b);
		bg_l.add(eps2_b);
		bg_l.add(eps3_b);
		bg_l.add(eps4_b);
		bg_l.add(button7);		//펭즈
		bg_l.add(id);			//닉네임 텍스트
		bg_l.add(setting_b);		//설정
		bg_l.add(shop_b);		//상점
		bg_l.add(book_b);		//책(업적)
		bg_l.add(ads_b);		//광고
		bg_l.add(soju_b);		//쏘주(게임)
		bg_l.add(heart_l);		//하트
		bg_l.add(garbage_l);		//쓰레기
		bg_l.add(pearl_l);		//진주
		bg_l.add(labelrs);		//포만감 감소
		//		this.add(label4);		//포만감 배경
		bg_l.add(jTrash);		//쓰레기 텍스트
		bg_l.add(HomeView.jPearl);		//진주 텍스트
		bg_l.add(nickname_b);		//닉네임 간판
		bg_l.add(igloo_b);		//이글루
		this.add(bg_l);		//배경
		mf.add(this);
		mf.repaint();
	}
	
	public HomeView(MainView mf, Player p, int garbage, int pearl) {
		this(mf, p);
		HomeView.jTrash = new JLabel(" x " + Integer.toString(garbage));
		
		//p.setMyGarbage(myGarbage);
		
		
		bg_l.add(HomeView.jTrash);		//진주 텍스트
		bg_l.add(HomeView.jPearl);		//진주 텍스트
		
		bg_l.repaint(); System.out.println(Integer.toString(garbage));
		
	}
	
	public static void setStop(boolean stop) {
		HomeView.stop = stop;
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

			
			new ConfigurationView(mf, p);

		}
	}

	//상점
	class MyMouseAdapter3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			new MainShopView(mf, p);
		}
	}

	//업적
	class MyMouseAdapter4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			new MainBookView(mf, p);
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
			if(!f) {
				ChangePanel.changePanel(mf, homeView, new HowToPlayView(mf, p));
			} else {
				InGameView.count = 0;
				Run.t2.start();
				InGameView.threadtimer = false;
				InGameView.timer = 3;
				ChangePanel.changePanel(mf, homeView, new StageView(mf, p));

			}
		}


	}

	//포만감 감소
	class MyMouseAdapter9 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getSatiety() <= 0) {
				//ChangePanel.changePanel(mf, homeView, new GameOverView(mf));
			}
		}
	}

	@Override
	public void run() {
		soju_b.addMouseListener(new MyMouseAdapter6());
		int max = 0;
		while(true) {
			if(maxHp <= 0) {
				if(!bl) {
					gameover.setBounds(40, 200, 360, 80);
					re_text.setBounds(150, 505, 140, 40);
					restart.setBounds(100, 500, 50, 50);
					restart2.setBounds(120, 510, 140, 40);
					
					top_l.add(gameover);
					top_l.add(re_text);
					top_l.add(restart);
					top_l.add(restart2);
					System.out.println("gameover");
					bl = true;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					restart2.addMouseListener(new key());
					Player.setSatiety(maxHp);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					
			}else if (maxHp > 0) {
				maxHp -= 3;
				Player.setSatiety(maxHp);
				try {
					max ++;
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				labelrs.setBounds(23, 15, maxHp, 12);
				bg_l.add(labelrs);
				bg_l.repaint();
			}

		}
	}
	
	public static class key implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println(maxHp);
			maxHp = 100;
			re_text.setLocation(1000,1000);
			gameover.setLocation(1000,1000);
			restart.setLocation(1000,1000);
			restart2.setLocation(1000,1000);
			bl = false;
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class EndingMouse extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, homeView, new EndingStoryView(mf, p));
		}
	}


}
