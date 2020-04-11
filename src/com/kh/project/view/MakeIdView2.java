package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
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
import javax.swing.JTextField;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;

public class MakeIdView2 extends JPanel{
	private JPanel makeidview2;
	private MainView mf;

	Player p = new Player();
	LoginManager lm = new LoginManager();
	JTextField tf = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);

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

		tf.setBounds(170, 130, 100, 20);

		JLabel name = new JLabel("NickName : ");
		name.setBounds(80, 145, 80, 50);

		tf2.setBounds(170, 160, 100, 20);

		JLabel phon = new JLabel("PhoneNum : ");
		phon.setBounds(80, 175, 80, 50);

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

			if(tf.getText().equals("") || tf2.getText().equals("") || tf3.getText().equals("")) {


				//이메일 입력 안했을 때 
				if(tf.getText().equals("")) {
					Dialog email = new Dialog(mf, "이메일 입력");
					email.setBounds(120, 250, 200, 200);
					email.setVisible(true);

					JLabel emailt = new JLabel("이메일을 입력하세요.");
					emailt.setBounds(10, 30, 150, 50);

					JButton check = new JButton("확인");
					check.setSize(150, 50);
					check.setLocation(0, 100);

					email.add(emailt);
					email.add(check, BorderLayout.SOUTH);

					check.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							email.dispose(); return;

						}
					});

				}
				//닉네임 입력 안했을 때
				if(tf2.getText().equals("")) {
					Dialog name = new Dialog(mf, "닉네임 입력");
					name.setBounds(120, 250, 200, 200);
					name.setVisible(true);

					JLabel namet = new JLabel("닉네임을 입력하세요.");
					namet.setBounds(10, 30, 150, 50);

					JButton check2 = new JButton("확인");
					check2.setSize(150, 50);
					check2.setLocation(0, 100);

					name.add(namet);
					name.add(check2, BorderLayout.SOUTH);

					check2.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							name.dispose(); return;

						}
					});

				}

				//핸드폰 번호 입력 안했을 때
				if(tf3.getText().equals("")) {
					Dialog pnum = new Dialog(mf, "이메일 입력");
					pnum.setBounds(120, 250, 200, 200);
					pnum.setVisible(true);

					JLabel pnumt = new JLabel("이메일을 입력하세요.");
					pnumt.setBounds(10, 30, 150, 50);

					JButton check3 = new JButton("확인");
					check3.setSize(150, 50);
					check3.setLocation(0, 100);

					pnum.add(pnumt);
					pnum.add(check3, BorderLayout.SOUTH);

					check3.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							pnum.dispose(); return;

						}
					});

				}
			} else {
				p.setEmail(tf.getText());
				p.setUserName(tf2.getText());
				p.setPhoneNumber(tf3.getText());
				lm.MakeId(p);
				ChangePanel.changePanel(mf, makeidview2, new LoginView(mf));
			}


		}
	}

}
