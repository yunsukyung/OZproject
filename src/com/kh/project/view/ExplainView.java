package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.kh.project.model.vo.Player;


public class ExplainView extends JPanel{
	private JPanel explainView;
	private MainView mf;
	Player p;
	public ExplainView(MainView mf, Player p) {
		this.explainView = this;
		this.mf = mf;
		this.p = p;
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		Image background = new ImageIcon("src/image/start/튜토리얼.png").getImage().getScaledInstance(360, 640, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		
		label.addMouseListener(new MyMouseAdapter());
		
		this.add(label, BorderLayout.CENTER);
		mf.add(this);
		this.add(label);
		mf.revalidate();
	}
	class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			ChangePanel.changePanel(mf, explainView, new HomeView(mf, p));
		}
	}
	


}
