package com.kh.project.model.vo;

public class I_Eps3 extends Item implements Runnable{
	Player p;
	
	private int epsGb = 0;	//시간당 추가 쓰레기

	public I_Eps3() {
		super(0, 75);
		epsGb = 5;			//시간당 쓰레기 올라가는거 구현해야 함
	}

	public int getEpsGb() {
		return epsGb;
	}

	public void setEpsGb(int epsGb) {
		this.epsGb = epsGb;
	}

	@Override
	public void run() {
		while(true) {
			p.setMyGarbage(p.getMyGarbage() + 5);
			System.out.println("쓰레기 5개 추가");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
}
