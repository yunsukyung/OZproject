package com.kh.project.controller;

import com.kh.project.model.vo.*;

public class ShopManager {
	
	//구매 메소드
	public void Buy(Item thing, Player p) {
		//아이템을 통해 쓰레기와 진주의 가격과 아이템의 효과를 받아온다.
		
		//쓰레기나 진주가 부족한지 판별해 activation 해주기 위한 변수
		boolean act = false;
		
		//보유한 쓰레기나 진주가 가격보다 높으면 실행하고 act에 true 넣어줌
		if(p.getMyGarbage() >= thing.getGp()) {
			p.setMyGarbage(p.getMyGarbage() - thing.getGp());
			act = true;
		} else {
			System.out.println("쓰레기가 부족합니다.");
		}
		if(p.getMyPearl() >= thing.getPp()) {
			p.setMyGarbage(p.getMyGarbage() - thing.getPp());
			act = true;
		} else {
			System.out.println("진주가 부족합니다.");
			
		}
		
		//보유한 쓰레기나 진주가 충분할 경우 true를 전달받아 아이템 효과 수행
		
		//낚시대의 종류가 맞는지 대조 후 공격력 올려줌
		if(act == true) {
			if(thing instanceof I_Rod1) {
				p.setSp(p.getSp() + ((I_Rod1)thing).getRodSp());
			} else if(thing instanceof I_Rod2) {
				p.setSp(p.getSp() + ((I_Rod2)thing).getRodSp());
			} else if(thing instanceof I_Rod3) {
				p.setSp(p.getSp() + ((I_Rod3)thing).getRodSp());
			}	
		}
		
		
		//음식의 종류가 맞는지 대조 후 포만감 올려줌
		if(act == true) {
			if(thing instanceof I_Food1) {
				p.setSatiety(p.getSatiety() + ((I_Food1)thing).getFoodSt());
			} else if(thing instanceof I_Food2) {
				p.setSatiety(p.getSatiety() + ((I_Food2)thing).getFoodSt());
			} else if(thing instanceof I_Food3) {
				p.setSatiety(p.getSatiety() + ((I_Food3)thing).getFoodSt());
			} else if(thing instanceof I_Food4) {
				p.setSatiety(p.getSatiety() + ((I_Food4)thing).getFoodSt());
			}	
		}
		
		
		//발전소 종류가 맞는지 대조 후 시간당 쓰레기 올려줌
		if(act == true) {
			if(thing instanceof I_Eps1) {
				p.setMyGarbage(p.getMyGarbage() + ((I_Eps1)thing).getEpsGb());
			} else if(thing instanceof I_Eps2) {
				p.setMyGarbage(p.getMyGarbage() + ((I_Eps2)thing).getEpsGb());
			} else if(thing instanceof I_Eps3) {
				p.setMyGarbage(p.getMyGarbage() + ((I_Eps3)thing).getEpsGb());
			} else if(thing instanceof I_Eps4) {
				
			}	
		}
		
	}
}
