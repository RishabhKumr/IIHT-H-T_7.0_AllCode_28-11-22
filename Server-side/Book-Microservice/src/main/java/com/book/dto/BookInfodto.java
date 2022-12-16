package com.book.dto;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.book.entity.Author;
import com.fasterxml.jackson.annotation.JsonBackReference;

public class BookInfodto {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategory;
	private int bookPrice;
	private String bookPublisher;
	private String bookPublishedDate;
	private String bookLogo;
	private String bookDescription;

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookPublishedDate() {
		return bookPublishedDate;
	}
	public void setBookPublishedDate(String bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}
	public String getBookLogo() {
		return bookLogo;
	}
	public void setBookLogo(String bookLogo) {
		this.bookLogo = bookLogo;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	
	
}