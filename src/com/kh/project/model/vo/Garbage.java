package com.kh.project.model.vo;

public class Garbage {
	private int hp;
	private int haveGarbage;
	public Garbage(int hp, int haveGarbage) {
		super();
		this.hp = hp;
		this.haveGarbage = haveGarbage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHaveGargabe() {
		return haveGarbage;
	}
	public void setHaveGargabe(int haveGarbage) {
		this.haveGarbage = haveGarbage;
	}
	@Override
	public String toString() {
		return "Garbage [hp=" + hp + ", haveGarbage=" + haveGarbage + "]\n";
	}
	
}