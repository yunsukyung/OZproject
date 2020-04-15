package com.kh.project.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.controller.SpawnManager;
import com.kh.project.model.vo.*;
import com.kh.project.view.shop.RewardView;
import com.kh.project.view.shop.TimeOverView1;

import sun.audio.*;
import java.io.*;

public class InGameView extends JPanel implements Runnable{

	File file = new File("src/com/kh/music/띠딩2.wav");

	private MainView mf;
	private InGameView inGameView;
	public static int count = 0;
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img1 = tk.getImage("src/image/game/나무낚싯대이미지.png");
	Image img2 = tk.getImage("src/image/game/파랑낚싯대이미지.png");
	Image img3 = tk.getImage("src/image/game/금낚싯대이미지.png");
	Cursor myCursor1 = tk.createCustomCursor(img1, new Point(10,10), "Rod1");
	Cursor myCursor2 = tk.createCustomCursor(img2, new Point(10,10), "Rod2");
	Cursor myCursor3 = tk.createCustomCursor(img3, new Point(10,10), "Rod3");
	JLabel label;
	Image background;
	SpawnManager sm = new SpawnManager();
	Player p;
	
	public static int Timer = 100;
	public static int timer = 10;
	public static boolean threadtimer = false;
	JLabel tLabel;
	Image tImage;

	JLabel tLabel2;
	Image tImage2;

	JLabel gLabel;
	JLabel gtLabel;
	Image gImage;

	JLabel pLabel;
	JLabel ptLabel;
	Image pImage;

	AudioInputStream stream;
	Clip clip;

	Image setImage;
	JLabel setLabel;
	
	int countGarbege = 0;
	int countPearl = 0;
	
	public InGameView() {}
	public InGameView(MainView mf, Player p) {


		System.out.println(file.exists());

		this.p = p;
		this.inGameView = this;
		this.mf = mf;

		MusicPlayer.MusicStart("src\\com\\kh\\project\\bgm\\인게임.wav");
		this.setLayout(null);
		background = new ImageIcon("src/image/game/InGameBack3.jpg").getImage().getScaledInstance(1000, 1000, 0);
		label = new JLabel(new ImageIcon(background));

		gImage = new ImageIcon("src/image/start/garbagetong.png").getImage().getScaledInstance(30, 30, 0);
		gLabel = new JLabel(new ImageIcon(gImage));

		pImage = new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(30, 30, 0);
		pLabel = new JLabel(new ImageIcon(pImage));

		tImage = new ImageIcon("src/image/game/수쿠버 1.png").getImage().getScaledInstance(30, 30, 0);
		tLabel = new JLabel(new ImageIcon(tImage));

		tImage2 = new ImageIcon("src/image/game/스쿠버2.png").getImage().getScaledInstance(100, 10, 0);
		tLabel2 = new JLabel(new ImageIcon(tImage2));

		setImage = new ImageIcon("src/image/start/settings.png").getImage().getScaledInstance(40, 40, 0);
		setLabel = new JLabel(new ImageIcon(setImage));

		gtLabel = new JLabel();
		gtLabel.setText("x 0");

		ptLabel = new JLabel();
		ptLabel.setText("x 0");

		label.setBounds(0, 0, 1000, 1000);
		label.setLayout(null);
		label.addKeyListener(new Key());
		label.setFocusable(true);

		setLabel.setBounds(300, 20, 40, 40);
		tLabel2.setBounds(40, 25, Timer, 10);
		tLabel.setBounds(10, 10, 40, 40);

		gtLabel.setBounds(70, 50, 40, 40);
		gLabel.setBounds( 10,  50, 40 ,40);

		ptLabel.setBounds(70, 90, 40, 40);
		pLabel.setBounds( 10,  90, 40 ,40);

		if(p.getSp() == 10) setCursor(myCursor1);
		else if(p.getSp() == 30) setCursor(myCursor2);
		else if(p.getSp() == 50) setCursor(myCursor3);

		System.out.println("!111");
		gLabel.setBackground(new Color(0,0,0,0));
		tLabel.setBackground(new Color(0,0,0,0));
		pLabel.setBackground(new Color(0,0,0,0));
		tLabel2.setBackground(new Color(0,0,0,0));

		this.add(tLabel2);
		this.add(ptLabel);
		this.add(gtLabel);
		this.add(setLabel);
		this.add(tLabel);
		this.add(pLabel);
		this.add(gLabel);

		this.add(label);
		mf.add(this);
		mf.repaint();
		mf.revalidate();
	}


