package com.kh.project.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class ConfigurationView extends JFrame {
	private JFrame mo;
	private MainView mf;
	public ConfigurationView(MainView mf) {
		this.mf = mf;
		this.mo = this;
		this.setBounds(57, 180, 220, 370);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setBackground(new Color(0, 0, 0, 0));
		
		JPanel mo = new JPanel();
		mo.setLayout(null);
		mo.setBackground(new Color(0, 0, 0, 0));
		
		JLabel pan = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\sttinglabel.png").getImage().getScaledInstance(224, 370, 0)));
		pan.setBounds(-5, 0, 224, 370);
		
		JButton quitbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\quitbutton.png").getImage().getScaledInstance(119, 33, 0)));
		quitbutton.setLayout(null);
		quitbutton.setBounds(45, 180, 119, 33);
		quitbutton.setBorderPainted(false);
		quitbutton.setFocusPainted(false);
		quitbutton.setContentAreaFilled(false);
		
		JButton howtoplaybutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\howtoplaybutton.png").getImage().getScaledInstance(119, 33, 0)));
		howtoplaybutton.setLayout(null);
		howtoplaybutton.setBounds(45, 130, 119, 33);
		howtoplaybutton.setBorderPainted(false);
		howtoplaybutton.setFocusPainted(false);
		howtoplaybutton.setContentAreaFilled(false);
		
		JButton imforbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\inforbutton.png").getImage().getScaledInstance(119, 33, 0)));
		imforbutton.setLayout(null);
		imforbutton.setBounds(45, 230, 119, 33);
		imforbutton.setBorderPainted(false);
		imforbutton.setFocusPainted(false);
		imforbutton.setContentAreaFilled(false);
		
		JSlider s = new JSlider(0,10,5);
		s.setMinorTickSpacing(1);
		s.setMajorTickSpacing(5);
		s.setPaintTicks(true);
		s.setLabelTable(s.createStandardLabels(10));
		s.setPaintLabels(true);
		s.setSnapToTicks(true);
		
        s.setBounds(48,80,115,40);
        this.add(s); 
		
		mo.add(howtoplaybutton);
		mo.add(imforbutton);
		mo.add(quitbutton);
		mo.add(pan);
		
		this.add(mo);
		this.setResizable(false); 
		
	}
	
}
