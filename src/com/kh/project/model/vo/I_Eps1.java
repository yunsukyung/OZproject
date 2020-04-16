package com.kh.project.model.vo;

import com.kh.project.view.HomeView;

public class I_Eps1 extends Item implements Runnable{
	
	Player p;
	private int epsGb = 0;	//시간당 추가 쓰레기

	public I_Eps1() {
		super(500, 0);
		epsGb = 1;			//시간당 쓰레기 올라가는거 구현해야 함
	}

	public int getEpsGb() {
		return epsGb;
	}

	public void setEpsGb(int epsGb) {
		this.epsGb = epsGb;
	}

	@Override
	public void run() {
		HomeView.eps1bl = true;
		System.out.println(HomeView.eps1_b.getLocation());
		
		while(true) {
			HomeView.garbage += 1;
			System.out.println("쓰레기 1개 추가");
			HomeView.bg_l.add(HomeView.jTrash);
			HomeView.bg_l.repaint();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
}
