package com.kh.project.model.vo;

public class Food4 extends Item{

	private int foodSt = 0;	//음식 포만감

	public Food4() {
		super(0, 5);
		foodSt = 100;
	}

	public int getFoodSt() {
		return foodSt;
	}

	public void setFoodSt(int foodSt) {
		this.foodSt = foodSt;
	}
	
}