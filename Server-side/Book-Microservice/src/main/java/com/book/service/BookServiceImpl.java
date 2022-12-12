package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public String createBook(Book book) {
		Book createBook = bookRepository.save(book);
		return createBook.getBookTitle()+" Created!";
	}

}
