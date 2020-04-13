package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import com.kh.project.view.MainView;
import com.kh.project.view.book.bohoonView;

public class SettingView extends JPanel{
	private JPanel startPage;
	private MainView mf;
	public SettingView(MainView mf) {
		this.startPage = this;
		this.mf = mf;
		
		//위치 초기화
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
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
		button5.setBounds(0, 555, 360, 63);
		
		//이글루
		JButton button6 = new JButton(new ImageIcon(new ImageIcon("src/image/start/igloo (1).png").getImage().getScaledInstance(161, 161, 0)));
		button6.setBounds(30, 185, 161, 161);
		
		//펭즈
		JButton button7 = new JButton(new ImageIcon(new ImageIcon("src/image/start/pengz2.png.png").getImage().getScaledInstance(232, 320, 0)));
		button7.setBounds(100, 210, 235, 224);
		
		//쏘주
		JButton button8 = new JButton(new ImageIcon(new ImageIcon("src/image/start/soju1.png").getImage().getScaledInstance(90, 100, 0)));
		button8.setBounds(60, 400, 60, 100);
		
		
		//하트
		JLabel label1 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/heartbeat.png").getImage().getScaledInstance(25, 25, 0)));
		label1.setBounds(20, 10, 25, 25);
		
		//쓰레기 현황
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/trash.png").getImage().getScaledInstance(25, 25, 0)));
		label2.setBounds(20, 35, 25, 25);
		
		//진주 현황
		JLabel label3 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(25, 25, 0)));
		label3.setBounds(20, 60, 25, 25);
		
		//포만감 현황 배경
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("image/start/Rectangle 80.png").getImage().getScaledInstance(236, 12, 0)));
		label4.setBounds(23, 15, 236, 12);
		
		//포만감 감소
		JLabel label5 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 81.png").getImage().getScaledInstance(200, 12, 0)));
		label5.setBounds(23, 15, 200, 12);
		
		//쓰레기 텍스트
		JLabel trash = new JLabel("X 12");
		trash.setBounds(55, 35, 100, 25);
		JTextField tf1 = new JTextField(10);
		tf1.setBounds(70, 50, 100, 30);
		
		//진주 텍스트
		JLabel pearl = new JLabel("X 9");
		pearl.setBounds(55, 60, 100, 25);
		JTextField tf2 = new JTextField(10);
		tf2.setBounds(70, 80, 100, 30);
		
		//닉네임 텍스트
		JLabel id = new JLabel("PENGZ");
		id.setBounds(89, 159, 100, 25);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(70, 80, 100, 30);
		
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
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new button2_1();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainBookView();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new shop();
			}
		});
		
		this.add(button7);		//펭즈
		this.add(id);			//닉네임 텍스트
		this.add(button1);		//닉네임 간판
		this.add(button2);		//설정
		this.add(button3);		//상점
		this.add(button4);		//책
		this.add(button5);		//광고
		this.add(button6);		//이글루
		this.add(button8);		//쏘주
		this.add(label1);		//하트
		this.add(label2);		//쓰레기
		this.add(label3);		//진주
		this.add(label5);		//포만감 감소
		this.add(label4);		//포만감 배경
		this.add(trash);		//쓰레기 텍스트
		this.add(pearl);		//진주 텍스트
		
		this.add(label);		//배경
		
	}
}
//설정 버튼 누르면 나오는 창
class button2_1 extends JFrame {
	public button2_1() {
		this.setBounds(57, 180, 220, 370);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JPanel mo = new JPanel();
		mo.setLayout(null);

		mo.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel pan = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\sttinglabel.png").getImage().getScaledInstance(224, 370, 0)));
		pan.setBounds(-5, 0, 224, 370);
		
		JButton quitbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\quitbutton.png").getImage().getScaledInstance(119, 33, 0)));
		quitbutton.setLayout(null);
		quitbutton.setBounds(45, 180, 119, 33);
		quitbutton.setBorderPainted(false);
		quitbutton.setFocusPainted(false);
		quitbutton.setContentAreaFilled(false);
		
		JButton howtoplaybutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\howtoplaybutton.png").getImage().getScaledInstance(119, 33, 0)));
		howtoplaybutton.setLayout(null);
		howtoplaybutton.setBounds(45, 130, 119, 33);
		howtoplaybutton.setBorderPainted(false);
		howtoplaybutton.setFocusPainted(false);
		howtoplaybutton.setContentAreaFilled(false);
		
		JButton imforbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\inforbutton.png").getImage().getScaledInstance(119, 33, 0)));
		imforbutton.setLayout(null);
		imforbutton.setBounds(45, 230, 119, 33);
		imforbutton.setBorderPainted(false);
		imforbutton.setFocusPainted(false);
		imforbutton.setContentAreaFilled(false);
		
		JSlider s = new JSlider(0,10,5);
		s.setMinorTickSpacing(1);
		s.setMajorTickSpacing(5);
		s.setPaintTicks(true);
		s.setLabelTable(s.createStandardLabels(10));
		s.setPaintLabels(true);
		s.setSnapToTicks(true);
		
        s.setBounds(48,80,115,40);
        this.add(s); 
		
		mo.add(howtoplaybutton);
		mo.add(imforbutton);
		mo.add(quitbutton);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false); 
		
	}
}
//업적 버튼 누르면 뜨는 창
class MainBookView extends JFrame{
	public MainBookView() {
		this.setBounds(57, 180, 220, 370);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setLayout(null);
				
		//버튼 및 라벨 생성
		JLabel book = new JLabel(new ImageIcon(new ImageIcon("src\\image\\book\\book.PNG").getImage().getScaledInstance(220, 370, 0)));
		book.setBounds(0, 0, 220, 370);

		JButton bookbutton1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼.PNG").getImage().getScaledInstance(140, 40, 0)));
		bookbutton1.setLayout(null);
		bookbutton1.setBounds(40, 90, 140, 40);

		JButton bookbutton2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼2_1.PNG").getImage().getScaledInstance(140, 52, 0)));
		bookbutton2.setLayout(null);
		bookbutton2.setBounds(40, 140, 140, 40);

		JButton bookbutton3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼3_1.PNG").getImage().getScaledInstance(140, 52, 0)));
		bookbutton3.setLayout(null);
		bookbutton3.setBounds(40, 190, 140, 40);

		JButton bookbutton4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\book\\업적버튼4_1.PNG").getImage().getScaledInstance(140, 52, 0)));
		bookbutton4.setLayout(null);
		bookbutton4.setBounds(40, 240, 140, 40);
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(60, 300, 98, 35);
		
		
		//액션
		bookbutton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous();
				
			}
		});
		
		bookbutton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous2();
				
			}
		});
		
		bookbutton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous3();
				
			}
		});
		
		bookbutton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new mous4();
				
			}
		});
		
		//패널에 삽입
		this.add(bookbutton1);
		this.add(bookbutton2);
		this.add(bookbutton3);
		this.add(bookbutton4);
		this.add(backbutton);
		this.add(book);
		
		
	}
}
//업적 클리어 클릭 했을때 새로운 프레임 생성1
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
//업적 클리어 클릭했을때 새로운 프레임 생성2
class mous2 extends JFrame{
	
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

//업적 클리어 클릭 했을때 새로운 프레임 생성3
class mous3 extends JFrame{
	
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
//업적 클리어 클릭 했을때 새로운 프레임 생성4
class mous4 extends JFrame{
	
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

class shop extends JFrame{
	public shop() {
		this.setBounds(57, 180, 220, 370);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setLayout(null);
		
		CardLayout card = new CardLayout(0,0);
		
		Image background = new ImageIcon("src\\image\\start\\shopback.png").getImage().getScaledInstance(230, 385, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 220, 370);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(25, 100, 170, 280);
		panel.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JButton robButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/rod.png").getImage().getScaledInstance(80, 80, 0)));
		robButton.setBounds(0, 10, 80, 80);
		
		JButton foodButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/fish.png").getImage().getScaledInstance(80, 80, 0)));
		foodButton.setBounds(90, 10, 80, 80);
		
		JButton epsButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/eps.png").getImage().getScaledInstance(80, 80, 0)));
		epsButton.setBounds(90, 110, 80, 80);
		
		//진주버튼으로 수정    코드는 hat으로 썼음
		JButton hatButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(80, 80, 0)));
		hatButton.setBounds(0, 110, 80, 80);
		
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setBounds(60, 300, 98, 35);
		
		
		
