package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
	
	JLabel check;
	
	
	public MakeIdView(MainView mf) {
		this.makeidview = this;
		this.mf = mf;
		this.setLocation(0, 0);
		this.setSize(360, 640);
		

		JLabel back = new JLabel(new ImageIcon(new ImageIcon("src/image/start/시작 배경.png").getImage().getScaledInstance(360, 640, 0)));
		back.setBounds(0, 0, 360, 640);
		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(458, 458, 0)));
		label.setBounds(0, 0, 360, 458);

		check = new JLabel(new ImageIcon(new ImageIcon("src/image/start/checked.png").getImage().getScaledInstance(20, 20, 0)));
		check.setBounds(275, 200, 20, 20);
		check.setVisible(false);
		
		JButton next = new JButton(new ImageIcon(new ImageIcon("src/image/start/next.png").getImage().getScaledInstance(60, 20, 0)));

		next.setBounds(150, 220, 60, 20);

		next.addMouseListener(new MymouseAdapter());


		JLabel id = new JLabel("ID : ");
		id.setBounds(90, 115, 50, 50);

		tf.setBounds(170, 130, 100, 20);

		JLabel pwd = new JLabel("pass : ");
		pwd.setBounds(90, 145, 80, 50);

		tf2.setBounds(170, 160, 100, 20);
		
		tf3.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					String str = "";
					String str2 = "";
					
					
					for(int i = 0; i < tf2.getPassword().length; i++) {
						str += tf2.getPassword()[i];
						System.out.println(str);
					}
					for(int i = 0; i < tf3.getPassword().length; i++) {
						str2 += tf3.getPassword()[i];
						System.out.println(str2);
					}
					
					System.out.println(str + ", " + str2);
					
					if(!str.equals("") && str.equals(str2)) {
						check.setVisible(true);
					} else {
						check.setVisible(false);
					}
				}
				
			}
		});
		
		JLabel pass = new JLabel("*6글자 이상으로 해주세요.");
		pass.setBounds(90, 180, 200, 20);
		pass.setFont(new Font("고딕", Font.BOLD, 12));
		pass.setForeground(Color.RED);

		JLabel passcheck = new JLabel("passcheck : ");
		passcheck.setBounds(90, 185, 80, 50);

		tf3.setBounds(170, 200, 100, 20);
		

		label.add(check);
		label.add(id);
		label.add(tf);
		label.add(pwd);
		label.add(tf2);
		label.add(pass);
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
			if(lm.CheckId(tf.getText()) == false) {

				Dialog idcheck = new Dialog(mf, "중복된 아이디");
				idcheck.setBounds(120, 250, 200, 200);
				idcheck.setVisible(true);

				JLabel id = new JLabel("<html>중복된 아이디 입니다.<br/>아이디를 다시 입력하세요.<html>");
				id.setBounds(10, 30, 150, 50);

				JButton check = new JButton("확인");
				check.setSize(150, 50);
				check.setLocation(0, 100);

				idcheck.add(id);
				idcheck.add(check, BorderLayout.SOUTH);



				check.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						idcheck.dispose(); return;

					}
				});
			}
				else {
				if(tf2.getPassword().length > 5 && tf3.getPassword().length > 5) {
					if(lm.CheckPwd(tf2.getPassword(),tf3.getPassword()) == true){
						p.setUserId(tf.getText());
						char[] pw = new char[tf2.getPassword().length];
						String str = "";
						pw = tf2.getPassword();

						for(int i = 0; i < pw.length; i++) {
							str += pw[i];
						}
						p.setUserPwd(str);
						ChangePanel.changePanel(mf, makeidview, new MakeIdView2(mf, p));
					} else {
						Dialog passcheck = new Dialog(mf, "비밀번호");
						passcheck.setBounds(120, 250, 200, 200);
						passcheck.setVisible(true);

						JLabel pass = new JLabel("<html>입력하신 비밀번호가 다릅니다.<br/>비밀번호를 다시 입력하세요.<html>");
						pass.setBounds(10, 30, 150, 50);

						JButton check2 = new JButton("확인");
						check2.setSize(150, 50);
						check2.setLocation(0, 100);

						passcheck.add(pass);
						passcheck.add(check2, BorderLayout.SOUTH);



						check2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								passcheck.dispose(); return;

							}
						});

					}
				}
			}	



		}

	}
	class MyKeyAdapter extends KeyAdapter {
		
		public void keypressed(KeyEvent e) {
			if(e.getKeyChar() == KeyEvent.VK_ENTER) {
				String str = "";
				String str2 = "";
				
				
				for(int i = 0; i < tf2.getPassword().length; i++) {
					str += tf2.getPassword()[i];
					System.out.println(str);
				}
				for(int i = 0; i < tf3.getPassword().length; i++) {
					str2 += tf3.getPassword()[i];
					System.out.println(str2);
				}
				
				System.out.println("str : " + str + ", str2 : " + str2);
				
				if(str.equals(str2)) {
					check.setVisible(true);
				}
			}
		}
		
	}
}
