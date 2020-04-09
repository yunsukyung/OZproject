package com.kh.project.model.vo;

public class Rod1 extends Item {

	private int rodSp = 0;	//낚시대 공격력

	public Rod1() {
		super(50, 0);
		rodSp = 10;
	}
	
	public int getRodSp() {
		return rodSp;
	}

	public void setRodSp(int rodSp) {
		this.rodSp = rodSp;
	}

	
	
	
}
