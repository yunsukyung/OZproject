package com.kh.project.view.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.run.Run;
import com.kh.project.view.*;


public class MainShopView extends JDialog{
	private JDialog startPage;
	private MainView mf;
	private JPanel panel = new JPanel();
	Player p;
	public MainShopView(MainView mf, Player p) {
		System.out.println("zz");
		this.startPage = this;
		this.mf = mf;
		this.p = p;
		this.setBounds(57, 180, 230, 400);
		
		this.setVisible(true);
		
		panel.setLayout(null);
		
		panel.setBackground(new Color(0, 0, 0, 0));    //패널 투명

		Image background = new ImageIcon("src\\image\\start\\shopback.png").getImage().getScaledInstance(230, 385, 0);
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 220, 370);

		JButton robButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/rod.png").getImage().getScaledInstance(80, 80, 0)));
		robButton.setBounds(30, 98, 80, 80);

		JButton foodButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/fish.png").getImage().getScaledInstance(80, 80, 0)));
		foodButton.setBounds(110, 98, 80, 80);

		JButton epsButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/eps.png").getImage().getScaledInstance(80, 80, 0)));
		epsButton.setBounds(110, 178, 80, 80);

		//진주버튼으로 수정    코드는 hat으로 썼음
		JButton hatButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(80, 80, 0)));
		hatButton.setBounds(30, 178, 80, 80);

	
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
		robpurchase.setBorderPainted(false);
		robpurchase.setFocusPainted(false);
		robpurchase.setContentAreaFilled(false);

		robpurchase.addMouseListener(new BuyMouse1());

		JButton robleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft1.setLayout(null);
		robleft1.setBounds(10, 80, 20, 20);
		robleft1.setBorderPainted(false);
		robleft1.setFocusPainted(false);
		robleft1.setContentAreaFilled(false);

		JButton robright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright1.setLayout(null);
		robright1.setBounds(140, 80, 20, 20);
		robright1.setBorderPainted(false);
		robright1.setFocusPainted(false);
		robright1.setContentAreaFilled(false);


		//나가기버튼
		JButton robackButton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		robackButton.setLayout(null);
		robackButton.setBounds(60, 300, 98, 35);
		robackButton.addMouseListener(new MyMouseAdepter1());


		//낚시대 패널 2
		JPanel robpanel2 = new JPanel();
		robpanel2.setLayout(null);
		robpanel2.setBounds(25, 100, 170, 190);
		robpanel2.setBackground(new Color(255, 0, 0, 0));    //패널 투명

		JLabel rodattack2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\at3.png").getImage().getScaledInstance(65, 15, 0)));
		rodattack2.setBounds(50, 140, 65, 15);

		JLabel shoplabel2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\Rectangle 32.png").getImage().getScaledInstance(170, 190, 0)));
		shoplabel2.setBounds(0, 0, 170, 190);

		JLabel rob2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\제목 없음-1.png").getImage().getScaledInstance(100, 100, 0)));
		rob2.setLayout(null);
		rob2.setBounds(35, 40, 100, 100);

		JButton robpurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\150쓰.png").getImage().getScaledInstance(60, 30, 0)));
		robpurchase2.setLayout(null);
		robpurchase2.setBounds(55, 160, 60, 30);
		robpurchase2.setBorderPainted(false);
		robpurchase2.setFocusPainted(false);
		robpurchase2.setContentAreaFilled(false);

		robpurchase2.addMouseListener(new BuyMouse2());

		JButton robleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft2.setLayout(null);
		robleft2.setBounds(10, 80, 20, 20);
		robleft2.setBorderPainted(false);
		robleft2.setFocusPainted(false);
		robleft2.setContentAreaFilled(false);

		JButton robright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright2.setLayout(null);
		robright2.setBounds(140, 80, 20, 20);
		robright2.setBorderPainted(false);
		robright2.setFocusPainted(false);
		robright2.setContentAreaFilled(false);



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
		robpurchase3.setBorderPainted(false);
		robpurchase3.setFocusPainted(false);
		robpurchase3.setContentAreaFilled(false);

		robpurchase3.addMouseListener(new PayMouse1());


		JButton robleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		robleft3.setLayout(null);
		robleft3.setBounds(10, 80, 20, 20);
		robleft3.setBorderPainted(false);
		robleft3.setFocusPainted(false);
		robleft3.setContentAreaFilled(false);

		JButton robright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		robright3.setLayout(null);
		robright3.setBounds(140, 80, 20, 20);
		robright3.setBorderPainted(false);
		robright3.setFocusPainted(false);
		robright3.setContentAreaFilled(false);

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
		hatpurchase1.setBorderPainted(false);
		hatpurchase1.setFocusPainted(false);
		hatpurchase1.setContentAreaFilled(false);

		hatpurchase1.addMouseListener(new PearlMouse1());

		JButton hatleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft1.setLayout(null);
		hatleft1.setBounds(10, 80, 20, 20);
		hatleft1.setBorderPainted(false);
		hatleft1.setFocusPainted(false);
		hatleft1.setContentAreaFilled(false);

		JButton hatright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright1.setLayout(null);
		hatright1.setBounds(140, 80, 20, 20);
		hatright1.setBorderPainted(false);
		hatright1.setFocusPainted(false);
		hatright1.setContentAreaFilled(false);

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
		hatpurchase2.setBorderPainted(false);
		hatpurchase2.setFocusPainted(false);
		hatpurchase2.setContentAreaFilled(false);

		hatpurchase2.addMouseListener(new PearlMouse2());

		JButton hatleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft2.setLayout(null);
		hatleft2.setBounds(10, 80, 20, 20);
		hatleft2.setBorderPainted(false);
		hatleft2.setFocusPainted(false);
		hatleft2.setContentAreaFilled(false);

		JButton hatright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright2.setLayout(null);
		hatright2.setBounds(140, 80, 20, 20);
		hatright2.setBorderPainted(false);
		hatright2.setFocusPainted(false);
		hatright2.setContentAreaFilled(false);

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
		hatpurchase3.setBorderPainted(false);
		hatpurchase3.setFocusPainted(false);
		hatpurchase3.setContentAreaFilled(false);

		hatpurchase3.addMouseListener(new PearlMouse3());

		JButton hatleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft3.setLayout(null);
		hatleft3.setBounds(10, 80, 20, 20);
		hatleft3.setBorderPainted(false);
		hatleft3.setFocusPainted(false);
		hatleft3.setContentAreaFilled(false);

		JButton hatright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright3.setLayout(null);
		hatright3.setBounds(140, 80, 20, 20);
		hatright3.setBorderPainted(false);
		hatright3.setFocusPainted(false);
		hatright3.setContentAreaFilled(false);


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
		hatpurchase4.setBorderPainted(false);
		hatpurchase4.setFocusPainted(false);
		hatpurchase4.setContentAreaFilled(false);

		hatpurchase4.addMouseListener(new PearlMouse4());

		//왼쪽
		JButton hatleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		hatleft4.setLayout(null);
		hatleft4.setBounds(10, 80, 20, 20);
		hatleft4.setBorderPainted(false);
		hatleft4.setFocusPainted(false);
		hatleft4.setContentAreaFilled(false);
		//오른쪽
		JButton hatright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		hatright4.setLayout(null);
		hatright4.setBounds(140, 80, 20, 20);
		hatright4.setBorderPainted(false);
		hatright4.setFocusPainted(false);
		hatright4.setContentAreaFilled(false);

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
		foodpurchase1.setBorderPainted(false);
		foodpurchase1.setFocusPainted(false);
		foodpurchase1.setContentAreaFilled(false);

		foodpurchase1.addMouseListener(new BuyMouse3());

		JButton foodleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft1.setLayout(null);
		foodleft1.setBounds(10, 80, 20, 20);
		foodleft1.setBorderPainted(false);
		foodleft1.setFocusPainted(false);
		foodleft1.setContentAreaFilled(false);

		JButton foodright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright1.setLayout(null);
		foodright1.setBounds(140, 80, 20, 20);
		foodright1.setBorderPainted(false);
		foodright1.setFocusPainted(false);
		foodright1.setContentAreaFilled(false);

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
		foodpurchase2.setBorderPainted(false);
		foodpurchase2.setFocusPainted(false);
		foodpurchase2.setContentAreaFilled(false);

		foodpurchase2.addMouseListener(new BuyMouse4());

		JButton foodleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft2.setLayout(null);
		foodleft2.setBounds(10, 80, 20, 20);
		foodleft2.setBorderPainted(false);
		foodleft2.setFocusPainted(false);
		foodleft2.setContentAreaFilled(false);

		JButton foodright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright2.setLayout(null);
		foodright2.setBounds(140, 80, 20, 20);
		foodright2.setBorderPainted(false);
		foodright2.setFocusPainted(false);
		foodright2.setContentAreaFilled(false);



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
		foodpurchase3.setBorderPainted(false);
		foodpurchase3.setFocusPainted(false);
		foodpurchase3.setContentAreaFilled(false);

		foodpurchase3.addMouseListener(new BuyMouse5());

		JButton foodleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft3.setLayout(null);
		foodleft3.setBounds(10, 80, 20, 20);
		foodleft3.setBorderPainted(false);
		foodleft3.setFocusPainted(false);
		foodleft3.setContentAreaFilled(false);

		JButton foodright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright3.setLayout(null);
		foodright3.setBounds(140, 80, 20, 20);
		foodright3.setBorderPainted(false);
		foodright3.setFocusPainted(false);
		foodright3.setContentAreaFilled(false);


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
		foodpurchase4.setBorderPainted(false);
		foodpurchase4.setFocusPainted(false);
		foodpurchase4.setContentAreaFilled(false);

		foodpurchase4.addMouseListener(new PayMouse2());

		//왼쪽
		JButton foodleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		foodleft4.setLayout(null);
		foodleft4.setBounds(10, 80, 20, 20);
		foodleft4.setBorderPainted(false);
		foodleft4.setFocusPainted(false);
		foodleft4.setContentAreaFilled(false);
		//오른쪽
		JButton foodright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		foodright4.setLayout(null);
		foodright4.setBounds(140, 80, 20, 20);
		foodright4.setBorderPainted(false);
		foodright4.setFocusPainted(false);
		foodright4.setContentAreaFilled(false);

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
		epspurchase1.setBorderPainted(false);
		epspurchase1.setFocusPainted(false);
		epspurchase1.setContentAreaFilled(false);

		epspurchase1.addMouseListener(new BuyMouse6());

		JButton epsleft1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft1.setLayout(null);
		epsleft1.setBounds(10, 80, 20, 20);
		epsleft1.setBorderPainted(false);
		epsleft1.setFocusPainted(false);
		epsleft1.setContentAreaFilled(false);

		JButton epsright1 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright1.setLayout(null);
		epsright1.setBounds(140, 80, 20, 20);
		epsright1.setBorderPainted(false);
		epsright1.setFocusPainted(false);
		epsright1.setContentAreaFilled(false);

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

		JButton epspurchase2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\55진주.png").getImage().getScaledInstance(60, 30, 0)));
		epspurchase2.setLayout(null);
		epspurchase2.setBounds(55, 160, 60, 30);
		epspurchase2.setBorderPainted(false);
		epspurchase2.setFocusPainted(false);
		epspurchase2.setContentAreaFilled(false);

		epspurchase2.addMouseListener(new PayMouse3());



		JButton epsleft2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft2.setLayout(null);
		epsleft2.setBounds(10, 80, 20, 20);
		epsleft2.setBorderPainted(false);
		epsleft2.setFocusPainted(false);
		epsleft2.setContentAreaFilled(false);

		JButton epsright2 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright2.setLayout(null);
		epsright2.setBounds(140, 80, 20, 20);
		epsright2.setBorderPainted(false);
		epsright2.setFocusPainted(false);
		epsright2.setContentAreaFilled(false);



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
		epspurchase3.setBorderPainted(false);
		epspurchase3.setFocusPainted(false);
		epspurchase3.setContentAreaFilled(false);

		epspurchase3.addMouseListener(new PayMouse4());

		JButton epsleft3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft3.setLayout(null);
		epsleft3.setBounds(10, 80, 20, 20);
		epsleft3.setBorderPainted(false);
		epsleft3.setFocusPainted(false);
		epsleft3.setContentAreaFilled(false);

		JButton epsright3 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright3.setLayout(null);
		epsright3.setBounds(140, 80, 20, 20);
		epsright3.setBorderPainted(false);
		epsright3.setFocusPainted(false);
		epsright3.setContentAreaFilled(false);


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
		epspurchase4.setBorderPainted(false);
		epspurchase4.setFocusPainted(false);
		epspurchase4.setContentAreaFilled(false);

		epspurchase4.addMouseListener(new PayMouse5());

		//왼쪽
		JButton epsleft4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\left.png").getImage().getScaledInstance(20, 20, 0)));
		epsleft4.setLayout(null);
		epsleft4.setBounds(10, 80, 20, 20);
		epsleft4.setBorderPainted(false);
		epsleft4.setFocusPainted(false);
		epsleft4.setContentAreaFilled(false);
		//오른쪽
		JButton epsright4 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\right.png").getImage().getScaledInstance(20, 20, 0)));
		epsright4.setLayout(null);
		epsright4.setBounds(140, 80, 20, 20);
		epsright4.setBorderPainted(false);
		epsright4.setFocusPainted(false);
		epsright4.setContentAreaFilled(false);


		robpanel1.add(rob1);
		robpanel1.add(rodattack1);
		robpanel1.add(robpurchase);
		robpanel1.add("r1",robright1);
		robpanel1.add("l1",robleft1);
		label.add(robackButton);
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
		this.add(robpanel1);
		this.add(robpanel2);
		this.add(robpanel3);

		this.add(hatpanel1);
		this.add(hatpanel2);
		this.add(hatpanel3);
		this.add(hatpanel4);

		this.add(foodpanel1);
		this.add(foodpanel2);
		this.add(foodpanel3);
		this.add(foodpanel4);

		this.add(epspanel1);
		this.add(epspanel2);
		this.add(epspanel3);
		this.add(epspanel4);

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

		this.add(label);
		//panel.add(backButton);
		this.add(panel);
		//mf.add(this);
		//	this.setResizable(false);





	}

	//	class MyMouseAdepter extends MouseAdapter{
	//		@Override
	//		public void mousePressed(MouseEvent e) {
	//			dispose();
	//		}
	//	}

	class MyMouseAdepter1 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
			//new MainShopView(mf);
		}
	}
	//낚싯대 50쓰레기
	class BuyMouse1 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 50) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						if(p.getSp()<=10) {
							p.setSp(10);
							p.setMyGarbage(p.getMyGarbage() - 50);
							HomeView.garbage -= 50;
						}
						ChangePanel.change(mf, buy, new HomeView(mf, p, HomeView.garbage, 0));

					}
				});

			}
		}
	}

	//낚싯대 150짜리
	class BuyMouse2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 150) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						if(p.getSp()<=30) {
							p.setSp(30);
							p.setMyGarbage(p.getMyGarbage() - 150);
							HomeView.garbage -= 150;
						}
						ChangePanel.change(mf, buy, new HomeView(mf, p, HomeView.garbage, 0));

					}
				});

			}
		}
	}
	//낚싯대 15진주
	class PayMouse1 extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				if(p.getMyPearl() < 15) {
					ChangePanel.changePanel(mf, panel, new LessPearl(mf, p));
				} else {
					JDialog buy = new JDialog(mf, "구매성공!");
					buy.setVisible(true);
					buy.setBounds(120, 250, 200, 200);

					JLabel ok = new JLabel("아이템을 구매하였습니다!");
					ok.setBounds(10, 30, 150, 50);

					JButton button = new JButton("확인");
					button.setBounds(0, 100, 150, 50);
					buy.add(button, BorderLayout.SOUTH);
					buy.add(ok);

					button.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							buy.dispose();
							if(p.getSp()<=50) {
								p.setSp(50);
								p.setMyPearl(p.getMyPearl() - 15);
								HomeView.pearl -= 15;
							}
							ChangePanel.change(mf, buy, new HomeView(mf, p, 0, HomeView.pearl));

						}
					});

				}
			}
		}
		
	//음식 10쓰레기
	class BuyMouse3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 10) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyGarbage(p.getMyGarbage() - 10);
						HomeView.garbage = HomeView.garbage - 10;
						Player.satiety = Player.satiety + 25;
						HomeView.maxHp += 25;
						if(Player.satiety > 236 && HomeView.maxHp > 236) {
							Player.satiety = 236;
							HomeView.maxHp = 236;
						}
						HomeView.bg_l.repaint();
						ChangePanel.change(mf, buy, new HomeView(mf, p , HomeView.garbage ,0));
					}
				});

			}
		}
	}
	
	//음식 30쓰레기
	class BuyMouse4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 30) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyGarbage(p.getMyGarbage() - 30);
						HomeView.garbage = HomeView.garbage - 30;
						Player.satiety = Player.satiety + 50;
						HomeView.maxHp += 50;
						if(Player.satiety > 236 && HomeView.maxHp > 236) {
							Player.satiety = 236;
							HomeView.maxHp = 236;
						}
						HomeView.bg_l.repaint();
						ChangePanel.change(mf, buy, new HomeView(mf, p , HomeView.garbage ,0));

					}
				});

			}
		}
	}

	//음식 50쓰레기
	class BuyMouse5 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 50) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyGarbage(p.getMyGarbage() - 50);
						HomeView.garbage = HomeView.garbage - 50;
						Player.satiety = Player.satiety + 75;
						HomeView.maxHp += 75;
						if(Player.satiety > 236 && HomeView.maxHp > 236) {
							Player.satiety = 236;
							HomeView.maxHp = 236;
						}
						HomeView.bg_l.repaint();
						ChangePanel.change(mf, buy, new HomeView(mf, p , HomeView.garbage ,0));

					}
				});

			}
		}
	}
	
	//음식 5진주
	class PayMouse2 extends MouseAdapter {
			@Override
			public void mousePressed(MouseEvent e) {
				if(p.getMyPearl() < 5) {
					ChangePanel.changePanel(mf, panel, new LessPearl(mf, p));
				} else {
					JDialog buy = new JDialog(mf, "구매성공!");
					buy.setVisible(true);
					buy.setBounds(120, 250, 200, 200);

					JLabel ok = new JLabel("아이템을 구매하였습니다!");
					ok.setBounds(10, 30, 150, 50);

					JButton button = new JButton("확인");
					button.setBounds(0, 100, 150, 50);
					buy.add(button, BorderLayout.SOUTH);
					buy.add(ok);

					button.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							buy.dispose();
							p.setMyPearl(p.getMyPearl() - 5);
							HomeView.pearl = HomeView.pearl - 5;
							Player.satiety = Player.satiety + 100;
							HomeView.maxHp += 75;
							if(Player.satiety > 236 && HomeView.maxHp > 236) {
								Player.satiety = 236;
								HomeView.maxHp = 236;
							}
							HomeView.bg_l.repaint();
							ChangePanel.change(mf, buy, new HomeView(mf, p , 0 ,HomeView.pearl));


						}
					});

				}
			}
		}
	
	//발전소 쓰레기 500짜리
	class BuyMouse6 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyGarbage() < 500) {
				ChangePanel.changePanel(mf, panel, new LessGarbage(mf, p));
				dispose();
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyGarbage(p.getMyGarbage() - 500);
						HomeView.garbage = HomeView.garbage - 500;
						HomeView.eps1bl = true;
						HomeView.bg_l.repaint();
//						Run.teps1.start();
						ChangePanel.change(mf, buy, new HomeView(mf, p, 0 ,0));

					}
				});

			}
		}
	}
	
	//발전소 진주 55짜리
	class PayMouse3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyPearl() < 55) {
				ChangePanel.changePanel(mf, panel, new LessPearl(mf, p));
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyPearl(p.getMyPearl() - 55);
						HomeView.pearl = HomeView.pearl - 55;
						HomeView.eps2bl = true;
						HomeView.bg_l.repaint();
//						Run.teps2.start();
						ChangePanel.change(mf, buy, new HomeView(mf, p, 0 ,0));

					}
				});

			}
		}
	}
	
	//발전소 진주 75짜리
	class PayMouse4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyPearl() < 75) {
				ChangePanel.changePanel(mf, panel, new LessPearl(mf, p));
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyPearl(p.getMyPearl() - 75);
						HomeView.pearl = HomeView.pearl - 75;
						HomeView.eps3bl = true;
						HomeView.bg_l.repaint();
//						Run.teps3.start();
						ChangePanel.change(mf, buy, new HomeView(mf, p, 0 ,0));

					}
				});

			}
		}
	}
	
	//발전소 진주 135짜리
	class PayMouse5 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getMyPearl() < 135) {
				ChangePanel.changePanel(mf, panel, new LessPearl(mf, p));
			} else {
				JDialog buy = new JDialog(mf, "구매성공!");
				buy.setVisible(true);
				buy.setBounds(120, 250, 200, 200);

				JLabel ok = new JLabel("아이템을 구매하였습니다!");
				ok.setBounds(10, 30, 150, 50);

				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				buy.add(button, BorderLayout.SOUTH);
				buy.add(ok);

				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						buy.dispose();
						p.setMyPearl(p.getMyPearl() - 135);
						HomeView.pearl = HomeView.pearl - 135;
						HomeView.eps4bl = true;
						HomeView.bg_l.repaint();
						//new MainShopView(mf, p).dispose();
						ChangePanel.change(mf, buy, new HomeView(mf, p, 0 ,0));

						
						//발전소추가다시

					}
				});

			}
		}
	}

	class PearlMouse1 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			new PaymentView(mf, p, 10, 1200);

		}
	}
	class PearlMouse2 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			new PaymentView(mf, p, 30, 3000);
			
			
		}
	}
	class PearlMouse3 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			new PaymentView(mf, p, 70, 6500);
			
		}
	}
	class PearlMouse4 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			new PaymentView(mf, p, 120, 10000);
			
		}
	}
}



