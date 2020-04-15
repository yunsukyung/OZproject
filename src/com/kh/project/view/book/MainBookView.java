package com.kh.project.view.book;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.Player;
import com.kh.project.view.HomeView;
import com.kh.project.view.MainView;
import com.kh.project.view.shop.MainShopView;

public class MainBookView extends JDialog {
	private JDialog startPage;
	private MainView mf;
	private Player p;
	public MainBookView(MainView mf, Player p) {
		this.p = p;
		this.startPage = this;
		this.mf = mf;
		this.setBounds(57, 180, 230, 400);
		//this.setUndecorated(true);
		this.setVisible(true);
		//this.setBackground(new Color(0, 0, 0, 0));
		
		
				
		//버튼 및 라벨 생성
//		JLabel back = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\스토리 배경.jpg").getImage().getScaledInstance(360, 640, 0)));
//		back.setBounds(0, 0, 360, 640);
		JPanel back = new JPanel();
		back.setLayout(null);
		back.setBackground(new Color(0, 0, 0, 0));
		
		JLabel book = new JLabel(new ImageIcon(new ImageIcon("src\\image\\book\\book.PNG").getImage().getScaledInstance(224, 370, 0)));
		book.setBounds(-5, 0, 224, 370);

		JButton bookbutton1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼.PNG").getImage().getScaledInstance(155, 50, 0)));
		bookbutton1.setLayout(null);
		bookbutton1.setBounds(30, 100, 155, 45);

		JButton bookbutton2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼2_1.PNG").getImage().getScaledInstance(155, 50, 0)));
		bookbutton2.setLayout(null);
		bookbutton2.setBounds(30, 150, 155, 45);

		JButton bookbutton3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼3_1.PNG").getImage().getScaledInstance(155, 50, 0)));
		bookbutton3.setLayout(null);
		bookbutton3.setBounds(30, 200, 155, 45);

		JButton bookbutton4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼4_1.PNG").getImage().getScaledInstance(155, 50, 0)));
		bookbutton4.setLayout(null);
		bookbutton4.setBounds(30, 250, 155, 45);
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(55, 310, 98, 35);
		backbutton.addMouseListener(new MyMouseAdapter());
		
		//액션
		if(p.getGarbage() > 15) {
			bookbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous();
				
			}
		});
		} else {
			JDialog less = new JDialog(mf);
			
			less.setVisible(true);
			less.setBounds(120, 250, 200, 200);

			JLabel ok = new JLabel("업적을 아직 달성하지 못했습니다!");
			ok.setBounds(10, 30, 150, 50);

			JButton button = new JButton("확인");
			button.setBounds(0, 100, 150, 50);
			less.add(button, BorderLayout.SOUTH);
			less.add(ok);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					less.dispose();

				}
			});

			
		}
		
		if(p.getGarbage() > 100) {
			bookbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous2();
				
			}
		});
		} else {
			JDialog less = new JDialog(mf);
			
			less.setVisible(true);
			less.setBounds(120, 250, 200, 200);

			JLabel ok = new JLabel("업적을 아직 달성하지 못했습니다!");
			ok.setBounds(10, 30, 150, 50);

			JButton button = new JButton("확인");
			button.setBounds(0, 100, 150, 50);
			less.add(button, BorderLayout.SOUTH);
			less.add(ok);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					less.dispose();

				}
			});

			
		}
		
		
		if(p.getGarbage() > 500) {
			bookbutton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous3();
				
			}
		});
		} else {
			JDialog less = new JDialog(mf);
			
			less.setVisible(true);
			less.setBounds(120, 250, 200, 200);

			JLabel ok = new JLabel("업적을 아직 달성하지 못했습니다!");
			ok.setBounds(10, 30, 150, 50);

			JButton button = new JButton("확인");
			button.setBounds(0, 100, 150, 50);
			less.add(button, BorderLayout.SOUTH);
			less.add(ok);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					less.dispose();

				}
			});

			
		}
		
		if(p.getGarbage() > 1000) {
			bookbutton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous4();
				
			}
		});
		} else {
			JDialog less = new JDialog(mf);
			
			less.setVisible(true);
			less.setBounds(120, 250, 200, 200);

			JLabel ok = new JLabel("업적을 아직 달성하지 못했습니다!");
			ok.setBounds(10, 30, 150, 50);

			JButton button = new JButton("확인");
			button.setBounds(0, 100, 150, 50);
			less.add(button, BorderLayout.SOUTH);
			less.add(ok);

			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					less.dispose();

				}
			});

			
		}
		
		
		
		//패널에 삽입
		back.add(bookbutton1);
		back.add(bookbutton2);
		back.add(bookbutton3);
		back.add(bookbutton4);
		back.add(backbutton);
		back.add(book);
		this.add(back);
		this.setResizable(false); 
		
		
		
	}
	
	//나가기
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
	
	
}
//클릭했을때 새로운 프레임 생성
class mous extends JFrame{
	Player p;
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
		
		gohome.addMouseListener(new HomeMouse1());
		
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
		
		p.setGarbage(p.getGarbage() + 150);
		p.setPearl(p.getPearl() + 2);
		
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
	class HomeMouse1 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
			
		}
	}
}
//클릭했을때 새로운 프레임 생성
class mous2 extends JFrame{
	Player p;
	public mous2() {
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
		
		gohome.addMouseListener(new HomeMouse2());
		

		
		JLabel jin2 = new JLabel("진주 획득!!");
		jin2.setBounds(90, 30, 100, 40);
		jin2.setForeground(Color.WHITE);
		JLabel jin3 = new JLabel("x 5");
		jin3.setBounds(110, 50, 30, 40);
		jin3.setForeground(Color.WHITE);
		
		p.setPearl(p.getPearl() + 5);
		
		mo.add(jin2);
		mo.add(jin3);
		mo.add(gohome);
		mo.add(jin);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false);
		this.setSize(240,222);
		this.setVisible(true);
	}
	class HomeMouse2 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
}

//클릭했을때 새로운 프레임 생성
class mous3 extends JFrame{
	Player p;
	public mous3() {
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
		
		gohome.addMouseListener(new HomeMouse3());

		JLabel jin2 = new JLabel("진주 획득!!");
		jin2.setBounds(90, 30, 100, 40);
		jin2.setForeground(Color.WHITE);
		JLabel jin3 = new JLabel("x 15");
		jin3.setBounds(110, 50, 30, 40);
		jin3.setForeground(Color.WHITE);
		
		p.setPearl(p.getPearl() + 15);
		
		mo.add(jin2);
		mo.add(jin3);
		mo.add(gohome);
		mo.add(jin);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false);
		this.setSize(240,222);
		this.setVisible(true);
	}
	class HomeMouse3 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
}
//클릭했을때 새로운 프레임 생성
class mous4 extends JFrame{
	Player p;
	public mous4() {
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
		
		gohome.addMouseListener(new HomeMouse4());

		JLabel jin2 = new JLabel("진주 획득!!");
		jin2.setBounds(90, 30, 100, 40);
		jin2.setForeground(Color.WHITE);
		JLabel jin3 = new JLabel("x 30");
		jin3.setBounds(110, 50, 30, 40);
		jin3.setForeground(Color.WHITE);
		
		p.setPearl(p.getPearl() + 30);
		
		mo.add(jin2);
		mo.add(jin3);
		mo.add(gohome);
		mo.add(jin);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false);
		this.setSize(240,222);
		this.setVisible(true);
	}
	class HomeMouse4 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
}
