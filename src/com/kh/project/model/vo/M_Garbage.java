package com.kh.project.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class M_Garbage {
	Image garbage1;
	
	JLabel gb_l;
	
	int random1 = new Random().nextInt(4);
	int ranx = new Random().nextInt(300);
	int rany = 0;
	
	
	public M_Garbage() {
		int random = new Random().nextInt(3);
		if(random == 0) garbage1 = new ImageIcon("src/image/minigame/담배.png").getImage().getScaledInstance(50, 50, 0);
		else if(random == 1) garbage1 = new ImageIcon("src/image/minigame/can1.png").getImage().getScaledInstance(50, 50, 0);
		else if(random == 2) garbage1 = new ImageIcon("src/image/minigame/과자봉지.png").getImage().getScaledInstance(50, 50, 0);
		if(random1 == 0) rany = 520;
		else if(random1 == 1) rany = 370;
		else if(random1 == 2) rany = 220;
		else if(random1 == 3) rany = 70;
		
		gb_l = new JLabel(new ImageIcon(garbage1));
		gb_l.setBounds(ranx, rany, 50, 50);
		
		
		
	}


	public Image getGarbage1() {
		return garbage1;
	}


	public void setGarbage1(Image garbage1) {
		this.garbage1 = garbage1;
	}


	public JLabel getGb_l() {
		return gb_l;
	}


	public void setGb_l(JLabel gb_l) {
		this.gb_l = gb_l;
	}


	public int getRandom1() {
		return random1;
	}


	public void setRandom1(int random1) {
		this.random1 = random1;
	}


	public int getRanx() {
		return ranx;
	}


	public void setRanx(int ranx) {
		this.ranx = ranx;
	}


	public int getRany() {
		return rany;
	}


	public void setRany(int rany) {
		this.rany = rany;
	}
	
	
	
	
}
