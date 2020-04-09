package com.kh.project.controller;

import java.util.ArrayList;

import com.kh.project.model.dao.PlayerDao;
import com.kh.project.model.vo.Player;

public class LoginManager {

	private PlayerDao pd = new PlayerDao();

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

	public Player LoginId(String userId, String userPwd) {
		ArrayList<Player> plist = pd.readPlayerList();
		for(int i = 0; i < plist.size(); i ++) {
			if(plist.get(i).getUserId().equals(userId)) {
				if(plist.get(i).getUserPwd().equals(userPwd)) {
					return plist.get(i);
				}
			}
		}
		return null;
	}

	public boolean SearchId(String userName, String Email, String phoneNumber) {

		ArrayList<Player> plist = pd.readPlayerList();
		for(int i = 0 ; i < plist.size() ; i ++) {
			if(plist.get(i).getUserName().equals(userName)) {
				if(plist.get(i).getEmail().equals(Email)) {
					if(plist.get(i).getPhoneNumber().equals(phoneNumber)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
