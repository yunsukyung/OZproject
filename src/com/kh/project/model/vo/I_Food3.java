package com.kh.project.model.vo;

public class I_Food3 extends Item{

	private int foodSt = 0;	//음식 포만감

	public I_Food3() {
		super(50, 0);
		foodSt = 75;
	}

	public int getFoodSt() {
		return foodSt;
	}

	public void setFoodSt(int foodSt) {
		this.foodSt = foodSt;
	}
	
}