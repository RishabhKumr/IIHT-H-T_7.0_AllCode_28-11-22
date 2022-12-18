package com.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lms.entity.Book;
import com.lms.service.ILMSService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LMSController {
	
	@Autowired
	private ILMSService lmsService;
	
	@PostMapping("/add")
	String addBook(@RequestBody Book book) {
		String bookName = lmsService.addBook(book);
		System.out.println(bookName);
		return bookName;
	}
	
	@GetMapping("/allBooks")
	public List<Book> getAllBooks(){
		return lmsService.getAllBook();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(lmsService.updateBook(book, id),HttpStatus.OK);
	}
	
	@PatchMapping("/borrow/{id}")
	public ResponseEntity<Book> updateBookStatus(@PathVariable("id") Integer id,@RequestBody Book book ){
		return new ResponseEntity<Book>(lmsService.updateStatBook(id, book),HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			lmsService.deleteBook(id);
		}
		catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
		}
	
	@GetMapping("/read/{id}")
	public Optional<Book> getBookById(@PathVariable Integer id){
		Optional<Book> book = lmsService.getBook(id);
		return book;
	}
	
}
