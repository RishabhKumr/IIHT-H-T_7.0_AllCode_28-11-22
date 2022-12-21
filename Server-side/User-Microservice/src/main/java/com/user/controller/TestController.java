package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.user.entity.book.Book;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	
  @GetMapping("/all")
  public List<Book> allAccess() {
    List book = this.restTemplate.getForObject("http://localhost:8082/book/allBooks", List.class);
    return book;
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('ROLE_READER') or hasRole('ROLE_AUTHOR')")
  public String userAccess() {
    return "User Content.";
  }
  
  @GetMapping("/guest")
  @PreAuthorize("hasRole('ROLE_GUEST')")
  public String guestAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/author")
  @PreAuthorize("hasRole('ROLE_AUTHOR')")
  public String authorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/reader")
  @PreAuthorize("hasRole('ROLE_READER')")
  public String readerAccess() {
    return "Admin Board.";
  }
  
  @GetMapping("/search/{bookTitle}")
  public List<Book> getBookBytitle(@PathVariable String bookTitle){
	  String url = "http://localhost:8082/book/title"+"/"+bookTitle;
	  List book = this.restTemplate.getForObject(url, List.class);
	    return book;
  }
  
  @GetMapping("/getauthername/{bookId}")
  public String getBookAuthorName(@PathVariable int bookId) {
	  String url="http://localhost:8082/book/getauthorname/"+bookId;
	  String authorName = this.restTemplate.getForObject(url, String.class);
	  return authorName;
  }
  
  @GetMapping("/searchbycategory/{bookCategory}")
  public List<Book> searchBookByCategory(@PathVariable String bookCategory){
	  String url="http://localhost:8082/book/searchbycategory/"+bookCategory;
	  List book = this.restTemplate.getForObject(url, List.class);
	  return book;
  }
  @GetMapping("/search")
  public List<Book> getBookByCategoryTitleAuthorPricePublisher(
			@RequestParam String bookCategory,
			@RequestParam String bookTitle,
			@RequestParam int bookPrice,
			@RequestParam String bookPublisher){
	  String url = "http://localhost:8082/book/search?bookCategory="+bookCategory+"&bookTitle="+bookTitle+"&bookPrice="+bookPrice+"&bookPublisher="+bookPublisher;
	  List book = this.restTemplate.getForObject(url, List.class);
	 return book;  
  }
  
  @PutMapping("/admin/updateBook/{id}")
  public ResponseEntity<String> updateBookByAuthor(@PathVariable("id") Integer id, @RequestBody Book book) {
		String url = "http://localhost:8082/book/updateBook/"+id;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(book,headers);
		ResponseEntity<String> status = this.restTemplate.exchange(url, HttpMethod.PUT,entity, String.class);
		return status;
	}
  @GetMapping("/getBookInfo/{bookId}")
	public List<Book> getBookInfo(@PathVariable Integer bookId){
	  String url =  "http://localhost:8082/book/getBookInfo/"+bookId;
	  List book = this.restTemplate.getForObject(url, List.class);
	  return book;
  }
  
  @GetMapping("/getAllBookDetails/{bookId}")
  public Optional<Book> getBookByAllDetails(@PathVariable Integer bookId){
	  String url="http://localhost:8082/book/getAllBookDetails/"+bookId;
	  Optional  book = this.restTemplate.getForObject(url, Optional.class);
	  return book;
  }
  
}