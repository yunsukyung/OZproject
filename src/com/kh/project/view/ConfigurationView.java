package com.kh.project.view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import com.kh.project.controller.LoginManager;
import com.kh.project.model.vo.Player;



public class ConfigurationView extends JDialog {
	private JDialog mo;
	private MainView mf;
	LoginManager lm = new LoginManager();
	Player p = new Player();
	public ConfigurationView(MainView mf, Player p) {
		this.mf = mf;
		this.mo = this;
		this.p = p;
		this.setBounds(57, 180, 230, 400);
		//this.setUndecorated(true);
		this.setVisible(true);
		//this.setBackground(new Color(0, 0, 0, 0));
		
		
		
		JPanel mo = new JPanel();
		mo.setLayout(null);
		mo.setBackground(new Color(0, 0, 0, 0));
		
		JLabel pan = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\settingback.png").getImage().getScaledInstance(250, 420, 0)));
		pan.setBounds(-10, -35, 250, 420);
		
		JButton quitbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\quitbutton.png").getImage().getScaledInstance(119, 33, 0)));
		quitbutton.setLayout(null);
		quitbutton.setBounds(50, 180, 119, 33);
		quitbutton.setBorderPainted(false);
		quitbutton.setFocusPainted(false);
		quitbutton.setContentAreaFilled(false);
		
		quitbutton.addMouseListener(new MyMouseAdepter2());
		
		JButton howtoplaybutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\howtoplaybutton.png").getImage().getScaledInstance(119, 33, 0)));
		howtoplaybutton.setLayout(null);
		howtoplaybutton.setBounds(50, 130, 119, 33);
		howtoplaybutton.setBorderPainted(false);
		howtoplaybutton.setFocusPainted(false);
		howtoplaybutton.setContentAreaFilled(false);
		
		howtoplaybutton.addMouseListener(new MyMouseAdepter3());
		
		
		JButton imforbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\inforbutton.png").getImage().getScaledInstance(119, 33, 0)));
		imforbutton.setLayout(null);
		imforbutton.setBounds(50, 230, 119, 33);
		imforbutton.setBorderPainted(false);
		imforbutton.setFocusPainted(false);
		imforbutton.setContentAreaFilled(false);
		
		imforbutton.addMouseListener(new MyMouseAdepter4());
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(58, 300, 98, 35);
		backbutton.addMouseListener(new MyMouseAdapter());
		
		
		JSlider s = new JSlider(0,10,5);
		s.setMinorTickSpacing(1);
		s.setMajorTickSpacing(5);
		s.setPaintTicks(true);
		s.setLabelTable(s.createStandardLabels(10));
		s.setPaintLabels(true);
		s.setSnapToTicks(true);
		
        s.setBounds(50,80,115,40);
        this.add(s); 
        
		mo.add(backbutton);
		mo.add(howtoplaybutton);
		mo.add(imforbutton);
		mo.add(quitbutton);
		mo.add(pan);
		
		
		this.add(mo);
		this.setResizable(false); 
		
	}
	
	//셋팅나가기
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
	
	//게임끄기
	class MyMouseAdepter2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println(lm.SaveId(p.getUserId(), p));
			System.exit(0);
		}
	}
	
	//사용방법
	class MyMouseAdepter3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
			ChangePanel.change(mf, mo, new ExplainView(mf, p));
		}
	}
	
	//infor
	class MyMouseAdepter4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
			ChangePanel.change(mf, mo, new InforMationView(mf, p));
		}
	}
	
	
}
