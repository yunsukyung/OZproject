package com.kh.project.view;

public class Monster implements Runnable{
	
	MiniGameView mgv;
	Monster monster;
	
	int xm1;
	int ym1;
	int xm2;
	int ym2;
	int xm3;
	int ym3;
	
	boolean monster1 = false;
	boolean monster2 = false;
	boolean monster3 = false;
	
	public Monster(MiniGameView mgv) {
		this.mgv = mgv;
		int xm1 = mgv.monster_p1.getX();
		int ym1 = mgv.monster_p1.getY();
		int xm2 = mgv.monster_p2.getX();
		int ym2 = mgv.monster_p2.getY();
		int xm3 = mgv.monster_p3.getX();
		int ym3 = mgv.monster_p3.getY();
		
	}
	@Override
	public void run() {
		System.out.println(mgv.monster_p1.getX());
		System.out.println(mgv.monster_p1.getY());
		System.out.println(mgv.monster_p2.getX());
		System.out.println(mgv.monster_p2.getY());
		System.out.println(mgv.monster_p3.getX());
		System.out.println(mgv.monster_p3.getY());
		
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			//1
			if(xm1 >= 297) {
				monster1 = true;
			} else if (xm1 <= 3){
				monster1 = false;
			}
			
			if(!monster1) {
				xm1 += 3;
				mgv.monster_p1.setLocation(xm1, 390);
			} else if (monster1) {
				xm1 -= 3;
				mgv.monster_p1.setLocation(xm1, 390);
			}
			
			
			//2
			if(xm2 >= 297) {
				monster2 = true;
			} else if (xm2 <= 3){
				monster2 = false;
			}
			
			if(!monster2) {
				xm2 += 2;
				mgv.monster_p2.setLocation(xm2, 240);
			} else if (monster2) {
				xm2 -= 2;
				mgv.monster_p2.setLocation(xm2, 240);
			}
			
			
			//3
			if(xm3 >= 297) {
				monster3 = true;
			} else if (xm3 <= 3){
				monster3 = false;
			}
			
			if(!monster3) {
				xm3 += 5;
				mgv.monster_p3.setLocation(xm3, 90);
			} else if (monster3) {
				xm3 -= 5;
				mgv.monster_p3.setLocation(xm3, 90);
			}
			
			
//			
		}
	}
}