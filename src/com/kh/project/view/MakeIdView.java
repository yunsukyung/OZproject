package com.kh.project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;

public class MakeIdView extends JPanel{	
	private JPanel makeidview;
	private MainView mf;

	Player p = new Player();
	LoginManager lm = new LoginManager();

	JPasswordField tf2 = new JPasswordField(10);
	JPasswordField tf3 = new JPasswordField(10);
	JTextField tf = new JTextField(10);
	public MakeIdView(MainView mf) {
		this.makeidview = this;
		this.mf = mf;
		this.setLocation(0, 0);
		this.setSize(360, 640);


		JLabel back = new JLabel(new ImageIcon(new ImageIcon("src/image/start/시작 배경.png").getImage().getScaledInstance(360, 640, 0)));
		back.setBounds(0, 0, 360, 640);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(458, 458, 0)));
		label.setBounds(0, 0, 360, 458);

		JButton next = new JButton(new ImageIcon(new ImageIcon("src/image/start/next.png").getImage().getScaledInstance(60, 20, 0)));

		next.setBounds(150, 220, 60, 20);


		JLabel id = new JLabel("ID : ");
		id.setBounds(90, 115, 50, 50);

		tf.setBounds(170, 130, 100, 20);

		JLabel pwd = new JLabel("pass : ");
		pwd.setBounds(90, 145, 80, 50);

		tf2.setBounds(170, 160, 100, 20);

		JLabel passcheck = new JLabel("passcheck : ");
		passcheck.setBounds(90, 175, 80, 50);

		tf3.setBounds(170, 190, 100, 20);

		next.addMouseListener(new MymouseAdapter());

		label.add(id);
		label.add(tf);
		label.add(pwd);
		label.add(tf2);
		label.add(passcheck);
		label.add(tf3);

		label.add(next);
		back.add(label);
		this.add(back);

		mf.add(this);
		mf.revalidate();

	}
	class MymouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(lm.CheckId(tf.getText())) {
				if(tf2.getPassword().length > 5 && tf3.getPassword().length > 5) {
					if(lm.CheckPwd(tf2.getPassword(),tf3.getPassword())){
						ChangePanel.changePanel(mf, makeidview, new MakeIdView2(mf, p));
					}
					}
			}
		}

	}
}
