package com.kh.project.view;

import javax.swing.JPanel;

public class ChangePanel {

	public static void changePanel(MainView mf, JPanel op, JPanel cp) {
		mf.remove(op);
		mf.add(cp);
		mf.repaint();
		System.out.println(mf.getLocation() +  " " + cp.getLocation());
	}
}
