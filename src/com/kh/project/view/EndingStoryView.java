package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.Player;
import com.kh.project.view.StartStoryView.MyMouseAdapter;

public class EndingStoryView extends JPanel {
	private JPanel startStory;
	private MainView mf;
	private JLabel text1;
	private JLabel label2;
	private int x = 0;
	int count = 0;
	Player p = new Player();
	public EndingStoryView(MainView mf, Player p) {
		this.mf = mf;
		this.p = p;
		this.startStory = this;


		this.setLocation(0, 0);
		this.setSize(360, 640);





		Image icon = new ImageIcon("src/image/start/스토리 배경.jpg").getImage().getScaledInstance(570, 640, 0);
		JLabel label = new JLabel(new ImageIcon(icon));


		Image penguin = new ImageIcon("src/image/start/화이팅펭.gif").getImage().getScaledInstance(200, 200, 0);
		label2 = new JLabel(new ImageIcon(penguin));
		label2.setLocation(210, 210);
		label2.setSize(200, 200);

		Image text = new ImageIcon("src/image/start/대화창.png").getImage().getScaledInstance(350, 170, 0);
		JLabel label3 = new JLabel(new ImageIcon(text));
		label3.setLocation(120, 380);
		label3.setSize(350, 300);


		Image next = new ImageIcon("src/image/start/화면넘기기.png").getImage().getScaledInstance(30, 40, 0);
		JButton button = new JButton(new ImageIcon(next));
		button.setLocation(395, 560);
		button.setSize(30, 40);
		button.setBackground(Color.red);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);


		text1 = new JLabel();
		text1.setText("내가 이곳의 쓰레기를 모두 치웠어!!!");
		text1.setBounds(30, 0, 350, 200);
		label3.add(text1);

		
		button.addMouseListener(new MyMouseAdapter());




		label.add(button, BorderLayout.CENTER);
		label.add(label2, BorderLayout.CENTER);
		label.add(label3, BorderLayout.CENTER);
		this.add(label);



		mf.add(this);









		mf.revalidate();

	}

	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			
			count++;
			if(count == 1) {
				text1.setText("이제 더이상 다른곳으로 갈\r\n" + 
						"필요가 없을거 같아!!");
				nextText1();
				
			} else if(count == 2) {
				text1.setText( 
						"다른 섬 친구들은 어떻게 지낼까?\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"                   Comming Soon...");
				
			} else if(count == 6) {
				ChangePanel.changePanel(mf, startStory, new HomeView(mf, p));
			}


		}
	}
	
	public void nextText1() {
		
		Image penguin = new ImageIcon("src/image/start/뒹굴펭.gif").getImage().getScaledInstance(180, 200, 0);
		ImageIcon peng = new ImageIcon(penguin);
		label2.setIcon(peng);
		
		
	}



}
