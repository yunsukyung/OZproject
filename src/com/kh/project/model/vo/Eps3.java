package com.kh.project.model.vo;

public class Eps3 extends Item {
	private int epsGb = 0;	//시간당 추가 쓰레기

	public Eps3() {
		super(0, 75);
		epsGb = 5;			//시간당 쓰레기 올라가는거 구현해야 함
	}

	public int getEpsGb() {
		return epsGb;
	}

	public void setEpsGb(int epsGb) {
		this.epsGb = epsGb;
	}
}
