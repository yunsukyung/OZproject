package com.kh.project.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class G_LoveLetter extends Garbage{
	Image image;
	JLabel label;
	public G_LoveLetter() {
		super(1,0);
		int random1 = new Random().nextInt(300)+1;
		int random2 = new Random().nextInt(500)+100;
		int random = new Random().nextInt(2);
		if(random == 0) image = new ImageIcon("src/image/game/beer1."
				+ "png").getImage().getScaledInstance(40, 40, 0);
		else if(random == 1) image = new ImageIcon("src/image/game/beer2."
				+ "png").getImage().getScaledInstance(40, 40, 0);

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
	@Override
	public String toString() {
		return "G_LoveLetter";
	}

}
