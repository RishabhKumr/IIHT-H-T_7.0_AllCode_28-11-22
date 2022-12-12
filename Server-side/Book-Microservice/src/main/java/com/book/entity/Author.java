package com.book.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int authorId;
	private String authorName;
	private String authorEmail;
	private String authorPassword;
	private List<Book> authorSubscribedBooks;
	private List<Book> authorunSubscribedBooks;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String authorName, String authorEmail, String authorPassword,
			List<Book> authorSubscribedBooks, List<Book> authorunSubscribedBooks) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
		this.authorPassword = authorPassword;
		this.authorSubscribedBooks = authorSubscribedBooks;
		this.authorunSubscribedBooks = authorunSubscribedBooks;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getAuthorPassword() {
		return authorPassword;
	}
	public void setAuthorPassword(String authorPassword) {
		this.authorPassword = authorPassword;
	}
	public List<Book> getAuthorSubscribedBooks() {
		return authorSubscribedBooks;
	}
	public void setAuthorSubscribedBooks(List<Book> authorSubscribedBooks) {
		this.authorSubscribedBooks = authorSubscribedBooks;
	}
	public List<Book> getAuthorunSubscribedBooks() {
		return authorunSubscribedBooks;
	}
	public void setAuthorunSubscribedBooks(List<Book> authorunSubscribedBooks) {
		this.authorunSubscribedBooks = authorunSubscribedBooks;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorEmail=" + authorEmail
				+ ", authorPassword=" + authorPassword + ", authorSubscribedBooks=" + authorSubscribedBooks
				+ ", authorunSubscribedBooks=" + authorunSubscribedBooks + "]";
	}
	
}
