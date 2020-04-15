package com.kh.project.run;

import com.kh.project.view.HomeView;
import com.kh.project.view.InGameView;
import com.kh.project.view.MainView;

public class Run {

	public static Thread t1 = new Thread(new HomeView());
	public static Thread t2 = new Thread(new InGameView());
	
	public static void main(String[] args) {
		new MainView();
	}

}
