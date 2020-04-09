package com.kh.project.model.vo;

public class I_Rod2 extends Item {
	private int rodSp = 0;	//낚시대 공격력

	public I_Rod2() {
		super(150, 0);
		rodSp = 30;
	}

	public int getRodSp() {
		return rodSp;
	}

	public void setRodSp(int rodSp) {
		this.rodSp = rodSp;
	}
}
