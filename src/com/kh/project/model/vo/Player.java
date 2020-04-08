package com.kh.project.model.vo;


public class Player {
	private String userId;		//유저아이디
	private String userPwd;		//유저비밀번호
	private String userName;	//유저 닉네임
	private String phoneNumber;	//핸드폰번호
	private String email;		//이메일
	public static int pearl;	//진주
	public static int garbage;	//쓰레기
	public static int sp;		//공격력
	public static int satiety;	//포만감

	public Player() {}

	public Player(String userId, String userPwd, String userName, String phoneNumber, String email, int pearl,
			int garbage, int sp, int satiety) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		Player.pearl = pearl;
		Player.garbage = garbage;
		Player.sp = sp;
		Player.satiety = satiety;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getPearl() {
		return pearl;
	}
	public static void setPearl(int pearl) {
		Player.pearl = pearl;
	}
	public static int getGarbage() {
		return garbage;
	}
	public static void setGarbage(int garbage) {
		Player.garbage = garbage;
	}
	public static int getSp() {
		return sp;
	}
	public static void setSp(int sp) {
		Player.sp = sp;
	}
	public static int getSatiety() {
		return satiety;
	}
	public static void setSatiety(int satiety) {
		Player.satiety = satiety;
	}

}


