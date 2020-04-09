package com.kh.project.model.vo;

public class Player {
	
	private String userId;		//아이디
	private String userPwd;		//비밀번호
	private String userName;	//이름
	private String phoneNumber;	//휴대폰 번호
	private String email;
	//인벤
	private int pearl;	//진주 갯수
	private int garbage;	//쓰레기 갯수
	private int sp;		//공격력
	private int satiety;	//포만감
	
	public Player() {}

	public Player(String userId, String userPwd, String userName, String phoneNumber, String email, int pearl,
			int garbage, int sp, int satiety) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.pearl = pearl;
		this.garbage = garbage;
		this.sp = sp;
		this.satiety = satiety;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public int getPearl() {
		return pearl;
	}

	public int getGarbage() {
		return garbage;
	}

	public int getSp() {
		return sp;
	}

	public int getSatiety() {
		return satiety;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPearl(int pearl) {
		this.pearl = pearl;
	}

	public void setGarbage(int garbage) {
		this.garbage = garbage;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public void setSatiety(int satiety) {
		this.satiety = satiety;
	}

	
}

