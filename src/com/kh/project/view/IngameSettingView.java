package com.kh.project.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.Player;
import com.kh.project.view.ConfigurationView.MyMouseAdapter;

public class IngameSettingView extends JDialog {
	private JDialog inset;
	private MainView mf;
	Player p = new Player();
	public IngameSettingView(MainView mf, Player p) {
		this.mf = mf;
		this.inset = this;
		this.setBounds(57, 180, 230, 400);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 0));
		
		JLabel background = new JLabel(new ImageIcon(new ImageIcon("src/image/start/ingameback.png").getImage().getScaledInstance(245, 420, 0)));
		background.setBounds(-10, -30, 245, 420);
		
		JButton goHomebutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/gohome.png").getImage().getScaledInstance(130, 40, 0)));
		goHomebutton.setLayout(null);
		goHomebutton.setBounds(50, 150, 130, 40);
		goHomebutton.setBorderPainted(false);
		goHomebutton.setFocusPainted(false);
		goHomebutton.setContentAreaFilled(false);
		
		goHomebutton.addMouseListener(new MyMouseAdapter());
		
		JButton backbutton = new JButton(new ImageIcon(new ImageIcon("src/image/start/back.png").getImage().getScaledInstance(98, 35, 0)));
		backbutton.setLayout(null);
		backbutton.setBounds(60, 300, 98, 35);
		backbutton.addMouseListener(new MyMouseAdapter1());
		
		panel.add(backbutton);
		panel.add(goHomebutton);
		panel.add(background);
		this.add(panel);
		this.setResizable(false);
		
		
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
			ChangePanel.change(mf, inset, new HomeView(mf, p));
		}
	}
	class MyMouseAdapter1 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			dispose();
		}
	}
}
