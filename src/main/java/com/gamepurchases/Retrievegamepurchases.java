package com.gamepurchases;

//Java file for retrieve and update game purchases

public class Retrievegamepurchases {
	private int userId;  //iniializing all private variables
	private int gid;
	private int status; 
	private String purDate;
	
	public Retrievegamepurchases(int userId,int gid,int status, String purDate) { //overload constructor
		this.userId=userId;
		this.gid=gid;
		this.status=status;  //setting varables
		this.purDate=purDate;
	}
	
	public int getuserId() { //returning variables
		return userId;
	}
	
	public int getgid() {
		return gid;
	}
	public int getstatus() {
		return status;
	}
	public String getpurDate() {
		return purDate;
	}
}
