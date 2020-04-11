package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.GridLayout;
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
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;
//아이디랑 비번입력안하면 아이디 또는 비밀번호를 입력하세요 뜨게해야함
public class LoginView extends JPanel{

	private MainView mf;
	private JPanel loginView;
	JTextField Idtf = new JTextField(30);
	JPasswordField password = new JPasswordField(30);
	LoginManager lm = new LoginManager();
	Player p = new Player();
	public LoginView(MainView mf) {
		this.mf = mf;
		this.loginView = this;
		System.out.println(this.getLocation());
		this.setLocation(0, 0);
		this.setSize(360, 640);

		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src/image/start/시작 배경.png").getImage().getScaledInstance(360, 640, 0)));


		JLabel label = new JLabel(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(458, 458, 0)));
		label.setLocation(0, 0);
		label.setSize(360, 458);

		JLabel Id = new JLabel("ID");
		Id.setBounds(110, 135, 50, 50);

		Idtf.setBounds(180, 150, 100, 20);


		JLabel pass = new JLabel("PW");
		pass.setBounds(110, 165, 80, 50);
		password.setBounds(180, 180, 100, 20);


		Image login = new ImageIcon("src/image/start/in.png").getImage().getScaledInstance(60, 20, 0);
		Image singUp = new ImageIcon("src/image/start/up.png").getImage().getScaledInstance(60, 20, 0);
		Image findId = new ImageIcon("src/image/start/id.png").getImage().getScaledInstance(60, 20, 0);

		JButton button1 = new JButton(new ImageIcon(login));

		button1.setBounds(80, 220, 60, 20);
		JButton button2 = new JButton(new ImageIcon(singUp));
		button2.setBounds(150, 220, 60, 20);
		JButton button3 = new JButton(new ImageIcon(findId));
		button3.setBounds(220, 220, 60, 20);

		button1.addMouseListener(new MyMouseAdapter());
		button2.addMouseListener(new MyMouseAdapter2());
		button3.addMouseListener(new MyMouseAdapter3());

		label.add(Id);
		label.add(Idtf);
		label.add(pass);
		label.add(password);
		label.add(button1);
		label.add(button2);
		label.add(button3);



		background.add(label, BorderLayout.CENTER);
		this.add(background);
		mf.add(this);
		mf.revalidate();
	}

	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			
			p = lm.LoginId(Idtf.getText(), password.getPassword());
			
			char[] pass = new char[password.getPassword().length];
			String str = "";
			for(int i = 0; i < password.getPassword().length; i++) {
				pass[i] = password.getPassword()[i];
				
				str += pass[i];
				
			}
			
			
			//유저 아이디랑 비번 무조건 널값
			if(p.getUserId().equals(Idtf.getText()) && p.getUserPwd().equals(str)) {
				ChangePanel.changePanel(mf, loginView, new StartStoryView(mf, p));
			} else {
				Dialog check = new Dialog(mf, "아이디, 비밀번호 오류");
				check.setVisible(true);
				check.setBounds(120, 250, 200, 200);
				
				
				JLabel id = new JLabel("<html>아이디 또는 비밀번호가 다릅니다.<html>");
				id.setBounds(10, 30, 150, 50);
				
				
				
				JButton button = new JButton("확인");
				button.setBounds(0, 100, 150, 50);
				check.add(button, BorderLayout.SOUTH);
				button.add(id);
				
				
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						check.dispose(); return;
						
					}
				});
			}
			



		}
	}
	class MyMouseAdapter2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, loginView, new MakeIdView(mf));

		}

	}
	class MyMouseAdapter3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, loginView, new SerchIdView(mf));
		}
	}




}
