package com.kh.project.model.vo;

public class Eps2 extends Item {
	private int epsGb = 0;	//시간당 추가 쓰레기

	public Eps2() {
		super(0, 35);
		epsGb = 3;			//시간당 쓰레기 올라가는거 구현해야 함
	}

	public int getEpsGb() {
		return epsGb;
	}

	public void setEpsGb(int epsGb) {
		this.epsGb = epsGb;
	}
}
