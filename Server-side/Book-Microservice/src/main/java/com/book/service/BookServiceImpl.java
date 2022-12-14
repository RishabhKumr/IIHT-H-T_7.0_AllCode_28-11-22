package com.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dto.BookInfodto;
import com.book.entity.Author;
import com.book.entity.Book;
import com.book.exceptions.BookServiceException;
import com.book.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public String createBook(Book book) {
		Book createBook = null;
		try {
		createBook = bookRepository.save(book);
		}
		catch(Exception ex) {
			throw new BookServiceException("Book creation Failed!");
		}
		return createBook.getBookTitle()+" Created!";
	}

	@Override
	public Optional<Book> getBookAllDetails(Integer id) {
		return bookRepository.findById(id);
	}

	@Override
	public List<Book> listAllBookInfo() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}

	@Override
	public Book updateBookContent(Book book, Integer id) {
		Book existingBook = bookRepository.findById(id).orElseThrow(
				()-> new com.book.exceptions.ResourceNotFoundExceptionHandler("Book","id",id));
		if(existingBook.getBookAuthor().getAuthorId() == book.getBookAuthor().getAuthorId()) {
		existingBook.setBookId(book.getBookId());
		existingBook.setBookTitle(book.getBookTitle());
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookContent(book.getBookContent());
		existingBook.setBookCategory(book.getBookCategory());
		existingBook.setBookActive(book.isBookActive());
		existingBook.setBookDescription(book.getBookDescription());
		existingBook.setBookLogo(book.getBookLogo());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookPublisher(book.getBookPublisher());
		existingBook.setBookPublishedDate(book.getBookPublishedDate());
		bookRepository.save(existingBook);
		}
		else
		{
			throw new BookServiceException("Updation Failed");
		}
		return existingBook;
		
	}

	@Override
	public Book updateBookStatus(Book book, Integer id) {
		Book existingBook = bookRepository.findById(id).orElseThrow(
				()-> new com.book.exceptions.ResourceNotFoundExceptionHandler("Book","id",id));
		existingBook.setBookActive(book.isBookActive());
		bookRepository.save(existingBook);
		return existingBook;
	}

}
