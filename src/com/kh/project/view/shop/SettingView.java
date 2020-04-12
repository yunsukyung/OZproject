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
		
		JPanel mo = new JPanel();
		mo.setLayout(null);
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
	      
	      JButton hatButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/hat.png").getImage().getScaledInstance(80, 80, 0)));
	      hatButton.setBounds(0, 110, 80, 80);
	      
	      JButton backButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
	      backButton.setBounds(60, 300, 98, 35);
	      
	      
	      //카드 패널 1
	      JPanel panel1 = new JPanel();
	      panel1.setLayout(null);
	      panel1.setBounds(25, 100, 170, 190);
	      panel1.setBackground(new Color(255, 0, 0, 0));    //패널 투명
	      
	      JLabel shoplabel1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
	      shoplabel1.setBounds(0, 0, 170, 190);
	      
	      JLabel rod1 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\나무낚시대.png").getImage().getScaledInstance(100, 100, 0)));
	      rod1.setLayout(null);
	      rod1.setBounds(35, 40, 100, 100);
	      
	      JButton left1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
	      left1.setLayout(null);
	      left1.setBounds(10, 80, 20, 20);
	      
	      JButton right1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
	      right1.setLayout(null);
	      right1.setBounds(140, 80, 20, 20);
	      
	      //카드 패널 2
	      JPanel panel2 = new JPanel();
	      panel2.setLayout(null);
	      panel2.setBounds(25, 100, 170, 190);
	      panel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명
	      
	      JLabel shoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
	      shoplabel2.setBounds(0, 0, 170, 190);
	      
	      JLabel rod2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\제목 없음-1.png").getImage().getScaledInstance(100, 100, 0)));
	      rod2.setLayout(null);
	      rod2.setBounds(35, 40, 100, 100);
	      
	      JButton left2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
	      left2.setLayout(null);
	      left2.setBounds(10, 80, 20, 20);
	      
	      JButton right2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
	      right2.setLayout(null);
	      right2.setBounds(140, 80, 20, 20);
	      

	      
	      //카드 패널 3
	      JPanel panel3 = new JPanel();
	      panel3.setLayout(null);
	      panel3.setBounds(25, 100, 170, 280);
	      panel3.setBackground(new Color(255, 0, 0, 0));    //패널 투명
	      
	      JLabel shoplabel3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
	      shoplabel3.setBounds(0, 0, 170, 190);
	      
	      JLabel rod3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\fishing.png").getImage().getScaledInstance(100, 100, 0)));
	      rod3.setLayout(null);
	      rod3.setBounds(35, 40, 100, 100);
	      
	      JButton left3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
	      left3.setLayout(null);
	      left3.setBounds(10, 80, 20, 20);
	      
	      JButton right3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
	      right3.setLayout(null);
	      right3.setBounds(140, 80, 20, 20);
	      

	      //카드 패널4
	      JPanel panel4 = new JPanel();
	      panel4.setLayout(null);
	      panel4.setBounds(25, 100, 170, 280);
	      panel4.setBackground(new Color(255, 0, 0, 0));    //패널 투명
	      
	      JLabel shoplabel4 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
	      shoplabel4.setBounds(0, 0, 170, 190);
	      //왼쪽
	      JButton left4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
	      left4.setLayout(null);
	      left4.setBounds(10, 80, 20, 20);
	      //오른쪽
	      JButton right4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
	      right4.setLayout(null);
	      right4.setBounds(140, 80, 20, 20);
	      
	      
	      
	      
	      panel1.add(rod1);
	      panel1.add("r1",right1);
	      panel1.add("l1",left1);
	      panel2.add(rod2);
	      panel2.add("r2",right2);
	      panel2.add("l2",left2);
	      panel3.add(rod3);
	      panel3.add("r3",right3);
	      panel3.add("l3",left3);
	      panel4.add("r4",right4);
	      panel4.add("l4",left4);
	      
	      
	      panel1.setVisible(false);
	      panel2.setVisible(false);
	      panel3.setVisible(false);
	      panel4.setVisible(false);
	      
	      
	      right1.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(true);
	            panel3.setVisible(false);
	            panel4.setVisible(false);
	         }
	      });
	      left1.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(false);
	            panel3.setVisible(false);
	            panel4.setVisible(true);
	         }
	      });
	      
	      right2.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(false);
	            panel3.setVisible(true);
	            panel4.setVisible(false);
	         }
	      });
	      left2.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(true);
	            panel2.setVisible(false);
	            panel3.setVisible(false);
	            panel4.setVisible(false);
	         }
	      });
	      
	      right3.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(false);
	            panel3.setVisible(false);
	            panel4.setVisible(true);
	         }
	      });
	      left3.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(true);
	            panel3.setVisible(false);
	            panel4.setVisible(false);
	         }
	      });
	      
	      right4.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(true);
	            panel2.setVisible(false);
	            panel3.setVisible(false);
	            panel4.setVisible(false);
	         }
	      });
	      left4.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel1.setVisible(false);
	            panel2.setVisible(false);
	            panel3.setVisible(true);
	            panel4.setVisible(false);
	         }
	      });
	      
	      
	      //패널 백그라운드 이미지
	      panel1.add(shoplabel1);
	      panel2.add(shoplabel2);
	      panel3.add(shoplabel3);
	      panel4.add(shoplabel4);
	      
	      //버튼 클릭스 다음 패널로 넘어가게함 
	      this.add("p1",panel1);
	      this.add("p2",panel2);
	      this.add("p3",panel3);
	      this.add("p4",panel4);
	      
	      panel.add(robButton);
	      
	      robButton.addMouseListener(new MouseAdapter() {
	         @Override public void mousePressed(MouseEvent e) {
	            panel.setVisible(false);
	            panel1.setVisible(true);
	            panel2.setVisible(false);
	            panel3.setVisible(false);
	            panel4.setVisible(false);
	         }
	      });
	      //panel.add(foodButton);
	      //panel.add(epsButton);
	      //panel.add(hatButton);

	      this.add(backButton);
	      this.add(panel);
	      this.add(label);
	   }
	}