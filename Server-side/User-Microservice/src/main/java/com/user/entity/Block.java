package com.user.entity;

import javax.persistence.Entity;

@Entity
public class Block {
	private int userId;
	private int bookId;
	public Block(int userId, int bookId) {
		super();
		this.userId = userId;
		this.bookId = bookId;
	}
	public Block() {
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
