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

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.project.controller.SpawnManager;
import com.kh.project.model.vo.*;
import sun.audio.*;
import java.io.*;

public class InGameView extends JPanel implements Runnable{
	
	File file = new File("src/com/kh/music/띠딩2.wav");
	
	private MainView mf;
	private InGameView inGameView;
	int count = 0;

	JLabel label;
	Image background;
	SpawnManager sm = new SpawnManager();
	Player p;
	
	int Timer = 100;
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
	public InGameView(MainView mf, Player p) {
		System.out.println(file.exists());
		
		this.p = p;
		this.inGameView = this;
		this.mf = mf;

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
		
		gtLabel = new JLabel();
		gtLabel.setText("x 0");
		
		ptLabel = new JLabel();
		ptLabel.setText("x 0");
		
		label.setBounds(0, 0, 1000, 1000);
		label.setLayout(null);
		label.addKeyListener(new Key());
		label.setFocusable(true);
		
		tLabel2.setBounds(40, 25, Timer, 10);
		tLabel.setBounds(10, 10, 40, 40);
		
		gtLabel.setBounds(70, 50, 40, 40);
		gLabel.setBounds( 10,  50, 40 ,40);

		ptLabel.setBounds(70, 90, 40, 40);
		pLabel.setBounds( 10,  90, 40 ,40);


	
		System.out.println("!111");
		gLabel.setBackground(new Color(0,0,0,0));
		tLabel.setBackground(new Color(0,0,0,0));
		pLabel.setBackground(new Color(0,0,0,0));
		tLabel2.setBackground(new Color(0,0,0,0));
		
		this.add(tLabel2);
		this.add(ptLabel);
		this.add(gtLabel);
		
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
		try {
			stream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(stream);
		
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label.repaint();
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
								
								gtLabel.setText(str);
								ptLabel.setText(str2);
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
		
		int[] random = new int[100];
		for(int i = 0;i < random.length; i ++) {
			random[i] = new Random().nextInt(20);
		}
		
		while(count != 100) {
			try {
				int count2 = 0;
				
				while(count2 != 10) {
					
				for(int i = 0; i < count; i ++) {
					System.out.println(sm.getLabels()[0].getLocation());
					int random2 = new Random().nextInt(4);
					if(random2 == 0) {
						sm.getLabels()[i].setLocation((int)sm.getLabels()[i].getLocation().getX() - 3, (int)sm.getLabels()[i].getLocation().getY() - 3);
					} else if(random2 == 1) {
						sm.getLabels()[i].setLocation((int)sm.getLabels()[i].getLocation().getX() + 2, (int)sm.getLabels()[i].getLocation().getY() - 2);
					} else if(random2 == 2) {
						sm.getLabels()[i].setLocation((int)sm.getLabels()[i].getLocation().getX() - 4, (int)sm.getLabels()[i].getLocation().getY() + 4);
					} else if(random2 == 3) {
						sm.getLabels()[i].setLocation((int)sm.getLabels()[i].getLocation().getX() + 5, (int)sm.getLabels()[i].getLocation().getY() + 5);
					}
					
				}
				
				
				label.repaint();
				Thread.sleep(50);
				count2 += 1;
				}
				for(int i = 0; i < count; i ++) {
				sm.getHpLabels()[i].setLocation((int)sm.getLabels()[i].getLocation().getX(), (int)sm.getLabels()[i].getLocation().getY());
				label.add(sm.getHpLabels()[i]);
				label.repaint();
				}
				Thread.sleep(2000);
				for(int i = 0; i < count; i ++) {
					sm.getGarb()[i].setLife(sm.getGarb()[i].getLife()-1);
					if(sm.getLabels()[i].getLocation().getX()>9000) {
//						clip.start();
//						stream = AudioSystem.getAudioInputStream(file);
//						clip = AudioSystem.getClip();
//						clip.open(stream);
					}
					
					
					if(sm.getGarb()[i].getLife() <= 0) {
						sm.getLabels()[i].setBounds(10000,10000,40,40);
						sm.getHpLabels()[i].setBounds(10000,10000,40,40);
					}
					
				}
				
				Timer -= 10;
				tLabel2.setSize(Timer,10);;
				
				count++;
				label.repaint();
				label.add(sm.getLabels()[count]);
				label.add(sm.getHpLabels()[count]);
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
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
			System.out.println("asdasd");
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







