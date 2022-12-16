package com.book.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.dto.BookInfodto;
import com.book.entity.Author;
import com.book.entity.Book;
import com.book.repository.IBookInfo;
import com.book.repository.IBookRepository;
import com.book.service.IBookService;

@RestController
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@Autowired
	private IBookRepository bookRepo;
	
	@PostMapping("/createBook")
	public String createBook(@RequestBody Book book)
	{
		String bookName = bookService.createBook(book);
		System.out.println(bookName);
		return bookName;
	}
	
	@GetMapping("/getAllBookDetails/{bookId}")
	public Optional<Book> getBookByAllDetails(@PathVariable Integer bookId){
		Optional<Book> book = bookService.getBookAllDetails(bookId);
		return book;
	}
	
	@GetMapping("/getBookInfo/{bookId}")
	public BookInfodto getBookInfo(@PathVariable Integer bookId){
		 BookInfodto book = new BookInfodto();
	     List<IBookInfo> bookList = bookRepo.findByBookId(bookId);
	     IBookInfo bookInfo = bookList.get(0);
	     book.setBookId(bookInfo.getbookId());
	     book.setBookTitle(bookInfo.getBookTitle());
	     book.setBookAuthor(bookInfo.getbookAuthor().getAuthorName());
	     book.setBookCategory(bookInfo.getbookCategory());
	     book.setBookDescription(bookInfo.getbookDescription());
	     book.setBookLogo(bookInfo.getbookLogo());
	     book.setBookPrice(bookInfo.getbookPrice());
	     book.setBookPublisher(bookInfo.getbookPublisher());
	     book.setBookPublishedDate(bookInfo.getbookPublishedDate());
	     return book;
	}
	
	@GetMapping("/allBooks")
	public List<Book> listAllBooksInfo(){
		
		List<Book> bookList = bookService.listAllBookInfo();	
		return bookList;
	}
	
	@PutMapping("/updateBook/{id}")
	public ResponseEntity<Book> updateBookByAuthor(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.updateBookContent(book, id),HttpStatus.OK);
	}
	
	@PatchMapping("/changeActiveStatus/{id}")
	public ResponseEntity<Book> updateBookStatus(@PathVariable("id") Integer id,@RequestBody Book book ){
		return new ResponseEntity<Book>(bookService.updateBookStatus(book, id),HttpStatus.OK);
	}
	
	@GetMapping("/search")
	public List<Book> getBookByCategoryTitleAuthorPricePublisher(
			@RequestParam String bookCategory,
			@RequestParam String bookTitle,
			@RequestParam int bookPrice,
			@RequestParam String bookPublisher)
	{
		return bookRepo.findByBookCategoryAndBookTitleAndBookPriceAndBookPublisher(bookCategory, bookTitle,bookPrice, bookPublisher);
	}
}