		//낚시대 패널 1
		JPanel robpanel1 = new JPanel();
		robpanel1.setLayout(null);
		robpanel1.setBounds(25, 100, 170, 190);
		robpanel1.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel rodattack1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\at1.png").getImage().getScaledInstance(65, 15, 0)));
		rodattack1.setBounds(50, 140, 65, 15);
		
		JLabel shoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		shoplabel1.setBounds(0, 0, 170, 190);
		
		JLabel rob1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\나무낚시대.png").getImage().getScaledInstance(100, 100, 0)));
		rob1.setLayout(null);
		rob1.setBounds(35, 40, 100, 100);
		
		JButton robpurchase = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\50쓰.png").getImage().getScaledInstance(60, 30, 0)));
		robpurchase.setLayout(null);
		robpurchase.setBounds(55, 160, 60, 30);
		
		JButton robleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft1.setLayout(null);
		robleft1.setBounds(10, 80, 20, 20);
		
		JButton robright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright1.setLayout(null);
		robright1.setBounds(140, 80, 20, 20);
		
		//낚시대 패널 2
		JPanel robpanel2 = new JPanel();
		robpanel2.setLayout(null);
		robpanel2.setBounds(25, 100, 170, 190);
		robpanel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel rodattack2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\at3.png").getImage().getScaledInstance(65, 15, 0)));
		rodattack2.setBounds(50, 140, 65, 15);
		
