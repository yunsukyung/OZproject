package com.kh.project.model.vo;

public class Garbage {
	private int hp;
	private int haveGargabe;
	public Garbage(int hp, int haveGargabe) {
		super();
		this.hp = hp;
		this.haveGargabe = haveGargabe;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHaveGargabe() {
		return haveGargabe;
	}
	public void setHaveGargabe(int haveGargabe) {
		this.haveGargabe = haveGargabe;
	}
}