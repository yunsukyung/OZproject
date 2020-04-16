package com.kh.project.model.vo;


public class Player implements java.io.Serializable{
	
	private static final long serialVersionUID = -663632L;
	private String userId;		//유저아이디
	private String userPwd;		//유저비밀번호
	private String userName;	//유저 닉네임
	private String phoneNumber;	//핸드폰번호
	private String email;		//이메일
	private int myPearl = 0;
	private int myGarbage = 0;
	private int sp = 10;		//공격력
	public static int satiety = 236;	//포만감
	
	private boolean firstEnter = false;
	private boolean eps1 = false;
	private boolean eps2 = false;
	private boolean eps3 = false;
	private boolean eps4 = false;

	public Player() {}

	public Player(String userId, String userPwd, String userName, 
			String phoneNumber, String email) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
	
	public int getSp() {
		return sp;
	}

	public static int getSatiety() {
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
	
	public void setSp(int sp) {
		this.sp = sp;
	}

	public static void setSatiety(int satiety) {
		Player.satiety = satiety;
	}

	public boolean isFirstEnter() {
		return firstEnter;
	}

	public void setFirstEnter(boolean firstEnter) {
		this.firstEnter = firstEnter;
	}

	public int getMyPearl() {
		return myPearl;
	}

	public void setMyPearl(int myPearl) {
		this.myPearl = myPearl;
	}

	public int getMyGarbage() {
		return myGarbage;
	}

	public void setMyGarbage(int myGarbage) {
		this.myGarbage = myGarbage;
	}

}