	@Override
	public void run() {		
		label.addKeyListener(new Key());
		System.out.println(InGameView.threadtimer);
		try {
			stream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(stream);

			label.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent e) {
				}
				@Override
				public void mousePressed(MouseEvent e) {
					if(e.getXOnScreen()<setLabel.getX()+60+label.getX() + mf.getX()&&
							e.getXOnScreen()>setLabel.getX()+15+label.getX() + mf.getX()) {
						if(e.getYOnScreen() < setLabel.getY()+80 +label.getY() + mf.getY()&&
								e.getYOnScreen()>=setLabel.getY()+40 + label.getY() + mf.getY()) {
							p.setGarbage(p.getGarbage() + countGarbege);
							p.setPearl(p.getPearl() + countPearl);
							new IngameSettingView(mf, p, countGarbege, countPearl);
							
						}
					}
					label.repaint();
					for(int i = 0 ;i <= count; i ++) {
					
						String str = "x "+Integer.toString(countGarbege);
						String str2 = "x " + Integer.toString(countPearl);

						gtLabel.setText(str);
						ptLabel.setText(str2);
						label.repaint();
						if(sm.getGarb()[i] instanceof G_Mac) {
							if(e.getXOnScreen()<sm.getLabels()[i].getX()+100+label.getX() + mf.getX()&&
									e.getXOnScreen()>sm.getLabels()[i].getX()+15+label.getX() + mf.getX()) {
								if(e.getYOnScreen() < sm.getLabels()[i].getY()+120 +label.getY() + mf.getY()&&
										e.getYOnScreen()>=sm.getLabels()[i].getY()+40 + label.getY() + mf.getY()) {
									((G_Mac) sm.getGarb()[i]).hpControl(p.getSp());
									label.repaint();
									if(sm.getGarb()[i].getHp() <= 0 ||((G_Mac)sm.getGarb()[i]).getHps() <= 0) {
										sm.getLabels()[i].setBounds(10000,10000,40,40);
										sm.getHpLabels()[i].setBounds(10000,10000,40,40);
										p.setGarbage(p.getGarbage()+((G_Mac) sm.getGarb()[i]).getHaveGargabe());
										countPearl += ((G_Mac) sm.getGarb()[i]).getHavePearl();
										label.repaint();
									}
								}
							}
						}
						else {
							label.repaint();
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
									} else if(sm.getGarb()[i] instanceof G_Paper) {
										((G_Paper) sm.getGarb()[i]).hpControl(p.getSp());
									} else if(sm.getGarb()[i] instanceof G_SnackBag) {
										((G_SnackBag) sm.getGarb()[i]).hpControl(p.getSp());
									}else if(sm.getGarb()[i] instanceof G_Plastic) {
										((G_Plastic) sm.getGarb()[i]).hpControl(p.getSp());
									}

									if(sm.getGarb()[i].getHp() <= 0) {
										sm.getLabels()[i].setBounds(10000,10000,40,40);
										sm.getHpLabels()[i].setBounds(10000,10000,40,40);
										clip.start();
										try {
											stream = AudioSystem.getAudioInputStream(file);
											clip = AudioSystem.getClip();
											clip.open(stream);
										}catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}

										if(sm.getGarb()[i] instanceof G_Bottle) {
											countGarbege += ((G_Bottle) sm.getGarb()[i]).getHaveGargabe();
										}else if(sm.getGarb()[i] instanceof G_Can) {
											countGarbege += ((G_Can) sm.getGarb()[i]).getHaveGargabe();

										}else if(sm.getGarb()[i] instanceof G_Cigarette) {
											countGarbege += ((G_Cigarette) sm.getGarb()[i]).getHaveGargabe();
										} else if(sm.getGarb()[i] instanceof G_LoveLetter) {
											countGarbege += ((G_LoveLetter) sm.getGarb()[i]).getHaveGargabe();
										} else if(sm.getGarb()[i] instanceof G_Paper) {
											countGarbege += ((G_Paper) sm.getGarb()[i]).getHaveGargabe();
										} else if(sm.getGarb()[i] instanceof G_SnackBag) {
											countGarbege += ((G_SnackBag) sm.getGarb()[i]).getHaveGargabe();
										}else if(sm.getGarb()[i] instanceof G_Plastic) {
											countGarbege += ((G_Plastic) sm.getGarb()[i]).getHaveGargabe();
										}


										label.repaint();

									}
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

				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
			while(count <= 1000) {
				System.out.println("ThreadTimer  : " + threadtimer);
				try {
					if(!threadtimer) {
					label.add(sm.getLabels()[count]);
					label.add(sm.getHpLabels()[count]);
					for(int i = 0; i < count; i ++) {
						sm.getGarb()[i].setLife(sm.getGarb()[i].getLife()-1);
						if(sm.getGarb()[i].getLife() <= 0) {
							sm.getLabels()[i].setBounds(10000,10000,40,40);
							sm.getHpLabels()[i].setBounds(10000,10000,40,40);
						}
					}
					System.out.println("123123123123");
					Thread.sleep(1000);
					Timer -= timer;
					tLabel2.setSize(Timer,10);;
					count++;
					label.repaint();
					
					if(Timer <= 0) {
						p.setGarbage(p.getGarbage() + countGarbege);
						p.setPearl(p.getPearl() + countPearl);
						ChangePanel.changePanel(mf, inGameView, new TimeOverView1(mf, p, countGarbege, countPearl));
						Thread.sleep(3000);
						break;
					}
					}
					else {
						Thread.sleep(10000);
					}
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				
			} 
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	class Key implements KeyListener{
		int size = 30;
		@Override
		public void keyPressed(KeyEvent e) {
			label.add(tLabel);
			label.add(gLabel);
			label.add(pLabel);
			label.add(tLabel2);

			Point p = label.getLocation();
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if(label.getLocation().getX()< -620) label.setLocation(p.x,p.y);
				else if (label.getLocation().getX()>=-620){
					label.setLocation(p.x - size,p.y);
					gLabel.setLocation(gLabel.getX()+ size, gLabel.getY());
					pLabel.setLocation(pLabel.getX()+ size, pLabel.getY());
					tLabel.setLocation(tLabel.getX()+ size, tLabel.getY());
					tLabel2.setLocation(tLabel2.getX()+ size, tLabel2.getY());
				}
			}

			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				if(label.getLocation().getX()>= 0) label.setLocation(p.x,p.y);
				else if (label.getLocation().getX()< 0){
					label.setLocation(p.x + size,p.y);
					gLabel.setLocation(gLabel.getX()- size,gLabel.getY());
					pLabel.setLocation(pLabel.getX()- size, pLabel.getY());
					tLabel.setLocation(tLabel.getX()- size, tLabel.getY());
					tLabel2.setLocation(tLabel2.getX()- size, tLabel2.getY());
				}
			}

			if(e.getKeyCode() == KeyEvent.VK_UP) {
				if(label.getLocation().getY()> 0) label.setLocation(p.x,p.y);
				else if (label.getLocation().getY()< 0){
					label.setLocation(p.x, p.y+ size);
					gLabel.setLocation(gLabel.getX(), gLabel.getY()- size);
					pLabel.setLocation(pLabel.getX(), pLabel.getY()- size);
					tLabel.setLocation(tLabel.getX(), tLabel.getY()- size);
					tLabel2.setLocation(tLabel2.getX(), tLabel2.getY()- size);
				}
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				if(label.getLocation().getY()<= -360) label.setLocation(p.x,p.y);
				else if (label.getLocation().getY()>-360){
					label.setLocation(p.x, p.y - size);
					gLabel.setLocation(gLabel.getX(), gLabel.getY()+ size);
					pLabel.setLocation(pLabel.getX(), pLabel.getY()+ size);
					tLabel.setLocation(tLabel.getX(), tLabel.getY()+ size);
					tLabel2.setLocation(tLabel2.getX(), tLabel2.getY()+ size);
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







