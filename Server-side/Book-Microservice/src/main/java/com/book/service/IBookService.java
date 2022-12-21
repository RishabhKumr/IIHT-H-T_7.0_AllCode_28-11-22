package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.book.dto.BookInfodto;
import com.book.entity.Book;
import com.book.repository.IBookInfo;

public interface IBookService {
	
	public String createBook(BookInfodto book,int id);
	
	public Optional<Book> getBookAllDetails(Integer id);
	
	public List<Book> listAllBookInfo();
	
	public String updateBookContent(BookInfodto book,Integer id);
	
	public Book updateBookStatus(Book book,Integer id);
	
	public List<Book> listBookByCategory(String bookCategory);
	
	public String getAuthorNameByBookId(int bookId);
	
	
	public List<Book> getBookByTitle(String bookTitle);
	
	
}
