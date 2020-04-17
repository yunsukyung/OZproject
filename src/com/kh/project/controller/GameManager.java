package com.kh.project.controller;

import javax.swing.JLabel;

import com.kh.project.model.vo.M_Garbage;

public class GameManager{
	M_Garbage[] marr = new M_Garbage[10];
	JLabel[] larr = new JLabel[10];
	
	int count = 0;
	
	public GameManager() {
		for(int i = 0; i < 10; i++) {
			marr[i] = new M_Garbage();
			larr[i] = marr[i].getGb_l();
		}
		
	}

	public JLabel[] getLarr() {
		return larr;
	}

	public void setLarr(JLabel[] larr) {
		this.larr = larr;
	}
	
	
	
	
	
}
