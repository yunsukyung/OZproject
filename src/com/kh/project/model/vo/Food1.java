package com.kh.project.model.vo;

public class Food1 extends Item{

	private int foodSt = 0;	//음식 포만감

	public Food1() {
		super(10, 0);
		foodSt = 25;
	}

	public int getFoodSt() {
		return foodSt;
	}

	public void setFoodSt(int foodSt) {
		this.foodSt = foodSt;
	}
	
}
