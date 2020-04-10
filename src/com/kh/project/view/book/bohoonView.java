package com.kh.project.view.book;

import javax.swing.JFrame;

public class bohoonView {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 360, 640);
		
		mf.add(new MainBookView(mf));
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}