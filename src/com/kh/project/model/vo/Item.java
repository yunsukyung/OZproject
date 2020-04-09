package com.kh.project.model.vo;

public class Item {
	private int pp = 0;		//pearlPrice
	private int gp = 0;		//garbagePrice
	
	public Item() {}

	public Item(int gp, int pp) {
		super();
		this.gp = gp;
		this.pp = pp;
	}

	public int getPp() {
		return pp;
	}

	public int getGp() {
		return gp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}
	
	
	
}
