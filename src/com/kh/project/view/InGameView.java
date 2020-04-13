package com.kh.project.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.controller.SpawnManager;
import com.kh.project.model.vo.*;

public class InGameView extends JPanel implements Runnable{
	private MainView mf;
	private InGameView inGameView;
	int count = 0;

	JLabel label;
	Image background;
	SpawnManager sm = new SpawnManager();
	Player p;

	JTextField gtf = new JTextField();
	JLabel gLabel;
	Image gImage;

	JTextField ptf = new JTextField();
	JLabel pLabel;
	Image pImage;

	public InGameView(MainView mf, Player p) {

		this.p = p;
		this.inGameView = this;
		this.mf = mf;

		this.setLayout(null);
		background = new ImageIcon("src/image/game/InGameImage.png").getImage().getScaledInstance(1000, 1000, 0);
		label = new JLabel(new ImageIcon(background));

		gImage = new ImageIcon("src/image/start/garbagetong.png").getImage().getScaledInstance(30, 30, 0);
		gLabel = new JLabel(new ImageIcon(gImage));

		pImage = new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(30, 30, 0);
		pLabel = new JLabel(new ImageIcon(pImage));


		label.setBounds(0, 0, 1000, 1000);
		label.setLayout(null);

		label.addKeyListener(new Key());
		label.setFocusable(true);

		gtf.setBounds( 70,  30, 40 ,40);
		gLabel.setBounds( 10,  30, 40 ,40);


		ptf.setBounds( 70,  70, 40 ,40);
		pLabel.setBounds( 10,  70, 40 ,40);


	
//		gtf.setFont(new Font("굴림체", Font.BOLD, 15));
		gtf.setForeground(Color.BLACK);

		gLabel.setBackground(new Color(0,0,0,0));
		gtf.setBackground(new Color(0,0,0,0));
		gtf.setBorder(null);

		pLabel.setBackground(new Color(0,0,0,0));
		ptf.setBackground(new Color(0,0,0,0));
		ptf.setBorder(null);

		this.add(label);
		this.add(pLabel);
		this.add(gLabel);
		mf.add(this);
		mf.repaint();
		mf.revalidate();
	}

	@Override
	public void run() {		
		gLabel.setBackground(new Color(0,0,0,0));
		pLabel.setBackground(new Color(0,0,0,0));
		ptf.repaint();
		gtf.repaint();
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(gtf.getLocation());
				
				for(int i = 0 ;i <= count; i ++) {

					if(e.getXOnScreen()<sm.getLabels()[i].getX()+40+label.getX() + mf.getX()&&
							e.getXOnScreen()>sm.getLabels()[i].getX()+15+label.getX() + mf.getX()) {
						if(e.getYOnScreen() < sm.getLabels()[i].getY()+80 +label.getY() + mf.getY()&&
								e.getYOnScreen()>=sm.getLabels()[i].getY()+40 + label.getY() + mf.getY()) {

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

								if(sm.getGarb()[i] instanceof G_Bottle) {
									p.setGarbage(p.getGarbage()+((G_Bottle) sm.getGarb()[i]).getHaveGargabe());
								}else if(sm.getGarb()[i] instanceof G_Can) {
									p.setGarbage(p.getGarbage()+((G_Can) sm.getGarb()[i]).getHaveGargabe());

								}else if(sm.getGarb()[i] instanceof G_Cigarette) {
									p.setGarbage(p.getGarbage()+((G_Cigarette) sm.getGarb()[i]).getHaveGargabe());
								} else if(sm.getGarb()[i] instanceof G_LoveLetter) {
									p.setGarbage(p.getGarbage()+((G_LoveLetter) sm.getGarb()[i]).getHaveGargabe());
								} else if(sm.getGarb()[i] instanceof G_Mac) {
									p.setGarbage(p.getGarbage()+((G_Mac) sm.getGarb()[i]).getHaveGargabe());
									p.setPearl(p.getPearl() + ((G_Mac) sm.getGarb()[i]).getHavePearl());
								} else if(sm.getGarb()[i] instanceof G_Paper) {
									p.setGarbage(p.getGarbage()+((G_Paper) sm.getGarb()[i]).getHaveGargabe());
								} else if(sm.getGarb()[i] instanceof G_SnackBag) {
									p.setGarbage(p.getGarbage()+((G_SnackBag) sm.getGarb()[i]).getHaveGargabe());
								}else if(sm.getGarb()[i] instanceof G_Plastic) {
									p.setGarbage(p.getGarbage()+((G_Plastic) sm.getGarb()[i]).getHaveGargabe());
								}

								String str = "x "+Integer.toString(p.getGarbage());
								String str2 = "x " + Integer.toString(p.getPearl());
								gLabel.setBackground(new Color(0,0,0,0));
								pLabel.setBackground(new Color(0,0,0,0));
								gtf.setText(str);
								ptf.setText(str2);

								System.out.println("쓰레기 : " + p.getGarbage());
								System.out.println("진주 : " + p.getPearl());

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

				}
				Thread.sleep(3000);
				count++;

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Key implements KeyListener{
		int size = 30;
		@Override
		public void keyPressed(KeyEvent e) {
			label.add(gLabel);
			label.add(pLabel);
			label.add(gtf);
			label.add(ptf);

			Point p = label.getLocation();
			if(e.getKeyCode() == 39) {
				if(label.getLocation().getX()< -600) label.setLocation(p.x,p.y);
				else if (label.getLocation().getX()>=-600){
					label.setLocation(p.x - size,p.y);
					gtf.setLocation(gtf.getX() + size,gtf.getY());
					ptf.setLocation(ptf.getX() + size,ptf.getY());
					gLabel.setLocation(gLabel.getX()+ size, gLabel.getY());
					pLabel.setLocation(pLabel.getX()+ size, pLabel.getY());
				}
			}

			if(e.getKeyCode() == 37) {
				if(label.getLocation().getX()>= 0) label.setLocation(p.x,p.y);
				else if (label.getLocation().getX()< 0){
					label.setLocation(p.x + size,p.y);
					gtf.setLocation(gtf.getX() - size,gtf.getY());
					ptf.setLocation(ptf.getX() - size,ptf.getY());
					gLabel.setLocation(gLabel.getX()- size,gLabel.getY());
					pLabel.setLocation(pLabel.getX()- size, pLabel.getY());
				}
			}

			if(e.getKeyCode() == 38) {
				if(label.getLocation().getY()> 0) label.setLocation(p.x,p.y);
				else if (label.getLocation().getY()< 0){
					label.setLocation(p.x, p.y+ size);
					gtf.setLocation(gtf.getX(), gtf.getY() - size);
					ptf.setLocation(ptf.getX(), ptf.getY() - size);
					gLabel.setLocation(gLabel.getX(), gLabel.getY()- size);
					pLabel.setLocation(pLabel.getX(), pLabel.getY()- size);
				}
			}
			if(e.getKeyCode() == 40) {
				if(label.getLocation().getY()<= -360) label.setLocation(p.x,p.y);
				else if (label.getLocation().getY()>-360){
					label.setLocation(p.x, p.y - size);
					gtf.setLocation(gtf.getX(), gtf.getY() + size);
					ptf.setLocation(ptf.getX(), ptf.getY() + size);
					gLabel.setLocation(gLabel.getX(), gLabel.getY()+ size);
					pLabel.setLocation(pLabel.getX(), pLabel.getY()+ size);
				}
			}
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







