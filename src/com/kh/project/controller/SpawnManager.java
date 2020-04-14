package com.kh.project.controller;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.model.vo.*;
import com.kh.project.view.MainView;

public class SpawnManager{
	Garbage[] garb = new Garbage[100];
	JLabel[] labels = new JLabel[100];
	JLabel[] hpLabels = new JLabel[100];
	int count = 0;
	
	public SpawnManager() {
		
		for(int i = 0; i < 100; i++) {
			int random = new Random().nextInt(800) + 1;
			if(random > 0 && random < 100) garb[i] = new G_Bottle();
			else if(random >= 100 && random < 200) garb[i] = new G_Mac();
			else if(random >= 200 && random < 300) garb[i] = new G_SnackBag();
			else if(random >= 300 && random < 400) garb[i] = new G_Plastic();
			else if(random >= 400 && random < 500) garb[i] = new G_Paper();
			else if(random >= 500 && random < 600) garb[i] = new G_Cigarette();
			else if(random >= 600 && random < 790) garb[i] = new G_Bottle();
			else if(random >= 790 && random < 795) garb[i] = new G_Mac();
			else garb[i] = new G_LoveLetter();

			
			if(garb[i] instanceof G_Bottle) {
				labels[i] = (((G_Bottle)garb[i]).getLabel());
				hpLabels[i] = (((G_Bottle)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_Can) {
				labels[i] = (((G_Can)garb[i]).getLabel());
				hpLabels[i] = (((G_Can)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_Cigarette) {
				labels[i] = (((G_Cigarette)garb[i]).getLabel());
				hpLabels[i] = (((G_Cigarette)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_LoveLetter) {
				labels[i] = (((G_LoveLetter)garb[i]).getLabel());
				hpLabels[i] = (((G_LoveLetter)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_Mac) {
				labels[i] = (((G_Mac)garb[i]).getLabel());
				hpLabels[i] = (((G_Mac)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_Paper) {
				labels[i] = (((G_Paper)garb[i]).getLabel());
				hpLabels[i] = (((G_Paper)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_Plastic) {
				labels[i] = (((G_Plastic)garb[i]).getLabel());
				hpLabels[i] = (((G_Plastic)garb[i]).getHpLabel());
			}
			if(garb[i] instanceof G_SnackBag) {
				labels[i] = (((G_SnackBag)garb[i]).getLabel());
				hpLabels[i] = (((G_SnackBag)garb[i]).getHpLabel());
			}
		}
	}

	public Garbage[] getGarb() {
		return garb;
	}
	public void setGarb(Garbage[] garb) {
		this.garb = garb;
	}

	public JLabel[] getLabels() {
		return labels;
	}

	public void setLabels(JLabel[] labels) {
		this.labels = labels;
	}

	
	public JLabel[] getHpLabels() {
		return hpLabels;
	}

	public void setHpLabels(JLabel[] hpLabels) {
		this.hpLabels = hpLabels;
	}

	public void test() {
		for(int i = 0 ; i < garb.length; i ++) {
			System.out.println(garb[i].toString());

		}
	}

}
