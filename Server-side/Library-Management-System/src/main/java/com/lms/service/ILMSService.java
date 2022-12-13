package com.lms.service;

import java.util.List;
import java.util.Optional;
import com.lms.entity.Book;

public interface ILMSService {
	
	String addBook(Book book);
	
	Optional<Book> getBook(Integer id);
	
	public List<Book> getAllBook();
	
	Book updateBook(Book Book,Integer id);
	
	Book updateStatBook(Integer id, Book status);
	
	public void deleteBook(Integer id);
}
