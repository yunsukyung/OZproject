package com.kh.project.view.book;

import javax.swing.JFrame;

import com.kh.project.view.shop.SettingView;

public class bohoonView {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(0, 0, 360, 640);
		
		//mf.add(new MainBookView(null));
		mf.add(new SettingView(null));
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}