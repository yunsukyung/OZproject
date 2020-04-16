package com.kh.project.run;

import com.kh.project.model.vo.I_Eps1;
import com.kh.project.model.vo.I_Eps2;
import com.kh.project.model.vo.I_Eps3;
import com.kh.project.view.HomeView;
import com.kh.project.view.InGameView;
import com.kh.project.view.MainView;

public class Run {

	public static Thread t1 = new Thread(new HomeView());
	public static Thread t2;
	public static Thread teps1 = new Thread(new I_Eps1());
	public static Thread teps2 = new Thread(new I_Eps2());
	public static Thread teps3 = new Thread(new I_Eps3());
	
	public static void main(String[] args) {
		new MainView();
	}

}
