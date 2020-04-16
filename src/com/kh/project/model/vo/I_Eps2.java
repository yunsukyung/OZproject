package com.kh.project.model.vo;

import javax.swing.JLabel;

import com.kh.project.view.HomeView;

public class I_Eps2 extends Item implements Runnable {
	
	
	private int epsGb = 0;	//시간당 추가 쓰레기

	public I_Eps2() {
		super(0, 35);
		epsGb = 3;			//시간당 쓰레기 올라가는거 구현해야 함
	}

	public int getEpsGb() {
		return epsGb;
	}

	public void setEpsGb(int epsGb) {
		this.epsGb = epsGb;
	}

	@Override
	public void run() {

		HomeView.eps2bl = true;
		System.out.println(HomeView.eps2_b.getLocation());
		
		while(true) {
			HomeView.garbage += 3;
			System.out.println("쓰레기 3개 추가");
			HomeView.bg_l.add(HomeView.jTrash);
			HomeView.bg_l.repaint();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
