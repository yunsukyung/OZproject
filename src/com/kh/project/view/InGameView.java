package com.kh.project.view;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.project.controller.SpawnManager;
import com.kh.project.model.vo.*;

public class InGameView extends JPanel implements Runnable{
	private MainView mf;
	private InGameView inGameView;
	int count = 0;
	JLabel label;
	
	Garbage g = new G_Bottle();
	Image background;
	SpawnManager sm = new SpawnManager();
	Player p;
	JLabel la = new JLabel();
	
	public InGameView(MainView mf, Player p) {
		
		this.p = p;
		this.inGameView = this;
		this.mf = mf;


		background = new ImageIcon("src/image/game/InGameImage.png").getImage().getScaledInstance(1000, 640, 0);
		
		label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 1000, 640);
		
		label.addKeyListener(new Key());
		label.setFocusable(true);
		
		this.add(label);
		mf.add(this);
		mf.repaint();
	}
	
	@Override
	public void run() {		

		
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

				for(int i = 0 ;i <= count; i ++) {
					System.out.println(label.getLocation());
					
					if(e.getXOnScreen()<sm.getLabels()[i].getX()+40+label.getX()&&e.getXOnScreen()>sm.getLabels()[i].getX()+15+label.getX()) {
						if(e.getYOnScreen() < sm.getLabels()[i].getY()+80 +label.getY()&& e.getYOnScreen()>=sm.getLabels()[i].getY()+40 + label.getY()) {
							
							if(sm.getGarb()[i] instanceof G_Bottle) {
								((G_Bottle) sm.getGarb()[i]).hpControl(p.getSp());
							}else if(sm.getGarb()[i] instanceof G_Can) {
								((G_Can) sm.getGarb()[i]).hpControl(p.getSp());

							}else if(sm.getGarb()[i] instanceof G_Cigarette) {
								((G_Cigarette) sm.getGarb()[i]).hpControl(p.getSp());
							} else if(sm.getGarb()[i] instanceof G_LoveLetter) {
								((G_LoveLetter) sm.getGarb()[i]).hpControl(p.getSp());
							} else if(sm.getGarb()[i] instanceof G_Mac) {
								((G_Mac) sm.getGarb()[i]).hpControl(p.getSp());
							} else if(sm.getGarb()[i] instanceof G_Paper) {
								((G_Paper) sm.getGarb()[i]).hpControl(p.getSp());
							} else if(sm.getGarb()[i] instanceof G_SnackBag) {
								((G_SnackBag) sm.getGarb()[i]).hpControl(p.getSp());
							}else if(sm.getGarb()[i] instanceof G_Plastic) {
								((G_Plastic) sm.getGarb()[i]).hpControl(p.getSp());
							}

							if(sm.getGarb()[i].getHp() <= 0) {
								sm.getLabels()[i].setBounds(1000,1000,40,40);
								sm.getHpLabels()[i].setBounds(1000,1000,40,40);
							}
						}
					}


				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		while(count != 100) {
			try {

				label.add(sm.getLabels()[count]);
				label.add(sm.getHpLabels()[count]);
				
				for(int i = 0; i < count; i ++) {
					sm.getGarb()[i].setLife(sm.getGarb()[i].getLife()-1);
					if(sm.getGarb()[i].getLife() == 0) {
						sm.getLabels()[i].setBounds(1000,1000,40,40);
						sm.getHpLabels()[i].setBounds(1000,1000,40,40);
					}
					label.repaint();

				}
				Thread.sleep(3000);
				count++;
				System.out.println(sm.getGarb()[0].getLife());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		label.repaint();
	}
	
	class Key implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			Point p = label.getLocation();
			System.out.println(e.getKeyChar());

			if(e.getKeyCode() == 39) {
				label.setLocation(p.x + 20,p.y);
				System.out.println("!23123");
			}
			if(e.getKeyCode() == 37) label.setLocation(p.x - 20,p.y);
			if(e.getKeyCode() == 38) label.setLocation(p.x, p.y - 20);
			if(e.getKeyCode() == 40) label.setLocation(p.x, p.y + 20);


		
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}







