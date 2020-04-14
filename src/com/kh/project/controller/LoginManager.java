package com.kh.project.controller;

import java.util.ArrayList;

import com.kh.project.model.dao.PlayerDao;
import com.kh.project.model.vo.Player;

public class LoginManager {

	private PlayerDao pd = new PlayerDao();

	public boolean SaveId(String str, Player p) {
		ArrayList <Player> plist = pd.readPlayerList();
		
		for(int i = 0 ; i < plist.size(); i ++) {
			if(plist.get(i).getUserId().equals(str)) {
				plist.set(i, p);
				return true;
			}
		}
		return false;
	}
	public void MakeId(Player p) {
		ArrayList <Player> plist = pd.readPlayerList();

		if(plist == null) {
			plist = new ArrayList<Player>();
		}
		plist.add(p);
		
		int result = pd.writePlayerList(plist);
		if(result > 0) {
			System.out.println("Success Sign Up");
		} else {
			System.out.println("Error Sign Up");
		}
		System.out.println(plist.toString());
	}

	public Player LoginId(String userId, char[] userPwd) {
		String str = "";
		for(int i = 0; i < userPwd.length; i ++) {
			str += userPwd[i];
		}

		ArrayList<Player> plist = pd.readPlayerList();
		
		for(int i = 0; i < plist.size(); i ++) {
			
			
			if(plist.get(i).getUserId().equals(userId)) {
				System.out.println("11");
				if(plist.get(i).getUserPwd().equals(str)) {
					
					
					return plist.get(i);
					
				}
			}
		}
		return null;
	}

	public boolean CheckId(String userId) {

		ArrayList<Player> plist = pd.readPlayerList();
		if(plist == null) return true;
		for(int i = 0; i < plist.size(); i ++) {
			if(!plist.get(i).getUserId().equals(userId))return true;
		} return false;
	}
	
	public boolean CheckPwd(char[] userPwd,char[] userPwdc ) {

		String str = "";
		for(int i = 0; i < userPwd.length; i ++) {
			str += userPwd[i];
		}
		
		String str2 = "";
		for(int i = 0; i < userPwdc.length; i ++) {
			str2 += userPwdc[i];
		}
		
		if(str.equals(str2)) return true;
		else return false;
	}
	

	public Player SearchId(String userName, String Email, String phoneNumber) {
		System.out.println("dd");
		ArrayList<Player> plist = pd.readPlayerList();
		for(int i = 0 ; i < plist.size() ; i ++) {
			if(plist.get(i).getUserName().equals(userName)) {
				if(plist.get(i).getEmail().equals(Email)) {
					if(plist.get(i).getPhoneNumber().equals(phoneNumber)) {
						return plist.get(i);
					}
				}
			}
		}
		return null;
	}
}
