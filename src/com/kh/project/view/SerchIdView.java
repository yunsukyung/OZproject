package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;
import com.kh.project.view.MakeIdView2.MyMouseAdapter;

public class SerchIdView extends JPanel{
	private MainView mf;
	private JPanel serchidview;
	
	Player p = new Player();
	LoginManager lm = new LoginManager();
	JTextField tf = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	
	public SerchIdView(MainView mf) {
		this.serchidview = this;
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
			p = lm.SearchId(tf.getText(), tf2.getText(), tf3.getText());
			if(p != null) {
				Dialog searchid = new Dialog(mf, "find ID / password");
				searchid.setVisible(true);
				searchid.setBounds(150, 250, 150, 150);
				
				//찾는 아이디랑 비번 안나오고 null값나옴
				JLabel id = new JLabel("ID : " + p.getUserId());
				id.setBounds(10, 30, 150, 50);
				JLabel pass = new JLabel("PW : " + p.getUserPwd());
				pass.setBounds(10, 50, 150, 50);
				
				
				JButton cheak = new JButton("확인");
				cheak.setBounds(0, 100, 150, 50);
				searchid.add(cheak);
				searchid.add(id);
				searchid.add(pass);
				
				cheak.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						searchid.dispose();
						ChangePanel.changePanel(mf, serchidview, new LoginView(mf));
					}
				});
			} else {
				//이메일이랑 닉네임, 폰번호 다르면 뜨는 창
				Dialog searchid = new Dialog(mf, "find ID / password");
				searchid.setVisible(true);
				searchid.setBounds(120, 250, 200, 200);
				
				
				JLabel id = new JLabel("<html>찾는 아이디와 비밀번호가 없습니다.<html>");
				id.setBounds(10, 30, 150, 50);
				
				
				
				JButton cheak = new JButton("확인");
				cheak.setBounds(0, 100, 150, 50);
				searchid.add(cheak, BorderLayout.SOUTH);
				searchid.add(id);
				
				
				cheak.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						searchid.dispose();
						ChangePanel.changePanel(mf, serchidview, new LoginView(mf));
						
					}
				});
			}
			
			
			
		}
	}
}
