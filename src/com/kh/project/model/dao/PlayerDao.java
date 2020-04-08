package com.kh.project.model.dao;

import java.io.*;
import java.util.ArrayList;

import com.kh.project.model.vo.Player;

public class PlayerDao {

		public PlayerDao() {}
		
		public ArrayList<Player> readPlayerList() {
			ObjectInputStream ois = null;
			ArrayList<Player> list = null;
			
			try {
				ois = new ObjectInputStream(new FileInputStream("player.dat"));
				
				list = (ArrayList<Player>)ois.readObject();
				
			} catch(FileNotFoundException e) {
				System.out.println("");
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			} finally {
				if(ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			return list;
			
		}

		
		public int writePlayerList(ArrayList<Player> list) {
			ObjectOutputStream oos = null;
			
			int result = 0;
			
			try {	
				oos = new ObjectOutputStream(new FileOutputStream("player.dat"));
				
				oos.writeObject(list);
				
				result++;
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			return result;
		}

}