package com.digitalbook.Entity;

public class Book {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategory;
	private int bookPrice;
	private String bookPublisher;
	private String bookPublishedDate;
	private String bookLogo;
	private String bookDescription;
	private String bookContent;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookTitle, String bookAuthor, String bookCategory, int bookPrice,
			String bookPublisher, String bookPublishedDate, String bookLogo, String bookDescription,
			String bookContent) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
		this.bookPublishedDate = bookPublishedDate;
		this.bookLogo = bookLogo;
		this.bookDescription = bookDescription;
		this.bookContent = bookContent;
	}
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
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookCategory="
				+ bookCategory + ", bookPrice=" + bookPrice + ", bookPublisher=" + bookPublisher
				+ ", bookPublishedDate=" + bookPublishedDate + ", bookLogo=" + bookLogo + ", bookDescription="
				+ bookDescription + ", bookContent=" + bookContent + "]";
	}

}
