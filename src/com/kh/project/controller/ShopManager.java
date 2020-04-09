package com.kh.project.controller;

import com.kh.project.model.vo.*;

public class ShopManager {
	
	//구매 메소드
	public void Buy(Item thing, Player p) {
		//아이템을 통해 쓰레기와 진주의 가격과 아이템의 효과를 받아온다.
		
		//쓰레기나 진주가 부족한지 판별해 activation 해주기 위한 변수
		boolean act = false;
		
		//보유한 쓰레기나 진주가 가격보다 높으면 실행하고 act에 true 넣어줌
		if(p.getGarbage() >= thing.getGp()) {
			p.setGarbage(p.getGarbage() - thing.getGp());
			act = true;
		} else {
			System.out.println("쓰레기가 부족합니다.");
		}
		if(p.getPearl() >= thing.getPp()) {
			p.setGarbage(p.getGarbage() - thing.getPp());
			act = true;
		} else {
			System.out.println("진주가 부족합니다.");
		}
		
		//보유한 쓰레기나 진주가 충분할 경우 true를 전달받아 아이템 효과 수행
		
		//낚시대의 종류가 맞는지 대조 후 공격력 올려줌
		if(act == true) {
			if(thing instanceof Rod1) {
				p.setSp(p.getSp() + ((Rod1)thing).getRodSp());
			} else if(thing instanceof Rod2) {
				p.setSp(p.getSp() + ((Rod2)thing).getRodSp());
			} else if(thing instanceof Rod3) {
				p.setSp(p.getSp() + ((Rod3)thing).getRodSp());
			}	
		}
		
		
		//음식의 종류가 맞는지 대조 후 포만감 올려줌
		if(act == true) {
			if(thing instanceof Food1) {
				p.setSatiety(p.getSatiety() + ((Food1)thing).getFoodSt());
			} else if(thing instanceof Food2) {
				p.setSatiety(p.getSatiety() + ((Food2)thing).getFoodSt());
			} else if(thing instanceof Food3) {
				p.setSatiety(p.getSatiety() + ((Food3)thing).getFoodSt());
			} else if(thing instanceof Food4) {
				p.setSatiety(p.getSatiety() + ((Food4)thing).getFoodSt());
			}	
		}
		
		
		
		//발전소 종류가 맞는지 대조 후 시간당 쓰레기 올려줌
		if(act == true) {
			if(thing instanceof Eps1) {
				p.setGarbage(p.getGarbage() + ((Eps1)thing).getEpsGb());
			} else if(thing instanceof Eps2) {
				p.setGarbage(p.getGarbage() + ((Eps2)thing).getEpsGb());
			} else if(thing instanceof Eps3) {
				p.setGarbage(p.getGarbage() + ((Eps3)thing).getEpsGb());
			} else if(thing instanceof Eps4) {
				
			}	
		}
		
	}
}