		JLabel shoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		shoplabel2.setBounds(0, 0, 170, 190);
		
		JLabel rob2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\제목 없음-1.png").getImage().getScaledInstance(100, 100, 0)));
		rob2.setLayout(null);
		rob2.setBounds(35, 40, 100, 100);
		
		JButton robpurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\150쓰.png").getImage().getScaledInstance(60, 30, 0)));
		robpurchase2.setLayout(null);
		robpurchase2.setBounds(55, 160, 60, 30);
		
		JButton robleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft2.setLayout(null);
		robleft2.setBounds(10, 80, 20, 20);
		
		JButton robright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright2.setLayout(null);
		robright2.setBounds(140, 80, 20, 20);
		

		
		//낚시대 패널 3
		JPanel robpanel3 = new JPanel();
		robpanel3.setLayout(null);
		robpanel3.setBounds(25, 100, 170, 280);
		robpanel3.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel rodattack3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\at5.png").getImage().getScaledInstance(65, 15, 0)));
		rodattack3.setBounds(50, 140, 65, 15);
		
		JLabel shoplabel3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		shoplabel3.setBounds(0, 0, 170, 190);
		
		JLabel rob3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\fishing.png").getImage().getScaledInstance(100, 100, 0)));
		rob3.setLayout(null);
		rob3.setBounds(35, 40, 100, 100);
		
		JButton robpurchase3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\15진.png").getImage().getScaledInstance(60, 30, 0)));
		robpurchase3.setLayout(null);
		robpurchase3.setBounds(55, 160, 60, 30);
		
		JButton robleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft3.setLayout(null);
		robleft3.setBounds(10, 80, 20, 20);
		
		JButton robright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright3.setLayout(null);
		robright3.setBounds(140, 80, 20, 20);
		
		//모자 패널 1
		JPanel hatpanel1 = new JPanel();
		hatpanel1.setLayout(null);
		hatpanel1.setBounds(25, 100, 170, 190);
		hatpanel1.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel hatshoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		hatshoplabel1.setBounds(0, 0, 170, 190);

		JLabel hat1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\10가진주.PNG").getImage().getScaledInstance(100, 100, 0)));
		hat1.setLayout(null);
		hat1.setBounds(35, 40, 100, 100);

		JButton hatpurchase1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\1200원.png").getImage().getScaledInstance(60, 30, 0)));
		hatpurchase1.setLayout(null);
		hatpurchase1.setBounds(55, 160, 60, 30);
		
		JButton hatleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft1.setLayout(null);
		hatleft1.setBounds(10, 80, 20, 20);

