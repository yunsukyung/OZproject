package com.kh.project.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartStoryView extends JPanel{
	JPanel panel;
	public StartStoryView(JFrame mf) {

			

	}
	public static void main(String[] args) {
		JFrame jf = new JFrame("OZ");
		jf.setBounds(0, 0, 370, 760);
		jf.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLocation(0, -40);
		panel.setSize(370, 760);





		Image icon = new ImageIcon("C:\\Users\\s\\git\\OZproject\\src\\image\\start\\background.jpg").getImage().getScaledInstance(570, 760, 0);
		JLabel label = new JLabel(new ImageIcon(icon));


		Image penguin = new ImageIcon("C:\\Users\\s\\git\\OZproject\\src\\image\\start\\penguin.gif").getImage().getScaledInstance(200, 200, 0);
		JLabel label2 = new JLabel(new ImageIcon(penguin));
		label2.setLocation(210, 310);
		label2.setSize(200, 200);
		
		Image text = new ImageIcon("C:\\Users\\s\\git\\OZproject\\src\\image\\start\\text.png").getImage().getScaledInstance(350, 170, 0);
		JLabel label3 = new JLabel(new ImageIcon(text));
		label3.setLocation(100, 480);
		label3.setSize(350, 300);
		label3.setText("여기가어디지?");
		
		Image next = new ImageIcon("C:\\Users\\s\\git\\OZproject\\src\\image\\start\\next.png").getImage().getScaledInstance(30, 40, 0);
		JButton button = new JButton(new ImageIcon(next));
		button.setLocation(375, 660);
		button.setSize(30, 40);
		button.setBackground(Color.red);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false); 

		
		
		
		label.add(button, BorderLayout.CENTER);
		label.add(label2, BorderLayout.CENTER);
		label.add(label3, BorderLayout.CENTER);
		panel.add(label);
		


		jf.add(panel);








		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



}
