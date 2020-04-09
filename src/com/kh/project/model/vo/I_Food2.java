package com.kh.project.model.vo;

public class I_Food2 extends Item{

	private int foodSt = 0;	//음식 포만감

	public I_Food2() {
		super(30, 0);
		foodSt = 50;
	}

	public int getFoodSt() {
		return foodSt;
	}

	public void setFoodSt(int foodSt) {
		this.foodSt = foodSt;
	}
	
}
