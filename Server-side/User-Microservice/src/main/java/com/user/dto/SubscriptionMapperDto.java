package com.user.dto;

public class SubscriptionMapperDto {
	private int userId;
	private int bookId;
	public SubscriptionMapperDto(int userId, int bookId) {
		super();
		this.userId = userId;
		this.bookId = bookId;
	}
	public SubscriptionMapperDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
}
