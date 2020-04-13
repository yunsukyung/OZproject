package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.Player;

public class InforMationView extends JPanel{
	private JPanel informationview;
	private MainView mf;
	Player p = new Player();
	public InforMationView(MainView mf) {
		this.informationview = this;
		this.mf = mf;
		
		this.setLocation(0, 0);
		this.setSize(360,640);

		//바다뒷배경
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\바다뒷배경.png").getImage().getScaledInstance(360, 640, 0)));

		//만든사람들
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\만든사람들.png").getImage().getScaledInstance(324, 387, 0)));
		label.setLocation(18, 151);
		label.setSize(324, 387);

		//광고판
		JLabel label2 = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\KH정보교육원.png").getImage().getScaledInstance(360, 63, 0)));
		label2.setLocation(0, 0);
		label2.setSize(360,63);

		//백버튼
		JButton backButton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\빽.png").getImage().getScaledInstance(98, 35, 0)));
		backButton.setLocation(131,495);
		backButton.setSize(98, 35);
		
		backButton.addMouseListener(new MyMouseAdapter());

		background.add(backButton);
		background.add(label2);


		background.add(label, BorderLayout.CENTER);
		this.add(background);
		mf.add(this);
		mf.revalidate();

	}
	
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, informationview, new HomeView(mf, p));
		}
	}

}
