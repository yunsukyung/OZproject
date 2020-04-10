package com.kh.project.view.shop;

import java.awt.Image;

import javax.swing.*;

import com.kh.project.view.MainView;

public class StageView extends JPanel {

	private JPanel startPage;
	private MainView mf;
	public StageView(MainView mf) {
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
		
		//stage1
		JButton button9 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage1.png").getImage().getScaledInstance(89, 90, 0)));
		button9.setBounds(28, 215, 89, 90);
		
		//stage2
		JButton button10 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage2.png").getImage().getScaledInstance(89, 90, 0)));
		button10.setBounds(133, 215, 89, 90);
		
		//stage3
		JButton button11 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage3.png").getImage().getScaledInstance(89, 90, 0)));
		button11.setBounds(238, 215, 89, 90);
		
		



		//하트
		JLabel label1 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/heartbeat.png").getImage().getScaledInstance(25, 25, 0)));
		label1.setBounds(20, 10, 25, 25);

		//쓰레기 현황
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/trash.png").getImage().getScaledInstance(25, 25, 0)));
		label2.setBounds(20, 35, 25, 25);

		//진주 현황
		JLabel label3 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\진주2.png").getImage().getScaledInstance(25, 25, 0)));
		label3.setBounds(20, 60, 25, 25);

		//포만감 현황 배경
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 80.png").getImage().getScaledInstance(236, 12, 0)));
		label4.setBounds(23, 15, 236, 12);

		//포만감 감소
		JLabel label5 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 81.png").getImage().getScaledInstance(200, 12, 0)));
		label5.setBounds(23, 15, 200, 12);
		
		//stage 뒷배경
		JLabel label6 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\스테이지배경.png").getImage().getScaledInstance(337, 186, 0)));
		label6.setBounds(10, 166, 337, 186);

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
		
		//stage1
		button9.setBorderPainted(false);
		button9.setFocusPainted(false);
		button9.setContentAreaFilled(false);
		
		//stage2
		button10.setBorderPainted(false);
		button10.setFocusPainted(false);
		button10.setContentAreaFilled(false);

		//stage3
		button11.setBorderPainted(false);
		button11.setFocusPainted(false);
		button11.setContentAreaFilled(false);
		
		this.add(button9);		//stage1
		this.add(button10);		//stage2
		this.add(button11);		//stage3	
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
		this.add(label6);		//stage뒷배경

		this.add(label);		//배경
		mf.add(this);
	}


}

