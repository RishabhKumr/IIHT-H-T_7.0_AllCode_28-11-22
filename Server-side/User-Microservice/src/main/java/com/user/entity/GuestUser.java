package com.user.entity;

public class GuestUser {
	private String guestName;
	private String guestMail;
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestMail() {
		return guestMail;
	}
	public void setGuestMail(String guestMail) {
		this.guestMail = guestMail;
	}
	public GuestUser(String guestName, String guestMail) {
		super();
		this.guestName = guestName;
		this.guestMail = guestMail;
	}
	public GuestUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GuestUser [guestName=" + guestName + ", guestMail=" + guestMail + "]";
	}
	
}