		JButton hatright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright1.setLayout(null);
		hatright1.setBounds(140, 80, 20, 20);

		//모자 패널 2
		JPanel hatpanel2 = new JPanel();
		hatpanel2.setLayout(null);
		hatpanel2.setBounds(25, 100, 170, 190);
		hatpanel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel hatshoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		hatshoplabel2.setBounds(0, 0, 170, 190);

		JLabel hat2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\30가진주.png").getImage().getScaledInstance(100, 100, 0)));
		hat2.setLayout(null);
		hat2.setBounds(35, 40, 100, 100);
		
		JButton hatpurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\3000원.png").getImage().getScaledInstance(60, 30, 0)));
		hatpurchase2.setLayout(null);
		hatpurchase2.setBounds(55, 160, 60, 30);
		
		JButton hatleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft2.setLayout(null);
		hatleft2.setBounds(10, 80, 20, 20);

		JButton hatright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright2.setLayout(null);
		hatright2.setBounds(140, 80, 20, 20);

		//모자 패널 3
		JPanel hatpanel3 = new JPanel();
		hatpanel3.setLayout(null);
		hatpanel3.setBounds(25, 100, 170, 280);
		hatpanel3.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel hatshoplabel3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		hatshoplabel3.setBounds(0, 0, 170, 190);

		JLabel hat3 = new JLabel(new ImageIcon(new ImageIcon("src\\\\image\\\\start\\\\70가진주.PNG").getImage().getScaledInstance(100, 100, 0)));
		hat3.setLayout(null);
		hat3.setBounds(35, 40, 100, 100);

		JButton hatpurchase3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\6500원.png").getImage().getScaledInstance(60, 30, 0)));
		hatpurchase3.setLayout(null);
		hatpurchase3.setBounds(55, 160, 60, 30);
		
		JButton hatleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft3.setLayout(null);
		hatleft3.setBounds(10, 80, 20, 20);

		JButton hatright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright3.setLayout(null);
		hatright3.setBounds(140, 80, 20, 20);


		//모자 패널4
		JPanel hatpanel4 = new JPanel();
		hatpanel4.setLayout(null);
		hatpanel4.setBounds(25, 100, 170, 280);
		hatpanel4.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel hatshoplabel4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		hatshoplabel4.setBounds(0, 0, 170, 190);
		
		JLabel hat4 = new JLabel(new ImageIcon(new ImageIcon("src\\\\image\\\\start\\\\120가진주.PNG").getImage().getScaledInstance(100, 100, 0)));
		hat4.setLayout(null);
		hat4.setBounds(35, 40, 100, 100);
		
		JButton hatpurchase4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\10000원.png").getImage().getScaledInstance(60, 30, 0)));
		hatpurchase4.setLayout(null);
		hatpurchase4.setBounds(55, 160, 60, 30);
		
		//왼쪽
		JButton hatleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft4.setLayout(null);
		hatleft4.setBounds(10, 80, 20, 20);
		//오른쪽
		JButton hatright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright4.setLayout(null);
		hatright4.setBounds(140, 80, 20, 20);

		//음식 패널 1
		JPanel foodpanel1 = new JPanel();
		foodpanel1.setLayout(null);
		foodpanel1.setBounds(25, 100, 170, 190);
		foodpanel1.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel foodHp1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\hx25.png").getImage().getScaledInstance(65, 15, 0)));
		foodHp1.setBounds(50, 140, 65, 15);
		
		JLabel foodshoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		foodshoplabel1.setBounds(0, 0, 170, 190);

		JLabel food1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\fish.png").getImage().getScaledInstance(100, 100, 0)));
		food1.setLayout(null);
		food1.setBounds(35, 40, 100, 100);

		JButton foodpurchase1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\10쓰.png").getImage().getScaledInstance(60, 30, 0)));
		foodpurchase1.setLayout(null);
		foodpurchase1.setBounds(55, 160, 60, 30);
		
		JButton foodleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft1.setLayout(null);
		foodleft1.setBounds(10, 80, 20, 20);

		JButton foodright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright1.setLayout(null);
		foodright1.setBounds(140, 80, 20, 20);

