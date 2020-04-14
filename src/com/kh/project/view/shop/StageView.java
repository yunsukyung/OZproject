package com.kh.project.view.shop;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import com.kh.project.model.vo.Player;
import com.kh.project.view.ChangePanel;
import com.kh.project.view.HowToPlayView;
import com.kh.project.view.InGameView;
import com.kh.project.view.MainView;

public class StageView extends JPanel {

	private JPanel stageView;
	private MainView mf;
	Player p;
	boolean f = false;
	
	public StageView(MainView mf, Player p) {
		this.stageView = this;
		this.mf = mf;
		this.p = p;
		
		
		//위치 초기화
		this.setLayout(null);

		this.setLocation(0, 0);
		this.setSize(360, 640);
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		JLabel label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);


		//stage1
		JButton button9 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage1.png").getImage().getScaledInstance(89, 90, 0)));
		button9.setBounds(28, 215, 89, 90);
		
		button9.addMouseListener(new MyMouseAdapter());
		
		//stage2
		JButton button10 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage2.png").getImage().getScaledInstance(89, 90, 0)));
		button10.setBounds(133, 215, 89, 90);
		
		//stage3
		JButton button11 = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\stage3.png").getImage().getScaledInstance(89, 90, 0)));
		button11.setBounds(238, 215, 89, 90);
		
		

		
		//stage 뒷배경
		JLabel label6 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\스테이지배경.png").getImage().getScaledInstance(337, 186, 0)));
		label6.setBounds(10, 166, 337, 186);

	
		
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
		
		this.add(label6);		//stage뒷배경

		this.add(label);		//배경
		mf.add(this);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(!f) {
				ChangePanel.changePanel(mf, stageView, new HowToPlayView(mf, p));
				f = true;
			} else {
				InGameView iv = new InGameView(mf, p);
				Thread t2 = new Thread(iv);
				t2.start();
				ChangePanel.changePanel(mf, stageView, iv);

			}
		}
	}


}

