package com.digitalbook.Entity;

public class GuestUser {
	private String guestName;
	private String guestEmail;
	public String getGuestName() {
		return guestName;
	}
	
	public GuestUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuestUser(String guestName, String guestEmail) {
		super();
		this.guestName = guestName;
		this.guestEmail = guestEmail;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	@Override
	public String toString() {
		return "GuestUser [guestName=" + guestName + ", guestEmail=" + guestEmail + "]";
	}
	
	
}