		//음식 패널 2
		JPanel foodpanel2 = new JPanel();
		foodpanel2.setLayout(null);
		foodpanel2.setBounds(25, 100, 170, 190);
		foodpanel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel foodHp2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\hx50.png").getImage().getScaledInstance(65, 15, 0)));
		foodHp2.setBounds(50, 140, 65, 15);
		
		JLabel foodshoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		foodshoplabel2.setBounds(0, 0, 170, 190);

		JLabel food2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\sushi.png").getImage().getScaledInstance(100, 100, 0)));
		food2.setLayout(null);
		food2.setBounds(35, 40, 100, 100);

		JButton foodpurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\30쓰.png").getImage().getScaledInstance(60, 30, 0)));
		foodpurchase2.setLayout(null);
		foodpurchase2.setBounds(55, 160, 60, 30);
		
		JButton foodleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft2.setLayout(null);
		foodleft2.setBounds(10, 80, 20, 20);

		JButton foodright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright2.setLayout(null);
		foodright2.setBounds(140, 80, 20, 20);



		//음식 패널 3
		JPanel foodpanel3 = new JPanel();
		foodpanel3.setLayout(null);
		foodpanel3.setBounds(25, 100, 170, 280);
		foodpanel3.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel foodHp3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\hx75.png").getImage().getScaledInstance(65, 15, 0)));
		foodHp3.setBounds(50, 140, 65, 15);
		
		JLabel foodshoplabel3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		foodshoplabel3.setBounds(0, 0, 170, 190);

		JLabel food3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\장어구이.png").getImage().getScaledInstance(100, 100, 0)));
		food3.setLayout(null);
		food3.setBounds(35, 40, 100, 100);

		JButton foodpurchase3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\50쓰.png").getImage().getScaledInstance(60, 30, 0)));
		foodpurchase3.setLayout(null);
		foodpurchase3.setBounds(55, 160, 60, 30);
		
		JButton foodleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft3.setLayout(null);
		foodleft3.setBounds(10, 80, 20, 20);

		JButton foodright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright3.setLayout(null);
		foodright3.setBounds(140, 80, 20, 20);


		//음식 패널4
		JPanel foodpanel4 = new JPanel();
		foodpanel4.setLayout(null);
		foodpanel4.setBounds(25, 100, 170, 280);
		foodpanel4.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel foodHp4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\hx100.png").getImage().getScaledInstance(65, 15, 0)));
		foodHp4.setBounds(50, 140, 65, 15);
		
		JLabel foodshoplabel4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		foodshoplabel4.setBounds(0, 0, 170, 190);
		
		JLabel food4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\sushi (1).png").getImage().getScaledInstance(100, 100, 0)));
		food4.setLayout(null);
		food4.setBounds(35, 40, 100, 100);
		
		JButton foodpurchase4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\5진.png").getImage().getScaledInstance(60, 30, 0)));
		foodpurchase4.setLayout(null);
		foodpurchase4.setBounds(55, 160, 60, 30);
		
		//왼쪽
		JButton foodleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft4.setLayout(null);
		foodleft4.setBounds(10, 80, 20, 20);
		//오른쪽
		JButton foodright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright4.setLayout(null);
		foodright4.setBounds(140, 80, 20, 20);

		//발전소 패널 1
		JPanel epspanel1 = new JPanel();
		epspanel1.setLayout(null);
		epspanel1.setBounds(25, 100, 170, 190);
		epspanel1.setBackground(new Color(255, 0, 0, 0));    //패널 투명
		
		JLabel epsAbility = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\eps1.png").getImage().getScaledInstance(65, 15, 0)));
		epsAbility.setBounds(50, 140, 65, 15);

		JLabel epsshoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		epsshoplabel1.setBounds(0, 0, 170, 190);

		JLabel eps1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\winter.png").getImage().getScaledInstance(100, 100, 0)));
		eps1.setLayout(null);
		eps1.setBounds(35, 40, 100, 100);

		JButton epspurchase1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\500쓰.png").getImage().getScaledInstance(60, 30, 0)));
		epspurchase1.setLayout(null);
		epspurchase1.setBounds(55, 160, 60, 30);
		
		JButton epsleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft1.setLayout(null);
		epsleft1.setBounds(10, 80, 20, 20);

