package com.kh.project.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G_LoveLetter extends Garbage{
	
	Image image;
	JLabel label;
	Image hpImage;
	JLabel hpLabel;
	
	private int hps = 40;
	int random1 = new Random().nextInt(1000)+1;
	int random2 = new Random().nextInt(500)+100;
	
	public G_LoveLetter() {
		super(1,0);
		int random = new Random().nextInt(2);
		if(random == 0) image = new ImageIcon("src/image/start/편지병."
				+ "png").getImage().getScaledInstance(40, 40, 0);
		else if(random == 1) image = new ImageIcon("src/image/game/LoveLetter."
				+ "png").getImage().getScaledInstance(40, 40, 0);

		hpImage = new ImageIcon("src/image/game/hpBar.png").getImage().getScaledInstance(40, 6, 0);
		hpLabel = new JLabel(new ImageIcon(hpImage));
		hpLabel.setBounds(random1, random2 - 10, 40, 10);
		
		label = new JLabel(new ImageIcon(image));
		label.setBounds(random1,random2,40,40);
	}
	
	public Image getImage() {
		return image;
	}
	public JLabel getLabel() {
		return label;
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
		super.setHp(super.getHp() - attack);
		hps -= attack;
		hpLabel.setBounds(random1,random2 - 10,hps - attack,6);
	}

	@Override
	public String toString() {
		return "G_LoveLetter";
	}

}
