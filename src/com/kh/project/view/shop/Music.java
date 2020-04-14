package com.kh.project.view.shop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Music extends Thread{

		@Override
		public void run() {
			try {
				FileInputStream fis = new FileInputStream("src\\com\\kh\\project\\bgm\\게임시작_회원가입_로그인화면-대빙하.wav");
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}

	}