		JButton epsright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright1.setLayout(null);
		epsright1.setBounds(140, 80, 20, 20);

		//발전소 패널 2
		JPanel epspanel2 = new JPanel();
		epspanel2.setLayout(null);
		epspanel2.setBounds(25, 100, 170, 190);
		epspanel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel epsshoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		epsshoplabel2.setBounds(0, 0, 170, 190);

		JLabel epsAbility2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\eps3.png").getImage().getScaledInstance(65, 15, 0)));
		epsAbility2.setBounds(50, 140, 65, 15);

		JLabel eps2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\풍차.png").getImage().getScaledInstance(100, 100, 0)));
		eps2.setLayout(null);
		eps2.setBounds(35, 40, 100, 100);

		JButton epspurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\75진.png").getImage().getScaledInstance(60, 30, 0)));
		epspurchase2.setLayout(null);
		epspurchase2.setBounds(55, 160, 60, 30);

		
		JButton epsleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft2.setLayout(null);
		epsleft2.setBounds(10, 80, 20, 20);

		JButton epsright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright2.setLayout(null);
		epsright2.setBounds(140, 80, 20, 20);



		//발전소 패널 3
		JPanel epspanel3 = new JPanel();
		epspanel3.setLayout(null);
		epspanel3.setBounds(25, 100, 170, 280);
		epspanel3.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel epsshoplabel3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		epsshoplabel3.setBounds(0, 0, 170, 190);

		JLabel epsAbility3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\eps5.png").getImage().getScaledInstance(65, 15, 0)));
		epsAbility3.setBounds(50, 140, 65, 15);
		
		JLabel eps3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\EPSView(1).png").getImage().getScaledInstance(100, 100, 0)));
		eps3.setLayout(null);
		eps3.setBounds(35, 40, 100, 100);

		JButton epspurchase3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\75진.png").getImage().getScaledInstance(60, 30, 0)));
		epspurchase3.setLayout(null);
		epspurchase3.setBounds(55, 160, 60, 30);

		JButton epsleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft3.setLayout(null);
		epsleft3.setBounds(10, 80, 20, 20);

		JButton epsright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright3.setLayout(null);
		epsright3.setBounds(140, 80, 20, 20);


		//발전소 패널4
		JPanel epspanel4 = new JPanel();
		epspanel4.setLayout(null);
		epspanel4.setBounds(25, 100, 170, 280);
		epspanel4.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel epsshoplabel4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		epsshoplabel4.setBounds(0, 0, 170, 190);
		
		JLabel epsAbility4 = new JLabel("clean earth");
		epsAbility4.setBounds(50, 140, 65, 15);
		
		JLabel eps4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\planet-earth.png").getImage().getScaledInstance(100, 100, 0)));
		eps4.setLayout(null);
		eps4.setBounds(35, 40, 100, 100);

		JButton epspurchase4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\135진.png").getImage().getScaledInstance(60, 30, 0)));
		epspurchase4.setLayout(null);
		epspurchase4.setBounds(55, 160, 60, 30);

		//왼쪽
		JButton epsleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft4.setLayout(null);
		epsleft4.setBounds(10, 80, 20, 20);
		//오른쪽
		JButton epsright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright4.setLayout(null);
		epsright4.setBounds(140, 80, 20, 20);
		
		
		robpanel1.add(rob1);
		robpanel1.add(rodattack1);
		robpanel1.add(robpurchase);
		robpanel1.add("r1",robright1);
		robpanel1.add("l1",robleft1);
		robpanel2.add(rodattack2);
		robpanel2.add(rob2);
		robpanel2.add(robpurchase2);
		robpanel2.add("r2",robright2);
		robpanel2.add("l2",robleft2);
		robpanel3.add(rodattack3);
		robpanel3.add(rob3);
		robpanel3.add(robpurchase3);
		robpanel3.add("r3",robright3);
		robpanel3.add("l3",robleft3);
		
