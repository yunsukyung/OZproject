package com.kh.project.controller;

import java.util.Random;

import com.kh.project.model.vo.*;

public class SpawnManager {
	Garbage[] garb = new Garbage[100];
	public SpawnManager() {
		for(int i = 0; i < 100; i++) {
			int random = new Random().nextInt(800) + 1;
			if(random > 0 && random < 100) garb[i] = new G_Bottle();
			else if(random >= 100 && random < 200) garb[i] = new G_Can();
			else if(random >= 200 && random < 300) garb[i] = new G_SnackBag();
			else if(random >= 300 && random < 400) garb[i] = new G_Plastic();
			else if(random >= 400 && random < 500) garb[i] = new G_Paper();
			else if(random >= 500 && random < 600) garb[i] = new G_Cigarette();
			else if(random >= 600 && random < 790) garb[i] = new G_Bottle();
			else if(random >= 790 && random < 795) garb[i] = new G_Mac();
			else garb[i] = new G_LoveLetter();
		}
		
	}
	public Garbage[] getGarb() {
		return garb;
	}
	public void setGarb(Garbage[] garb) {
		this.garb = garb;
	}
	public void test() {
		for(int i = 0 ; i < garb.length; i ++) {
			System.out.println(garb[i].toString());
			
		}
	}
	 
}
