package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.IBookService;

@RestController
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@PostMapping("/createBook")
	public String createBook(@RequestBody Book book)
	{
		String bookName = bookService.createBook(book);
		System.out.println(bookName);
		return bookName;
	}	
}