		hatpanel1.add(hat1);
		hatpanel1.add("r1",hatright1);
		hatpanel1.add("l1",hatleft1);
		hatpanel1.add(hatpurchase1);
		hatpanel2.add(hat2);
		hatpanel2.add("r2",hatright2);
		hatpanel2.add("l2",hatleft2);
		hatpanel2.add(hatpurchase2);
		hatpanel3.add(hat3);
		hatpanel3.add("r3",hatright3);
		hatpanel3.add("l3",hatleft3);
		hatpanel3.add(hatpurchase3);
		hatpanel4.add(hat4);
		hatpanel4.add("r4",hatright4);
		hatpanel4.add("l4",hatleft4);
		hatpanel4.add(hatpurchase4);
		
		foodpanel1.add(food1);
		foodpanel1.add(foodHp1);
		foodpanel1.add("r1",foodright1);
		foodpanel1.add("l1",foodleft1);
		foodpanel1.add(foodpurchase1);
		foodpanel2.add(foodHp2);
		foodpanel2.add(food2);
		foodpanel2.add("r2",foodright2);
		foodpanel2.add("l2",foodleft2);
		foodpanel2.add(foodpurchase2);
		foodpanel3.add(foodHp3);
		foodpanel3.add(food3);
		foodpanel3.add("r3",foodright3);
		foodpanel3.add("l3",foodleft3);
		foodpanel3.add(foodpurchase3);
		foodpanel4.add(foodHp4);
		foodpanel4.add(food4);
		foodpanel4.add("r4",foodright4);
		foodpanel4.add("l4",foodleft4);
		foodpanel4.add(foodpurchase4);
		
		epspanel1.add(epsAbility);
		epspanel1.add(eps1);
		epspanel1.add("r1",epsright1);
		epspanel1.add("l1",epsleft1);
		epspanel1.add(epspurchase1);
		epspanel2.add(epsAbility2);
		epspanel2.add(eps2);
		epspanel2.add("r2",epsright2);
		epspanel2.add("l2",epsleft2);
		epspanel2.add(epspurchase2);
		epspanel3.add(epsAbility3);
		epspanel3.add(eps3);
		epspanel3.add("r3",epsright3);
		epspanel3.add("l3",epsleft3);
		epspanel3.add(epspurchase3);
		epspanel4.add(epsAbility4);
		epspanel4.add(eps4);
		epspanel4.add("r4",epsright4);
		epspanel4.add("l4",epsleft4);
		epspanel4.add(epspurchase4);
		
		
		robpanel1.setVisible(false);
		robpanel2.setVisible(false);
		robpanel3.setVisible(false);
		
		hatpanel1.setVisible(false);
		hatpanel2.setVisible(false);
		hatpanel3.setVisible(false);
		hatpanel4.setVisible(false);
		
		foodpanel1.setVisible(false);
		foodpanel2.setVisible(false);
		foodpanel3.setVisible(false);
		foodpanel4.setVisible(false);
		
		epspanel1.setVisible(false);
		epspanel2.setVisible(false);
		epspanel3.setVisible(false);
		epspanel4.setVisible(false);
		
