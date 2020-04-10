package com.kh.project.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;

public class MakeIdView2 extends JPanel{
	private JPanel makeidview2;
	private MainView mf;

	Player p = new Player();
	LoginManager lm = new LoginManager();
	
	public MakeIdView2(MainView mf, Player p) {
		this.p = p;
		this.makeidview2 = this;
		this.mf = mf;
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		JLabel back = new JLabel(new ImageIcon(new ImageIcon("src/image/start/시작 배경.png").getImage().getScaledInstance(360, 640, 0)));
		back.setBounds(0, 0, 360, 640);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(458, 458, 0)));
		label.setBounds(0, 0, 360, 458);
		
		JButton enter = new JButton(new ImageIcon(new ImageIcon("src/image/start/enter.png").getImage().getScaledInstance(60, 20, 0)));
		
		enter.setBounds(150, 220, 60, 20);
		
		JLabel email = new JLabel("Email : ");
		email.setBounds(80, 115, 50, 50);
		JTextField tf = new JTextField(10);
		tf.setBounds(170, 130, 100, 20);
		
		JLabel name = new JLabel("NickName : ");
		name.setBounds(80, 145, 80, 50);
		JTextField tf2 = new JTextField(10);
		tf2.setBounds(170, 160, 100, 20);
		
		JLabel phon = new JLabel("PhoneNum : ");
		phon.setBounds(80, 175, 80, 50);
		JTextField tf3 = new JTextField(10);
		tf3.setBounds(170, 190, 100, 20);
		
		enter.addMouseListener(new MyMouseAdapter());
		

		
		label.add(email);
		label.add(tf);
		label.add(name);
		label.add(tf2);
		label.add(phon);
		label.add(tf3);
		label.add(enter);
		back.add(label);
		this.add(back);
		
		mf.add(this);
		mf.revalidate();
		
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, makeidview2, new LoginView(mf));
		}
	}

}
