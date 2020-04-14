package com.kh.project.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G_Mac extends Garbage{
	private int havePearl;

	Image image;
	JLabel label;
	Image hpImage;
	JLabel hpLabel;

	private int hps = 40;
	int random1 = new Random().nextInt(1000)+1;
	int random2 = new Random().nextInt(500)+100;
	
	public G_Mac() {
		super(40, 0);image = new ImageIcon("src/image/game/MacBook."
				+ "png").getImage().getScaledInstance(100, 100, 0);

		hpImage = new ImageIcon("src/image/game/hpBar.png").getImage().getScaledInstance(100, 6, 0);
		hpLabel = new JLabel(new ImageIcon(hpImage));
		hpLabel.setBounds(random1, random2 - 10, 40, 10);
		
		label = new JLabel(new ImageIcon(image));
		label.setBounds(random1,random2,100,100);
		havePearl = 1;
	}
	
	
	public int getHps() {
		return hps;
	}


	public void setHps(int hps) {
		this.hps = hps;
	}


	public int getHavePearl() {
		return havePearl;
	}
	public Image getImage() {
		return image;
	}
	public JLabel getLabel() {
		return label;
	}
	public void setHavePearl(int havePearl) {
		this.havePearl = havePearl;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public Image getHpImage() {
		return hpImage;
	}

	public JLabel getHpLabel() {
		return hpLabel;
	}

	public void setHpImage(Image hpImage) {
		this.hpImage = hpImage;
	}

	public void setHpLabel(JLabel hpLabel) {
		this.hpLabel = hpLabel;
	}
	public void hpControl(int attack) {
		int at = 0;
		if(attack == 10) {
			at = 1;
		} else if ( attack == 30) {
			at = 2;
		} else if ( attack == 50) {
			at = 4;
		}
		hps -= at;
		super.setHp(hps);
		hpLabel.setBounds(random1,random2 - 10,hps,6);
	}

	@Override
	public String toString() {
		return "G_Mac";
	}

}