		//낚시대 버튼
		robright1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(false);
				robpanel2.setVisible(true);
				robpanel3.setVisible(false);
			}
		});
		robleft1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(true);
				robpanel2.setVisible(false);
				robpanel3.setVisible(false);
			}
		});
		
		robright2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(false);
				robpanel2.setVisible(false);
				robpanel3.setVisible(true);
			}
		});
		robleft2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(true);
				robpanel2.setVisible(false);
				robpanel3.setVisible(false);
			}
		});
		
		robright3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(true);
				robpanel2.setVisible(false);
				robpanel3.setVisible(false);
			}
		});
		robleft3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				robpanel1.setVisible(false);
				robpanel2.setVisible(true);
				robpanel3.setVisible(false);
			}
		});
		
		//모자 버튼
		hatright1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(true);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(false);
			}
		});
		hatleft1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(true);
			}
		});
		
		hatright2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(true);
				hatpanel4.setVisible(false);
			}
		});
		hatleft2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(true);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(false);
			}
		});
		
		hatright3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(true);
			}
		});
		hatleft3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(true);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(false);
			}
		});
		
		hatright4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(true);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(false);
				hatpanel4.setVisible(false);
			}
		});
		hatleft4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				hatpanel1.setVisible(false);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(true);
				hatpanel4.setVisible(false);
			}
		});
		
		//음식 버튼
		foodright1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(true);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(false);
			}
		});
		foodleft1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(true);
			}
		});
		
		foodright2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(true);
				foodpanel4.setVisible(false);
			}
		});
		foodleft2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(true);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(false);
			}
		});
		
		foodright3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(true);
			}
		});
		foodleft3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(true);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(false);
			}
		});
		
		foodright4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(true);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(false);
				foodpanel4.setVisible(false);
			}
		});
		foodleft4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				foodpanel1.setVisible(false);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(true);
				foodpanel4.setVisible(false);
			}
		});
		
		//발전소 버튼
		epsright1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(true);
				epspanel3.setVisible(false);
				epspanel4.setVisible(false);
			}
		});
		epsleft1.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(false);
				epspanel3.setVisible(false);
				epspanel4.setVisible(true);
			}
		});
		
		epsright2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(false);
				epspanel3.setVisible(true);
				epspanel4.setVisible(false);
			}
		});
		epsleft2.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(true);
				epspanel2.setVisible(false);
				epspanel3.setVisible(false);
				epspanel4.setVisible(false);
			}
		});
		
		epsright3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(false);
				epspanel3.setVisible(false);
				epspanel4.setVisible(true);
			}
		});
		epsleft3.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(true);
				epspanel3.setVisible(false);
				epspanel4.setVisible(false);
			}
		});
		
		epsright4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(true);
				epspanel2.setVisible(false);
				epspanel3.setVisible(false);
				epspanel4.setVisible(false);
			}
		});
		epsleft4.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				epspanel1.setVisible(false);
				epspanel2.setVisible(false);
				epspanel3.setVisible(true);
				epspanel4.setVisible(false);
			}
		});
		
		
		//패널 백그라운드 이미지
		robpanel1.add(shoplabel1);
		robpanel2.add(shoplabel2);
		robpanel3.add(shoplabel3);
		
		hatpanel1.add(hatshoplabel1);
		hatpanel2.add(hatshoplabel2);
		hatpanel3.add(hatshoplabel3);
		hatpanel4.add(hatshoplabel4);
		
		foodpanel1.add(foodshoplabel1);
		foodpanel2.add(foodshoplabel2);
		foodpanel3.add(foodshoplabel3);
		foodpanel4.add(foodshoplabel4);
		
		epspanel1.add(epsshoplabel1);
		epspanel2.add(epsshoplabel2);
		epspanel3.add(epsshoplabel3);
		epspanel4.add(epsshoplabel4);
		
		//버튼 클릭스 다음 패널로 넘어가게함 
		this.add("p1",robpanel1);
		this.add("p2",robpanel2);
		this.add("p3",robpanel3);
		
		this.add("p1",hatpanel1);
		this.add("p2",hatpanel2);
		this.add("p3",hatpanel3);
		this.add("p4",hatpanel4);
		
		this.add("p1",foodpanel1);
		this.add("p2",foodpanel2);
		this.add("p3",foodpanel3);
		this.add("p4",foodpanel4);
		
		this.add("p1",epspanel1);
		this.add("p2",epspanel2);
		this.add("p3",epspanel3);
		this.add("p4",epspanel4);
		
		panel.add(robButton);
		robButton.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				robpanel1.setVisible(true);
				robpanel2.setVisible(false);
				robpanel3.setVisible(false);	
			}
		});
		
		panel.add(foodButton);
		foodButton.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				foodpanel1.setVisible(true);
				foodpanel2.setVisible(false);
				foodpanel3.setVisible(false);				
				foodpanel4.setVisible(false);
			}
		});
		
		panel.add(epsButton);
		epsButton.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				epspanel1.setVisible(true);
				epspanel2.setVisible(false);
				epspanel3.setVisible(false);				
				epspanel4.setVisible(false);
			}
		});
		
		panel.add(hatButton);
		hatButton.addMouseListener(new MouseAdapter() {
			@Override public void mousePressed(MouseEvent e) {
				panel.setVisible(false);
				hatpanel1.setVisible(true);
				hatpanel2.setVisible(false);
				hatpanel3.setVisible(false);				
				hatpanel4.setVisible(false);
			}
		});
		this.add(backButton);
		this.add(panel);
		this.add(label);
	}
}