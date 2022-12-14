package com.book.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int authorId;
	private String authorName;
	private String authorEmail;
	private String authorPassword;
	@JsonManagedReference
	@OneToMany(mappedBy="bookAuthor")
	private List<Book> authorSubscribedBooks;
	
	public Author() {
	
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String authorName, String authorEmail, String authorPassword,
			List<Book> authorSubscribedBooks){
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorEmail = authorEmail;
		this.authorPassword = authorPassword;
		this.authorSubscribedBooks = authorSubscribedBooks;
		
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
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorEmail=" + authorEmail
				+ ", authorPassword=" + authorPassword + ", authorSubscribedBooks=" + authorSubscribedBooks + "]";
	}
	
	

}
