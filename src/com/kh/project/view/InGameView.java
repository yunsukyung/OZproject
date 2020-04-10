package com.kh.project.view;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.controller.SpawnManager;
import com.kh.project.model.vo.*;

public class InGameView extends JPanel implements Runnable{
	private MainView mf;
	private InGameView inGameView;
	JLabel label;
	Garbage g = new G_Bottle();
	
	SpawnManager sm = new SpawnManager();
	public InGameView(MainView mf) {
		
		this.inGameView = this;
		this.mf = mf;

		this.setLayout(null);
		
		Image background = new ImageIcon("src/image/game/InGameImage.png").getImage().getScaledInstance(360, 640, 0);
		label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);

		
		System.out.println("!@3123");
		System.out.println("111");

		this.add(label);
		mf.add(this);
		mf.repaint();
	}
	
	@Override
	public void run() {
		int count = 0;
		Image item = new ImageIcon("src/image/game/beer1.png").getImage().getScaledInstance(100, 100, 0);
		JLabel label1 = new JLabel(new ImageIcon(item));
		JLabel la = ((G_Bottle)g).getLabel();
		
		while(count != 100) {
		try {
			label.add(sm.getLabels()[count]);
			for(int i = 0; i < count; i ++) {
				sm.getGarb()[i].setLife(sm.getGarb()[i].getLife()-1);
				if(sm.getGarb()[i].getLife() == 0) {
					sm.getLabels()[i].setBounds(1000,1000,40,40);
				}
			}
			label.repaint();
			Thread.sleep(500);
			count++;
			//System.out.println(sm.getLabels()[count].getLocation());
			System.out.println(sm.getGarb()[0].getLife());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		la.setBounds(300,300,100,100);
		label.add(la);
		label.repaint();
	}
}


