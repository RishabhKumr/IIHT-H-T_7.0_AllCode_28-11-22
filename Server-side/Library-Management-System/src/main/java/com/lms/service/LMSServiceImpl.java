package com.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Book;
import com.lms.exception.ResourceNotFoundExceptionHandler;
import com.lms.repository.ILMSRepository;

@Service 
public class LMSServiceImpl implements ILMSService{
	
	@Autowired
	ILMSRepository lmsRepo;

	@Override
	public String addBook(Book book) {
		Book  saveBook = lmsRepo.save(book);
		return saveBook.getBookName();
	}

	@Override
	public Optional<Book> getBook(Integer id) {
		return lmsRepo.findById(id);
	}

	@Override
	public List<Book> getAllBook() {
		return lmsRepo.findAll();
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		Book existingBook = lmsRepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundExceptionHandler("Book","id",id));
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookGenre(book.getBookGenre());
		existingBook.setBookName(book.getBookName());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookStatus(book.isBookStatus());
		
		lmsRepo.save(existingBook);
		return existingBook;
		
	}

	@Override
	public Book updateStatBook(Integer id,Book book) {
		Book existingBook = lmsRepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundExceptionHandler("Book","id",id));
		existingBook.setBookStatus(book.isBookStatus());
		lmsRepo.save(existingBook);
		return existingBook;
		
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		lmsRepo.deleteById(id);
		
	}

}
